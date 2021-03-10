class A{
	void show(){
		System.out.println("A class");
	}
}
class B extends A{
	void display(){
		System.out.println("B class");
	}
}
class MultilevelInheritance extends B{
	public static void main(String[] args){
		MultilevelInheritance obj = new MultilevelInheritance();
		obj.show();
		obj.display();
	}
}