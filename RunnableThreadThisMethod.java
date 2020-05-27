package multithreading;

public class RunnableThreadThisMethod implements Runnable{
	public RunnableThreadThisMethod()
	{
		Thread t1=new Thread(this);
		t1.start();
		
	}

	
	public RunnableThreadThisMethod(String name)
	{
		Thread t2=new Thread(this,name);
		t2.start();
		
	}

	
	public RunnableThreadThisMethod(ThreadGroup tg)
	{
		Thread t3=new Thread(tg,this);
		t3.start();
		
	}
	
	
	public RunnableThreadThisMethod(ThreadGroup tg,String name)
	{
		Thread t4=new Thread(tg,this,name);
		t4.start();
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread()+": Run Child class");
	}
	
	public static void main(String[] args) {
		
		
		RunnableThreadThisMethod r=new RunnableThreadThisMethod();
		
		RunnableThreadThisMethod r2=new RunnableThreadThisMethod("My Thread");
		RunnableThreadThisMethod r3=new RunnableThreadThisMethod(new ThreadGroup("My Group"));
		
		RunnableThreadThisMethod r4=new RunnableThreadThisMethod(new ThreadGroup("your group"),"your thread");
	}


	

}
