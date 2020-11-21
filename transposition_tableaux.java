package med;
import java.util.Arrays;
import java.util.Scanner;
public class transposition_tableaux {

	public static void main(String[] args) {
		System.out.print("Donner la dimention");
		Scanner c=new Scanner(System.in);
		int d=c.nextInt();
		int [][] r=new int[d][d];		
		int [][] o=new int[d][d];
		for (int i=0;i<r.length;i++) {
			for (int j=0;j<r[i].length;j++) {
				r[i][j]=c.nextInt();
				
			}}
		    System.out.print(" l'origine");
			for (int i=0;i<r.length;i++) {
				for (int j=0;j<r[i].length;j++) {
					System.out.println(r[i][j]+" ");
				
				}}
			o=r;
			for (int i=0;i<d;i++) 
				for (int j=0;j<d;j++) {
					
					System.out.print(o[j][i]+" ");
					
			
			}
}}