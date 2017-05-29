package javahacker;

public class myRunable implements Runnable{
	
	boolean IsRunning = true;

@Override
public void run(){
	//here your code
	
	int count=0;
	while(IsRunning){
		System.out.println(count);
		count++;
		try{
			Thread.sleep(1000);
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		
		
	}
}
}


