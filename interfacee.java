interface i{
	public void f();
	public void r();
	

}
interface io {
	public void rr();
	public void ty();
}

 class a implements i,io {
	 public void f() {
		 System.out.print("yy");
		 
	 }
	 public void r() {
		 System.out.print("ytty");
		 
	 }
	 public void ty() {
		 System.out.print("yy");
		 
	 }
	 public void rr() {
		 System.out.print("ytty");
		 
	 }
	 
	
}
 class interfacee{
	 public static void main(String [] args) {
		 i y=new a();
		 io pp=new a();
		 pp.rr();
		 pp.ty();
		 y.f();
		 y.r();
	 }
 }
 
