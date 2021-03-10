class A{
	void show(){
		System.out.println("I am method of A class");
	}
}
class B extends A{
	void show(){
		System.out.println("I am method of B class");
	}
}
class C extends A{
	void show(){
		System.out.println("I am method of C class");
	}
}
class TestDynamic{
	public static void main(String[] args){
		A x = new A();
		B y = new B();
		C z = new C();
		A obj;
		obj = x;
		obj.show();
		obj = y;
		obj.show();
		obj = z;
		obj.show();
	}
}