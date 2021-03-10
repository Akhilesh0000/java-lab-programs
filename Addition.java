package pack;
public class Addition{
	private double d1,d2;
	public Addition(double a,double b){
		d1=a;
		d2=b;
	}
	public void sum(){
		System.out.println("Sum of two given numbers is:"+(d1+d2) );
	}
}