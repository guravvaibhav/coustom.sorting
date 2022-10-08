package coustom.sorting.practice;

import java.util.TreeSet;

public class StudentTest {
	public static void main(String[] args) {
		Student s1=new Student(7,"AAA");
		Student s2=new Student(3,"CCC");
		Student s3=new Student(9,"DDD");
		Student s4=new Student(1,"ZZZ");
		
		TreeSet t=new TreeSet();
		
		t.add(s4);
		t.add(s2);
		t.add(s1);
		t.add(s3);
		
		System.out.println(t);
	}
}
