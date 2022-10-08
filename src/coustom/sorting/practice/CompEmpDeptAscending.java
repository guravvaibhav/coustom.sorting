package coustom.sorting.practice;
import java.util.*;
public class CompEmpDeptAscending implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		return e1.dept.compareTo(e2.dept); 
	}

}
