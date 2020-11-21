package med;
import java.util.Arrays;
import java.util.Scanner;
public class Operation {
	int somme=0;

	public static void main(String[] args) {
		int t[]=new int[10];
		int[] t1=new int[5];
		
		Operation n=new Operation();
        n.affiche(t);
        n.operation1(9, t);
        n.operation2(t);
        n.operation3(t);
        n.operation4(t);
        n.operation5( t);
        
	    n.remplir1(t1);
	    n.remplir2(t1);
	    n.remplir3(t1);
	    n.operation2(t1);
	    n.operation3(t1);
	    n.operation4(t1);
	}
		void affiche(int [] t ) 
		{
			Scanner y=new Scanner(System.in);
			for(int i=0;i<t.length;i++) {
				t[i]=y.nextInt();
										}
			for(int i=0;i<t.length;i++) {
			
			System.out.print(t[i]+" ");
		                                }
		
        }
	  void operation1(int o,int[] t)
	  { 
		  int count=0;
		  for(int i=0;i<t.length;i++) {
			  if(t[i]==o) {
				  count +=1;
			  }
			 
		  }
		  System.out.print(" \n le nombre d'èlement qui égal 9 est :"+count);
	  
	  }
	  void remplir1(int[] t1){
		for(int i=0;i<5;i++) {
			t1[i]=i;
			
		}}
		void remplir2(int [] t1)
		{
			 System.out.print(" \n tableau en ordre croissant :");
			for(int i=0;i<t1.length;i++) {
				System.out.print(t1[i]+" ");
										}
		}
		void remplir3(int[] t1) {
			System.out.print("  \n tableau en ordre décroissant :");
			int nb=t1.length-1;
			for(int i=nb;i>=1;i--) {
				System.out.print(t1[i]+" ");
			}
		}
		void operation2(int[] t1)
		{
			int a=2,b=4;
			int count=0;
			for(int i=0;i<t1.length;i++)
			{
				if(t1[i]>4 || t1[i]<2 ) {
					count+=1;
										}
		   	}
			System.out.print(" \n il y a  "+count+" nombre plus que 4 et moins de 2");
			
		}
		void operation3(int[] t1) 
		{
  			for(int i=0;i<t1.length;i++)
			{
				somme+=t1[i];
			}
			System.out.print(" \n la somme de tout les èlement est "+somme);
			
		}
		
		void operation4(int[] t1) {
			System.out.print(" \n la moyenne de tableau est "+(somme/t1.length ));
		}
		
		void operation5(int [] t1) {
			int max=100;
			for(int i=0;i<t1.length;i++) {
				if (max<t1[i]) {
					max=t1[i];
				}
				
			}
			System.out.print(" \n le max d'èlement est :"+max);
		}
 }
