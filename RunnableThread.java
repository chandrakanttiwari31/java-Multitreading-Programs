package multithreading;

public class RunnableThread  implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread()+" "+i);
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		RunnableThread r1=new RunnableThread();
		Thread t1=new Thread(r1);   //creating Thread
		t1.start();
		
		
		RunnableThread r2=new RunnableThread();
		Thread t2=new Thread(r2,"My Thread");
		t2.start();
		
		RunnableThread r3=new RunnableThread();
		
		ThreadGroup t3=new ThreadGroup("My Group");
		Thread t33=new Thread(t3,r3);
		t33.start();
		
		
		RunnableThread r4=new RunnableThread();
		ThreadGroup t4=new ThreadGroup("your Group");
		Thread t44=new Thread(t4,r4,"Your Thread");
		t44.start();
		
		
		
	}

}
