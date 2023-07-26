package com.assignment9;

public class answer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String in = "121251";
	    int r;
	    int sum = 0;
	    int t = Integer.parseInt(in);

	    for (; t > 0; t = t / 10) {
	        r = t % 10;
	        sum = sum * 10 + r;
	    }

	    if (t == sum)
	        System.out.print(t + " palindrome number");
	    else
	        System.out.print(t + " not palindrome number");

	}
}
