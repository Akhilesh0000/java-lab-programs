class MethodOverloading{
	private static void show(int m){
		System.out.println("The number of m is"+m);
	}
	private static void show(int b, int c){
		System.out.println("The values of b,c are"+b+c);
	}
	public static void main(String[] args){
		MethodOverloading obj = new MethodOverloading();
		obj.show(2);
		obj.show(2,3);
	}
}