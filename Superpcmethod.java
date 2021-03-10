class Abc{
	void show(){
		System.out.println("Hello I am from Abc class");
	}
}
class Xyz extends Abc{
	void show(){
		System.out.println("I am method of Xyz class");
		super.show();
	}
}
class Superpcmethod{
	public static void main(String[] args){
		Xyz obj = new Xyz();
		obj.show();
	}
}