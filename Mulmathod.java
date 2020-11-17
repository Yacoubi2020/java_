package med;

import java.util.Arrays;

public class Mulmathod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tableau p=new tableau();
		p.afficher();

	}

}

class tableau{
	int [][] cc= {{12,1},{2,3}};	
	int [][] v= {{12,2},{2,2}};
	 int [][] p=new int[cc.length][v.length];
	public tableau() { 

	if (cc[0].length != v[0].length || cc[1].length != v[1].length) {
		System.out.print("imposible de faire la multiplication de deux matrice ");
	   }
		
	else {
	for (int i=0;i<cc.length;i++) {
		   for (int j=0;j<v[i].length;j++) 
		    		 p[i][j]=p[i][j]+(cc[i][j]*v[i][j]);
		
			
		}
	
		
	}
	
	}
	void afficher() {
		for (int i=0;i<p.length;i++) {
			
			for (int j=0;j<p[i].length;j++) {
				
				System.out.println(p[i][j]);
			}
	}
	

	
 	}}

