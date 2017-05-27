package com.interviewquestions;

//match words
//
//You have to implement app that find match words character. For example if you have word "loop" you have to find all words that have  "l,o,o,p"  like "loop", "pool", "lopo".
//
//  You have String of words named "words" you could add more words to search in.
//
//
//
//Note: got this question when i had interview Company deal with Algorithms

public class AlgorithmQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Search="loop";
		String[] words={"loop","pool","lopo","book","kobo"};
	    for(int i = 0; i <= words.length - 1; i++)
	    {
	        if (Search.contains(words[i]))
	        {
	            System.out.println(words[i]);
	        }
	    }
		

	}

}
