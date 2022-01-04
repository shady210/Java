package com.heraizen.day1;
import java.util.*;
public class stringPrac {

	public static void main(String[] args) {

				Scanner s = new Scanner(System.in);
				System.out.print("Enter the string you want to check:");
			    String a = s.nextLine();
			    int n = a.length();
			    System.out.print("Length of string: "+ n+"\n");
			    
			    String upr = a.toUpperCase();
			    System.out.print("Uppercase string: "+ upr+"\n");
			    String lwr = a.toLowerCase();
			    System.out.print("Lowercase string: "+ lwr+"\n");
			    
			    String rev ="";
			      for ( int i = n - 1; i >= 0; i-- )
			      {
			         rev = rev + a.charAt(i);
			      }
			      if (a.equals(rev))
				         System.out.println(a+" is a palindrome");
				  else
				         System.out.println(a+" is not a palindrome");
			    
			}


	}

