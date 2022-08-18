package test;

public class D {
public static void main(String [] args ) {
	B b =new B();
	C c =new C();
	D d =new D();
	A a =c;
	System.out.print(a.name);
	d.Goshow(c);
	
	
	
}
public  void Goshow(A a) {
	if (a instanceof B) {
		System.out.print("B");
	}
	else if (a instanceof C) {
		System.out.print("C");
	}
	else 
		
			System.out.print("Z");
}

}
