package overriding;

public class Class_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		A a = new A();
		a.method_1(30);
		a.method_2(40);
		
		
	}

}
class A extends B{
	void method_1(int x) {
		System.out.println("method_1 Class-A");
	}
	void method_2(int y) {
		System.out.println("method_2 class-A");
		B b = new B();
		b.method_1(10);
		b.method_2(20);
	}
	
	
}

class B{
	void method_1(int x) {
		System.out.println("method_1 class-B");
	}
	void method_2(int y) {
		System.out.println("method_2 class-B");
	}
}