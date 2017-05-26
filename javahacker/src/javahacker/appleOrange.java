//package javahacker;
//
//	import java.util.*;
//
//	public class appleOrange {
//
//	    private static Scanner in;
//
//		public static void main(String[] args) {
//	        in = new Scanner(System.in);
//	        int s = in.nextInt();
//	        int t = in.nextInt();
//	        int a = in.nextInt();
//	        int b = in.nextInt();
//	        int m = in.nextInt();
//	        int n = in.nextInt();
//	        int apple_count = 0;
//	        int orange_count = 0;
//	        
//	        int[] apple = new int[m];
//	        for(int apple_i=0; apple_i < m; apple_i++){
//	            apple[apple_i] = in.nextInt();
//	        }
//	        int[] orange = new int[n];
//	        for(int orange_i=0; orange_i < n; orange_i++){
//	            orange[orange_i] = in.nextInt();
//	        }
//	        
//	        for (int i = 0; i < apple.length; i++){
//	            int close = s - a;
//	            if(close < 0){
//	            	close = close * -1;;
//	            }
//
//	            int far = t - a ;
//
//	            if (apple[i] > 0){
//	            if ( apple[i] >= close && apple[i] <= far){
//	                apple_count++;
//	            }
//	        }
//	        }
//	        	        
//	        for(int i = 0; i < orange.length; i++){
//	            int far = s - b;
//	            if(far < 0){
//	            	far = Math.abs(far);
//	            }
//	            int close = t - b ;
//	            if(close < 0){
//	            	close = Math.abs(close);
//	            }
//
//	            if (orange[i] < 0){
//	            	int positive = Math.abs(orange[i]);
//	            	
//	            if (positive > close && positive < far){
//          		
//	                orange_count++;
//
//	            }
//	            }
//	        }
//	        
//	        System.out.println(apple_count);
//	        System.out.println(orange_count);
//	   
//	    }
//	}
