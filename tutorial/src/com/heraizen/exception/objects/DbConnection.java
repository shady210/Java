package com.heraizen.exception.objects;

public class DbConnection {

	static public int count = 0;
	
	public static DbConnection getObject() {
		
		if(count > 1) {
			return null;
		}else {
			return new DbConnection();
		}
		
	}

	private DbConnection() {
		count++;
		System.out.println(count);
	}
}