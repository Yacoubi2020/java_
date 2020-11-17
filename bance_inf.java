import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class bance_inf {
	public static void main(String [] args) {
		infoClien u=new infoClien();
		
	}

}
class dosie_clien{
	protected String clien_Nom;
	protected int a=0;
	protected int age;
	protected String St;
	
	public dosie_clien(String clien_Nom,int age,String St,int Num_identifi) {
		this.a=a;
		this.age=age;
		this.St=St;
		this.a=Num_identifi;
		
		System.out.println("le Nom de clien :"+clien_Nom);
		System.out.println("Age "+age);
		System.out.println("Numéro identifiant "+a);
		System.out.println("situation personnel :"+St);
		
		
	}
	
	
}

class infoClien extends  dosie_clien{
	public infoClien() {
		  
		super("rr",18,"célebature",67);
		HashMap<Integer, String> ca= new  HashMap<Integer, String>();
		ca.put(9,"Ahmed");
		ca.put(67," Oussama");
		ca.put(98,"Imane");
		ca.put(78,"ahmed");
	
	    
		for (int s:ca.keySet()){
			 if(a==s) {
				 System.out.print("cette clien est contiet déja un crédit ");
				 
			 }
			 else
				 System.out.println("cette clien est ne contiet pas un crédit ");
			 break;	
		}}}
