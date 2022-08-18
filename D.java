package test;

public class D {
public static void main(String [] args ) {
	B b =new B("7");
	C c =new C("20","Kali");
	D d =new D();
	d.PrintOS(c);
	
}
public void PrintOS(A a) {
	a.PrintOS();
					}
}
