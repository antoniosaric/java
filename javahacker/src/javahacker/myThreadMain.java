package javahacker;

public class myThreadMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		myThread t=new myThread();
		t.start();
		System.out.println("thread is working");
		
		Thread.sleep(6000);
		
		//t.IsRunning=false;
		
		
		
		
		myRunable r = new myRunable();
		Thread tr= new Thread(r);
		tr.start();
	}

}
