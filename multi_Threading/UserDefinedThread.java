package multi_Threading;

public class UserDefinedThread implements Runnable {
	public void run() {
		System.out.println("yo"+ Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("yo"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		UserDefinedThread t = new UserDefinedThread();
		Thread t1 = new Thread(t);
		t1.setName("Liton");
		t1.setPriority(7);
		Thread t2 = new Thread(t);
		t2.setName("Ani");
		t2.setPriority(8);
		Thread t3 = new Thread(t);
		t3.setName("Subu");
		t3.setPriority(9);
		t1.start();
		t2.start();
		t3.start();
		
	}
	}