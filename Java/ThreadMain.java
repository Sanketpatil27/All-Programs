 class Thread1 extends Thread
{
	public void run()
	{
		//Thread t = Thread.currentThread();
		//System.out.println("Current thread: "+ t.getName());
		try{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread : "+i);
			Thread.sleep(1000);
		}}catch(Exception e){System.out.println("Exception caught");}
	}
}
public class ThreadMain
{
	public static void main(String args[])
	{
		Thread1 t1 = new Thread1();
		t1.start();
	}

}