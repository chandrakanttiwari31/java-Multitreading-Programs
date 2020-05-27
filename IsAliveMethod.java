package multithreading;

public class IsAliveMethod extends Thread{

	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().isAlive());
		IsAliveMethod s=new IsAliveMethod();
		
			
			s.start();
			System.out.println(s.isAlive());
			
			IsAliveMethod s1=new IsAliveMethod();
			s1.start();
			System.out.println("Main Thread Exit");
			
		}

}
