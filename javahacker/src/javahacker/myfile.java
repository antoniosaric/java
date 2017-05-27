package javahacker;

import java.io.FileWriter;

public class myfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileWriter fo=new FileWriter("test.txt");
			fo.write("welcome to new java file");
			fo.close();
		} catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		

	}

}
