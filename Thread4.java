package threading;

class Threadu extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
		    System.out.println("Inside run "+Thread.currentThread());
		    try {
				Thread.sleep(2000); //used to make Thread sleep 2s
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //checked exception
		}
	}
}

public class Thread4 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Parent Thread "+Thread.currentThread());
		ThreadHello ob=new ThreadHello();
		
		ob.setName("first");
		System.out.println("first Thread is Alive before start() "+ob.isAlive());
		ob.start();
		System.out.println("first Thread is Alive after start() "+ob.isAlive());
		ob.join();
		System.out.println("first Thread is Alive after join() "+ob.isAlive());
		ThreadHello ob1=new ThreadHello();
		ob1.setName("second");
		System.out.println("second  Thread is Alive before start() "+ob1.isAlive());
ob1.start(); //start calls run method
		System.out.println("second Thread is Alive after start() "+ob1.isAlive());
		
	}
}



