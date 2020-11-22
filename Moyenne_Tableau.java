
public class Moyenne_Tableau {

	public static void main(String[] args) {
        double Tab[]={10,3.2,25,36.56,0,159,12,52,8,89,15,10}, S=0;
		
        for(int i=0;i<Tab.length; i++)
        S=S+Tab[i];
	
        System.out.println("La moyenne du tableau est : "+ (S/Tab.length));


	}

}
