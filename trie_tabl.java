import java.util.Arrays;

public class trie_tabl {
	public static void main(String[] args) {
		int a[] = {1,8,55,3};
		int [] b=new int[a.length];
		trie_tabl.trie(a);
		
	  }
		static  void trie( int[] a) {
			int temp;
			for(int i=0;i<a.length;i++) 
				for (int j=0;j<a.length;j++) {
				if (a[i]<a[j]) {
					    temp=a[i];
		                a[i]=a[j];
		                a[j]=temp;}
		            
				}
			  System.out.print(Arrays.toString(a));
			}
}
		  