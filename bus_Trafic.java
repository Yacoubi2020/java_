package med;

public class bus_Trafic {

	public static void main(String[] args) {
		
		String[] ville_départ= {"Vierzon","orléns","Salbris","Nouans","Lamotte-Beuvron","La Ferté Saint-Aubin"};
		String[] ville_arrivé= {"Salbris","Nouans","Lamotte-Beuvron","La Ferté Saint-Aubin","orléns"};
		double[] prix= {3.20,1.80,2.30,4.20,5.00};
		bus_Trafic.indice_ville(ville_départ);
		bus_Trafic.prix_trajet(ville_départ,prix,ville_arrivé);
		
	}
	  static void indice_ville(String[] u) {
		for(int i=0;i<u.length;i++) 
		{
		System.out.println("l'indice de ville "+u[i]+": "+i);
		}
		
	  }
	 static  void prix_trajet(String[] u,double[] o,String[] p) {
		  
		  for(int i=0;i<u.length;i++) 
			  for(int j=0;j<p.length;j++) {
			      System.out.println ("le prix de trajet de "+u[i]+" à "+p[j]+" est "+o[j]);	  
			   
			    }
			  }
		  }
		  
	
