	 abstract class d1	 {
			public abstract void  g();
			public abstract void  e();}
	 abstract class d {
			public abstract void  g();
			public abstract void  e();}
	  class dcc extends d{
			public void g() {
				System.out.print("uuu");
			}
			public void e() {
				System.out.print("uuu");
			}}
		  class dcco extends d1{
			  public void g() {
					System.out.print("uuu");
				}
				public void e() {
					System.out.print("uuu");}}
		 class abstractA{
			 public static void main(String [] args) {
				 dcc u;
				 u= new dcc();
				 dcco pi=new dcco();
				 pi.e();
				 pi.g();
				 u.g();
				 u.e();}}