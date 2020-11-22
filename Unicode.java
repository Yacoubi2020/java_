package med;

public class Unicode {

	public static void main(String[] args) {
		char [] y= {'e','t','A'};
		
		for(int i=0;i<y.length;i++) {
			System.out.println(" Unicode de "+y[i]+" est :"+(int) y[i] );
		}
		for(int i=0;i<y.length;i++) {
			System.out.println(" le caractère de Unicode "+(int)y[i]+" est :"+y[i]);
		}
	}

}
