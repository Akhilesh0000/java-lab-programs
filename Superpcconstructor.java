class Hello{
	Hello(){
		System.out.println("Hello");
	}
}
class Hi extends Hello{
	Hi(){
		super();
		System.out.println("Hi");
	}
}
class Superpcconstructor{
	public static void main(String[] args){
		Hi obj = new Hi();
	}
}