package coustom.sorting.practice;

import java.util.Objects;

public class Employee {
	Integer id;
	String name,dept;
	
	
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public Employee() {
		super();
	}
	public int hashCode() {
	return Objects.hash(id,name,dept);
	}
	public boolean equals(Object obj) {
		
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		Employee other=(Employee)obj;
		System.out.println("change");
		System.out.println("change from git");
		System.out.println("change from git fetch");
		return this.id==other.id && this.name.equals(other.name) && this.dept.equals(other.dept);
		
	}
	public String toString() {
		return "Employee[name - "+name+",id - "+id+",dept - "+dept+"]";
		
	}
	
	

}
