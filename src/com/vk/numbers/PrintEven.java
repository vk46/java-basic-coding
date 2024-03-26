package com.vk.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEven {

	public static void returnEevenList(List<Integer> list){
		if(list == null || list.size()==0){
			System.out.println("Invalid input");
			return;
		}
		List<Integer> result =  list.stream()
				.filter(num -> num%2==0)
				.collect(Collectors.toList());
		System.out.println(result);
	}

	public static void main(String[] args) {
//		returnEevenList(null);
//		returnEevenList(Arrays.asList());
		returnEevenList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	}

}