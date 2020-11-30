package j;

class herita {
   public herita(int x,int y) {
	 this.x=x;
	 
	 this.y=y;
   }
   public void affich() {
	   System.out.print("y");
   }
   private int x,y;
}
class heri extends herita{
	public heri(int x,int y) {
		super(x,y);
		//System.out.print("ii");
	}
	public void affich() {
		super.affich();
		
	}
}
public class heritage2 {
	public static void main(String [] args) {
		heri p =new heri(1,2);
		p.affich();
	}
}
