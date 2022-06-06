package threading;
class Class2 extends Thread
{
	public void run()
	{
		System.out.println("Thread in Myclass "+Thread.currentThread());
	}
}

public class Thread2 {

	public static void main(String[] args) {
		System.out.println("Thread in main Method "+Thread.currentThread());
		Class2 mob=new Class2();
		mob.setName("Hello1");
		mob.start();
		
		Class2 mob1=new Class2();
		mob1.setName("Hello2");
		mob1.start();

	}

}


