package multithreading;

public class Current_thread_method 	extends Thread{

		
		public void run()
		{
			for(int i=1;i<=5;i++)
			{
			System.out.println(Thread.currentThread());
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
			
			System.out.println(Thread.currentThread());
			Current_thread_method s=new Current_thread_method();
			s.setName("child");
			s.setPriority(7);
				
				s.start();
								Current_thread_method s1=new Current_thread_method();
				s1.start();
				
			}
		}



	
	
	

//	public static void main(String[] args) {
//		Thread t=Thread.currentThread();
//		System.out.println("Current Thread is="+t);
//		
//		
//		t.setName("java Thread");;
//		System.out.println("After change name="+t);
//		
//		try
//		{
//		for(int i=0;i<=5;i++)
//		{
//			
//			System.out.println(i);
//			System.out.println("thread sleeping");
//			Thread.sleep(2000);
//			System.out.println("Thread wake up");
//		}
//	}
//		catch(InterruptedException e)
//		{
//			
//			System.out.println("main thread interrupted");
//		}
//	}
//
//}
