import java.util.*;
final class Square{
	private int length;
	Square(int len){
		length = len;
	}
	double area(){
		return length*length;
	}
}
class PreventInherit{
	public static void main(String[] args){
		int l;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of Square: ");
		l =s.nextInt();
		Square obj = new Square(l);
		System.out.println("Inside Area of Square");
		System.out.println("Area of Square is "+obj.area());
	}
}