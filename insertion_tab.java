package med;

public class insertion_tab{
	public static void main(String[] args) {
		int [] t= {5,8,6,9,6};
		insertion a=new insertion();
		a.afficher(t);
		a.insertionTab(t);
		
	}
}

abstract class tab{
	abstract void afficher(int [] t);
	abstract void insertionTab(int [] t);
	
	
} 

  class insertion extends tab {
	public void afficher(int [] t) {
		System.out.println("avant l'isertion");
		for(int i=0;i<t.length;i++) {
			
			System.out.print(t[i]+" ");
		}
		
		
	}
	void insertionTab(int [] t) {
		System.out.println("\naprés l'insertion");
		int c;
		for(int i=0;i<t.length;i++) 
			for(int j=0;j<t.length;j++) {
			
			if(t[i]<t[j]) {
				c=t[j];
				t[j]=t[i];
				t[i]=c;
			}
			
			
		}
		for(int i=0;i<t.length;i++) {
			System.out.print(t[i]+" ");
		}
		
		}

}
