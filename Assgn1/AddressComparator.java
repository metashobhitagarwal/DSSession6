package Assgn1;

import java.util.Comparator;

/*
 * This class compares the addresses of employees
 */
public class AddressComparator implements Comparator<Employee> {
	
	/**
	 * Overriding compare method and 
	 * Comparing according to employee Address
	 */
	public int compare(Employee o1, Employee o2) {
		return o1.getAddress().compareToIgnoreCase(o2.getAddress());
	}
}