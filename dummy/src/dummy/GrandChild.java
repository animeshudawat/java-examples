package dummy;

class Parent {
	void method1() {
		System.out.println("Parent --> method1()");
	}
}

class Child extends Parent{
	void method1() {
		System.out.println("Child --> method1");
	}
	
	void method2() {
		System.out.println("Child --> method2");
	}
}

public class GrandChild extends Child{
	void method2() {
		System.out.println("GrandChild --> method2");
	}
	public static void main(String[] args) {
		Parent p = new GrandChild();
		Child c = new GrandChild();
		GrandChild g = new GrandChild();
		
		
		p.method1();
		c.method1();
		c.method2();
		g.method1();
		g.method2();

	}

}
