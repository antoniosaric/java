//package javahacker;
//
//import java.util.Scanner;
//
//public class race {
//
//	private static Scanner in;
//
//	public static void main(String[] args) {
//        in = new Scanner(System.in);
//        int x1 = in.nextInt();
//        int v1 = in.nextInt();
//        int x2 = in.nextInt();
//        int v2 = in.nextInt();
//        int position1 = x1;
//        int position2 = x2; 
//        int distance = 0;
//
//        
//        for (int i = 0; distance > -1; i++ ){
//
//        position1 = position1 + v1;
//        position2 = position2 + v2;
//
//            distance = Math.abs(position1 - position2);
//
//            if (position1 == position2){
//                System.out.print("YES");
//                break;
//            }
//            
//            if (distance <= 0){
//                System.out.print("NO");
//                break;
//            }      
//        }
//
//	}
//
//}
