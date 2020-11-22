import java.util.Scanner;

public class factoriel2 {

	public static void main(String[] args) {
		int N, F=1; // F est le factoriel de N

		Scanner c=new Scanner(System.in);
		
		int d=c.nextInt();

		for(int i=2;i<=d;i++) F*=i;
		System.out.println ("Factoriel de "+d+" est : "+F) ;


	}

}
