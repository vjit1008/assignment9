package com.assignment9;

public class answer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a="caser ciper implement";
		
		String s1=" ";
		for(int i=0;i<a.length();i++) {
			
		char b=a.charAt(i);
		
		  b+=3; 
		  s1+=b;
		  System.out.print(b+" ");
		}
		
		for(int i=a.length();i>0;i--) {
			
			char s=s1.charAt(s1.length()-i);
			
			  s+=3; 
			  s1+=s;
			System.out.print(s);
			}
	}

}
