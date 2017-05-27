package com.interviewquestions;

//swap two numbers
//
//How to swap two numbers without using a temporary variable?
//
//Note: got this question when i was in interview with Micorosoft 




public class MicrosoftQuestion {
	
		public static void main(String[] args){
		   int x=10;
		   int y=15;

	x = x + y; //now x is 25 and y is 15
	y = x - y; //now x is 15 but y is 10 (original value of x)
	x = x - y; //now x is 15 and y is 10, numbers are swapped
		    
		}
	}


