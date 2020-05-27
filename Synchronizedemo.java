package multithreading;



import java.util.Scanner;






 class husband implements Runnable {

	
	Bank b;
	husband(Bank b)
	{
		this.b=b;
		Thread t1=new Thread(this);
		t1.start();
		
	}
	@Override
	public void run() {
		try {
		b.deposite();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		// TODO Auto-generated method stub
		
	}

}



 class wife implements Runnable {

	
	Bank b;
	wife(Bank b)
	{
		this.b=b;
		Thread t1=new Thread(this);
		t1.start();
		
	}
	@Override
	public void run() {try {
		b.withdraw();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		// TODO Auto-generated method stub
		
	}

}






 class Bank  {

	
	int balance=5000;
	int amount;
	
	synchronized public void deposite() throws InterruptedException
	{
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("your previous balance is ="+balance);
		System.out.println("enter your amount");;
		Thread.sleep(1000);
		amount=sc.nextInt();
		balance+=amount;
		Thread.sleep(1000);
		System.out.println("your current balance is="+balance);
		
	}
	
	
	
	synchronized public void withdraw() throws InterruptedException
	{
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("your previous balance is ="+balance);
		System.out.println("enter your amount");;
		Thread.sleep(1000);
		amount=sc.nextInt();
		balance-=amount;
		Thread.sleep(1000);
		System.out.println("your current balance is="+balance);
		
	}
	
	
		
		
	}


public class Synchronizedemo
{
	
	public static void main(String[] args) {
		Bank b=new Bank();
		husband h=new husband(b);
		wife w=new wife(b);
}
}