package threading;
class ThreadHello extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Inside run" +Thread.currentThread());
		}
	}
	
}
public class Thread3 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Parent Thread" +Thread.currentThread());
		ThreadHello ob=new ThreadHello();
		ob.setName("first");
		ob.start();
		ThreadHello ob1=new ThreadHello();
		ob1.setName("second");
		ob1.start();
		
	}

}
