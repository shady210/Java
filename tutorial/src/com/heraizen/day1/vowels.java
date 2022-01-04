package com.heraizen.day1;
import java.util.*;
public class vowels {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string you want to check:");
	    String a = s.nextLine();
	    String vowConst = a.toLowerCase();
	    int count = 0,count1 = 0;
	    int n = a.length();
	    for (int i = 0;i< n;i++)
	    {
	    	if(vowConst.charAt(i)=='a'||vowConst.charAt(i)=='e'||vowConst.charAt(i)=='o'||vowConst.charAt(i)=='u'||vowConst.charAt(i)=='i')
	    	{
	    		count++;
	    	}
	    	else
	    	{
	    		count1++;
	    	}
	    }
	    System.out.println(count);
	    System.out.println(count1);
	}

}
