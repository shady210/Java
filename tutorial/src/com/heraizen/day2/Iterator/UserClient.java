package com.heraizen.day2.Iterator;

public class UserClient {

	public static void main(String[] args) {
		
		MyIterator it = UserList.getIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
