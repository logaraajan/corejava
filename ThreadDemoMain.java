package threading;
class MyClass extends Thread
{
	public void run()
	{
		System.out.println("Thread in Myclass "+Thread.currentThread());
	}
}

public class ThreadDemoMain {

	public static void main(String[] args) {
		System.out.println("Thread in main Method "+Thread.currentThread());
		MyClass mob=new MyClass();
		mob.start();
		MyClass mob1=new MyClass();
		mob1.start();

	}

}


