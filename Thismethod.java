class A{
	A(){
		System.out.println("Hello I am Constructor");
	}
	A(int y){
		this();
		System.out.println(y);
	}
}
class Thismethod{
	public static void main(String[] args){
		A obj = new A(10);
	}
}