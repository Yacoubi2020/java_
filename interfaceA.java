interface A {
	void y();
	void ty();
}

class e implements A{
	public void y() {
		System.out.print("  ");
	}
	public void ty() {
		System.out.print("jjj");
	}
}

class interfaceA{
	public static void main(String [] args)
{
		A oui =new e();
		oui.ty();
		oui.y();
}
}