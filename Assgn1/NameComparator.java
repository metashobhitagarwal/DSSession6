package Assgn1;

import java.util.Comparator;
/*
 * This class compares the names of employees
 */
public class NameComparator implements Comparator<Employee> {

	/**
	 * Overriding compare method and 
	 * Comparing according to employee names
	 */
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareToIgnoreCase(o2.getName());
	}

}