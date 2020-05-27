package multithreading;

public class ByExtends_threadClass 	extends Thread {

		
		Thread t;
		public ByExtends_threadClass()
		{
			super();
			
		}
		public ByExtends_threadClass(String tname)
		{
			super(tname);
			
		}
		public ByExtends_threadClass(ThreadGroup grp,String name)
		{
			super(grp,name);
			start();
			
		}
		
		
		public void run()
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(Thread.currentThread()+" "+i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		
		
		
		public static void main(String[] args) {
			
			
			ByExtends_threadClass e1=new ByExtends_threadClass();
			e1.start();
			ByExtends_threadClass e2=new ByExtends_threadClass("Child-1");
			e2.start();
			ThreadGroup tr=new ThreadGroup("My Group");
			ByExtends_threadClass e3=new ByExtends_threadClass(tr,"child 2");
			
		}
}
