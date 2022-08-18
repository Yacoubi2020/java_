package test;

public class C extends A{
	private String dist ;
	public C() {
		super("Linux","NONE");
	}
	public C(String ver,String dis) {
		super("Linux",ver);
		this.dist=dis;
	}
	public void PrintOS() {
		super.PrintOS();
		System.out.print(" dist "+this.dist);
	}
}
