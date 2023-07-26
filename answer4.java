package com.assignment9;
import java.util.*;
public class answer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 Scanner sc = new Scanner(System.in); 
		  String s = sc.next(); 
		 
		  int c= 0; 
		   
		  if(s.charAt(0)==')') { 
		   System.out.println("not balanced"); 
		   System.exit(0); 
		  } 
		   
		  for(int i=0;i<s.length();i++) { 
		   char chr = s.charAt(i); 
		   if(chr=='(') { 
		    c++; 
		   } 
		   if(chr==')') { 
		    c--; 
		   } 
		   if(c<0) 
		    break; 
		  } 
		   
		  if(c==0) { 
		   System.out.println("balanced"); 
		  } 
		  else { 
		   System.out.println("not balanced"); 
		  } 
		   
		 } 


}
