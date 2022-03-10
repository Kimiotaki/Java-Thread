package thread;
class Th extends Thread
{
	public void run()
	{ 
		for(int i=1;i<=5;i++)
		{
			
			System.out.println(i+" "+this.getName());
			try {
			this.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
class The extends Thread
{	
	public void run()
	{
		System.out.println("work no 2");
	}
}
class Sec extends Thread
{
	public void run()
	{
		
		System.out.println("work 2");
	}
}
public class Thread_cases {

	public static void main(String[] args) throws InterruptedException {
		Th t1= new Th();
		//t1.setDaemon(true);
		t1.start();
		t1.join();
		Th st= new Th();
		st.start();
		st.join();
		//Thread.currentThread().yield();
		for(int i=1; i<=5;i++)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
		}
//		System.out.println(Thread.currentThread().getName()+Thread.currentThread().isAlive());
//		System.out.println(t1.isAlive());
//		The t2= new The();
//		Sec t3= new Sec();
//		t2.start();
//		t1.start();
//		t3.start();
		System.out.println();
		
	}

}
