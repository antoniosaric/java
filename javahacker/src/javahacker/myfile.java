package javahacker;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class myfile {
	
	static Scanner reader=new Scanner(System.in);
	static Scanner reader1=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1 - to write\n2- to read");
		int op=reader.nextInt();
		switch(op){
		case 1: //write
			System.out.println("enter to save to file");
			String text=reader1.nextLine();
			FileWriterOn(text);
			break;
			
		case 2: // read
			
			FileReaderOn();
			break;
		
		}
		

		

	}
	
	static void FileReaderOn(){
		try{
		FileReader fin=new FileReader("test.txt");
		int c;
		while((c=fin.read())!=-1){
			System.out.print((char) c);
		}
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
			
		}
	}
	
	
	static void FileWriterOn(String str){
		try{
			FileWriter fo=new FileWriter("test.txt");// FileWriter("test.txt", true); adding true allows the file to be appended. 
			fo.write(str);
			fo.close();
		} catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

}
