package coustom.sorting.practice;

import java.util.*;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1=new Employee(170,"ram","account");
		Employee e2=new Employee(123,"sham","engineering");
		Employee e3=new Employee(78,"sita","testing");
		Employee e4=new Employee(193,"shree","account");
		
//		TreeSet t=new TreeSet(new CompEmpIdAscending());
		TreeSet t=new TreeSet(new CompEmpIdDescending());
//		TreeSet t=new TreeSet(new CompEmpNameAscending());
//		TreeSet t=new TreeSet(new CompEmpNameDescending());
//		TreeSet t=new TreeSet(new CompEmpDeptAscending());
//		TreeSet t=new TreeSet(new CompEmpDeptDescending());	
		t.add(e4);
		t.add(e1);
		t.add(e3);
		t.add(e2);
		System.out.println(t);
	}



}
