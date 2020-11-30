

interface I{
	void f();
	void d();
}
interface I2 extends I{
	void l();
	void la();
	
}
class fe implements  I2{
	public void f() {
		System.out.println("f");
	}
	public void d() {
		System.out.println("d");
	}
	public void l() {
		System.out.println("l");
	}
	public void la() {
		System.out.println("la");
	}
	
}
class interface_extends {
	public static void main(String[] args) {
	I2 c=new fe();
	c.d();
	c.f();
	c.l();
	c.la();
	}

}
