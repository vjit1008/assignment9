package com.assignment9;

public class answer20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello my name is aditya";
		String[] arr = s1.split(" ");
		String ans="";
		for(String a:arr) 
		{
		 ans+=a.substring(0,1).toUpperCase()+a.substring(1)+" ";
		 }
		System.out.println(ans);
	}

}
