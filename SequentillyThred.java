package multithreading;

public class SequentillyThred  extends Thread{
	
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
		{
			SequentillyThred s=new SequentillyThred();
			s.run();
			
			SequentillyThred s1=new SequentillyThred();
			s1.run();
			
		}
	}



}
