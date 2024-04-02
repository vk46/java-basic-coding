package com.vk.collections;

import com.vk.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Complete the code
public class SortAndComparator
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

		studentList.sort((s1, s2) -> {
            if (s2.cgpa() > s1.cgpa()) {
                return 1;
            } else if (s2.cgpa() < s1.cgpa()) {
                return -1;
            }
            return s1.fname().compareTo(s2.fname());
        });

		for(Student st: studentList){
			System.out.println(st.fname());
		}
		
		in.close();
	}
}
