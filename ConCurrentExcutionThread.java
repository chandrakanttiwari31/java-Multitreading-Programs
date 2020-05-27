package multithreading;

public class ConCurrentExcutionThread extends Thread{

	
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
			ConCurrentExcutionThread s=new ConCurrentExcutionThread();
			s.start();
			
			ConCurrentExcutionThread s1=new ConCurrentExcutionThread();
			s1.start();
			
		}
	}

}
