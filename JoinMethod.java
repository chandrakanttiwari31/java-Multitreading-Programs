package multithreading;

public class JoinMethod extends Thread{

	
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
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().isAlive());
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		JoinMethod s=new JoinMethod();
	       s.start();
	       s.setPriority(7);
	       s.setName("My Thread");
			
			JoinMethod s1=new JoinMethod();
			s1.start();
			System.out.println(s.isAlive());
			
			try {
				s.join();
				s1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(s.isAlive());
			
			System.out.println("Main Thread Exit");		
			
		}

}
