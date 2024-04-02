package com.vk.files;

import java.io.FileWriter;
import java.io.IOException;

public class AddRowCSV {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		String fileCSV = "C:/Users/vinay.palla/Downloads/job_status.csv";
		try {
			FileWriter fw = new FileWriter(fileCSV,true);
			String [] record = "No Job".split(",");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.fillInStackTrace();
		}
	}
	
}
