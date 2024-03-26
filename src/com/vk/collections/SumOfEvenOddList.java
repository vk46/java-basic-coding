package com.vk.collections;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenOddList {

	public static void main(String[] args) {

		List<Integer> ls = Arrays.asList(3,5,6,8,9);
		int sumEven = ls.stream().filter(num -> num%2==0).mapToInt(Integer::intValue).sum();
		int sumOdd = ls.stream().filter(num -> num%2!=0).mapToInt(Integer::intValue).sum();
		System.out.println(sumEven);
		System.out.println(sumOdd);
	}
}
