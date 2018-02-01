package com.metrimonial;

import java.util.Comparator;

public class MyComparator1 implements Comparator {
     //static int i1;
		@Override
	public int compare(Object o1, Object o2) {
		RegistrationDTO reg1 = (RegistrationDTO) o1;
		RegistrationDTO reg2 = (RegistrationDTO) o2;
		Integer i1 =reg1.getMatch();
		Integer i2 =reg2.getMatch();
		

			return -i1.compareTo(i2);
	}

		/*public static void main(String[] args) {
			RegistrationDTO reg = null;
			System.out.println(i1);
		}*/

}
