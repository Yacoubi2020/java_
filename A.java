package test;

public class A {
//operating Ssytem
	private String name;
	private String version ;
	
	public A() {
		this.name="none ";
		this.version="none";
	}
	public A(String lname,String lversion) {
		this.name=lname;
		this.version=lversion;
		
	}
	
	
	public void PrintOS() {
		System.out.print("os is"+this.name+"version is "+this.version);
	}

}
