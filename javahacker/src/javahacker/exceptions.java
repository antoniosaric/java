package javahacker;
import java.util.Scanner;

public class exceptions {
	
	static Scanner reader=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = reader.nextInt();
//		System.out.println(x);
		
		try {
			//black of code
			int x = reader.nextInt();
			System.out.println(x);
		}
		catch (Exception ex){
			System.out.println(ex.getMessage());
			
		}
//		finally {
//			//additional code here if you want a finally
//		}
		
		
	}

}
