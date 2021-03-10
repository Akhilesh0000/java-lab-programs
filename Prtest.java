class Prtest extends Thread{
	public void run(){
		System.out.println("running thread is:"+Thread.currentThread().getName());
		System.out.println("running thread priority:"+Thread.currentThread().getPriority());
	}
	public static void main(String[] args){
		Prtest t1 = new Prtest();
		Prtest t2 = new Prtest();
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}
}