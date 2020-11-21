package med;
import java.util.Arrays;
import java.util.Scanner;

public class Scalaire {

	public static void main(String[] args) {
		int max=10;
		int n;
		int som=0;
		Scanner c=new Scanner(System.in);
		System.out.print("entrer la taille de deux vecteurs :");
		n=c.nextInt();
		if (n>=1 && n<=max) {
				
			}
		else {
			System.out.print("entrer la taille de deux vecteurs :");
			n=c.nextInt();}
		
		int[] v1=new int[n];
		int[] v2=new int[n];
		for (int i=0 ; i<n;i++) {
		   v1[i]=c.nextInt();	
			
		}
		for (int i=0 ; i<n;i++) {
			   v2[i]=c.nextInt();	
				
			}
		for (int i=0;i<n;i++) {
			som=som+v1[i]*v2[i];
		}
		System.out.println("v1 = "+Arrays.toString(v1));
		System.out.println("v2 ="+Arrays.toString(v2));
		System.out.println("le produit de deux vector est "+som);

	}
	

}
