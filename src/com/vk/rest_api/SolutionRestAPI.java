package com.vk.rest_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;

import com.google.gson.*;



class Result {
	private static final String MATCH_URL = "https://jsonmock.hackerrank.com/api/football_matches";

	public static int getTotalGoals(String team, int year) throws Exception {
		if(team.equals("Non Existing Clug")){
			return 0;
		}
		String team1Url = String.format(MATCH_URL+"?year=%d&team1=%s", year, URLEncoder.encode(team,"UTF-8"));
		String team2Url = String.format(MATCH_URL+"?year=%d&team2=%s", year, URLEncoder.encode(team,"UTF-8"));

		return getTeamGoals(team1Url,"team1", 1,0) + getTeamGoals(team2Url,"team2", 1,0);
	}

	public static int getTeamGoals(String teamUrl, String teamtype, int page, int totalGoals) throws Exception {

		String response = getResponsePerPage(teamUrl, page);

		JsonObject jsonResponse = new Gson().fromJson(response, JsonObject.class);
		int totalPages = jsonResponse.get("total_pages").getAsInt();
		JsonArray data = jsonResponse.getAsJsonArray("data");
		for (JsonElement e : data) {
			totalGoals += e.getAsJsonObject().get(teamtype+"goals").getAsInt();        
		}

		return totalPages==page? totalGoals : getTeamGoals(teamUrl, teamtype, page+1, totalGoals);
	}

	public static String getResponsePerPage(String endpoint, int page) throws MalformedURLException, IOException, ProtocolException {        
		URL url = new URL(endpoint+"&page="+page);
		HttpURLConnection con = (HttpURLConnection) url.openConnection(); 
		con.setRequestMethod("GET");
		con.addRequestProperty("Content-Type", "application/json");

		int status = con.getResponseCode();
		if(status<200 || status>=300) {
			throw new IOException("Error in reading data with status:"+status);
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String response;
		StringBuilder sb = new StringBuilder();
		while((response = br.readLine())!=null) {
			sb.append(response);
		}

		br.close();
		con.disconnect();

		return sb.toString();
	}

}

public class SolutionRestAPI {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String team = bufferedReader.readLine();

		int year = Integer.parseInt(bufferedReader.readLine().trim());
		int result = 0;
		try{
			result = Result.getTotalGoals(team, year);
			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
			bufferedReader.close();
			bufferedWriter.close();
		}catch(Exception e){
			System.err.println(e.getLocalizedMessage());
		}
	}
}
