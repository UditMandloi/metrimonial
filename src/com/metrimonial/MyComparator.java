/*package com.metrimonial;

import java.util.Comparator;

public class MyComparator implements Comparator {

	SandipChoice sc = new SandipChoice("Teli", 22, "fair", 5.0);

	// SandipChoice sc;
	public static void main(String[] args) {
		System.out.println();
	}

	@Override
	public int compare(Object o1, Object o2) {
		RegistrationDTO reg1 = (RegistrationDTO) o1;
		RegistrationDTO reg2 = (RegistrationDTO) o2;
		Double i1 = reg1.getHeight() - sc.height;
		Double i2 = reg2.getHeight() - sc.height;
		if (i1 < 0) {
			i1 = i1 * -1;
		}
		if (i2 < 0) {
			i2 = i2 * -1;
		}

		if (i1 > i2 | i1 == i2) {
			return 1;
		} else {
			return -1;
		}

	}

}
*/