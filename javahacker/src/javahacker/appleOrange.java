package javahacker;



	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class appleOrange {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int t = in.nextInt();
	        int a = in.nextInt();
	        int b = in.nextInt();
	        int m = in.nextInt();
	        int n = in.nextInt();
	        int apple_count = 0;
	        int orange_count = 0;
	        
	        int[] apple = new int[m];
	        for(int apple_i=0; apple_i < m; apple_i++){
	            apple[apple_i] = in.nextInt();
	        }
	        int[] orange = new int[n];
	        for(int orange_i=0; orange_i < n; orange_i++){
	            orange[orange_i] = in.nextInt();
	        }
	        
	        for (int i = 0; i < apple.length; i++){
	            int close = s - a;
	            int far = t - a ;
	            System.out.println(close);
	            System.out.println(far);
	            //n apple[i];
	            //s t house
	                       // a 
	            if (close > apple[i] && far < apple[i]){
	                //m
	                apple_count++;
	            }
	        }
	        
	        
	        
	       // for(int i = 0; i < orange.length; i++){
	        //    int count;
	            
	            
	            //b
	      //      if (count > s && count < t){
	    //            orange_count++;
	  //          }
//	        }
	        
	        System.out.println(apple_count);
	        System.out.println(orange_count);
	   
	        
	    }
	}
