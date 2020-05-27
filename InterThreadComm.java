package multithreading;



public class InterThreadComm {
	public static void main(String[] args) {
		
	
	Canteen c=new Canteen();
	Customer c1=new Customer(c);
	Dosamaker d=new Dosamaker(c);

	}
}


class Canteen
{
	volatile boolean flag=false;
	 int qty;
	 synchronized void producedosa(int qty)
	 {
		 
		 System.out.println("producer");
		 
		 try {
			 
			 System.out.println("produce dosa :flag="+flag);
			 if(flag==true)
			 {
				 System.out.println("calling wait on producer'''' \n");
				 wait();
				 
			 }
		 }
			 catch(InterruptedException e)
			 {
				 
				 e.printStackTrace();
			 }
			 
			 System.out.println("preparing dosa");
			 this.qty=qty;
			 System.out.println(qty+"dosa ready");
			 flag=true;
			 System.out.println("flag set to :"+flag+":by producer \n\n");
			 notify();
		 }
	 
	 
	 synchronized void eatdosa()
	 {
		 
		System.out.println("customer");
		try
		{
			System.out.println("flag"+flag);
			if(flag==false)
			{
				
				System.out.println("calling wait on customer....\n");
				wait();
			}
			
		}
		
		catch(InterruptedException e)
		{
			e.printStackTrace();
			
		}
		
		
		System.out.println("got dosa");
		System.out.println("Eating"+qty+"dosa");
		flag=false;
		
		 System.out.println("flag set to :"+flag+"by producer \n\n");
		 notify();
	 }
	 }



class Customer implements Runnable
{

	
	  Canteen c;
	  Customer(Canteen c)
	  {
		  this.c=c;
		  Thread t1=new Thread(this);
		  t1.start();
				  
		  
	  }
	@Override
	public void run() {
		while(true)
		{
			
			c.eatdosa();
		}
		
	}
	
}








class Dosamaker implements Runnable
{

	
	  Canteen c;
	  Dosamaker(Canteen c)
	  {
		  this.c=c;
		  Thread t1=new Thread(this);
		  t1.start();
				  
		  
	  }
	@Override
	public void run() {
		int i=1;
		while(i<4)
		{
			
			c.producedosa(i);
			i++;
		}
		
	}
	
}

