package test;

public class inter3 {
public static void main(String[] args )

	{
	inter1 a =new inter1();
	inter2	 b =new inter2();
	inter3 c =new inter3();
	
	interInf i =new interInf() {

		@Override
		public void m() {
				
			System.out.print("original");
		}
		@Override
		public void f() {	
		}
		
	};
	Print(new interInf() {
		
		@Override
		public void m() {
				
			System.out.print("copie");
		}

		@Override
		public void f() {
			
		}
		
	});
		}
public static void Print(inter a) {
	a.m();
}
}
