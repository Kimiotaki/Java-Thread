package thread;
class Thr extends Thread
{
	public synchronized void run()
	{
		//System.out.println(this.interrupted());
		//System.out.println(this.isInterrupted());
		try {
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+" "+this.getName());
			//System.out.println(this.interrupted());
			//System.out.println(this.isInterrupted());
				//this.sleep(1000);
				
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	}
//class Thre extends Thread
//{
//	public void run()
//	{
//		
//	}
//}

public class Thread_method {

	
	public static void main(String[] args) {
		
		Thr t= new Thr();
		t.start();
		//t.interrupt();
		Thr t1= new Thr();
		t1.start();
	}

}
