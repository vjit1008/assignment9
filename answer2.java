package com.assignment9; 
 
import java.util.Scanner; 
 
public class answer2 { 
 
 public static void main(String[] args) { 
  
  Scanner sc=new Scanner(System.in); 
       System.out.println("Enter a word"); 
       String s=sc.nextLine(); 
       String s1="is"; 
        
       int i=0; 
       int c=0; 
       while(s.indexOf(s1,i)!=-1) { 
        i=s.indexOf(s1,i)+s1.length(); 
    
        c++; 
       } 
       System.out.println(c); 
        
        
 } 
 
}