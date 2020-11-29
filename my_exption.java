import java.util.Scanner;
public class my_exption {

	public static void main(String[] args) {
		int[] t= {1,8,9};
		
        try {
        	r w=new r(t); 
        	System.out.print(t[2]);
        	
        }
        catch(ty e) {
        	System.out.print("error");
        }
	}

}
class  ty extends Exception{
	
}
class r{
	int d;
	public r(int [] t) throws ty{
    //d=t.length-1;
   if(d<=t.length-1) throw new ty();
  
  
	   
 
}
	
	}
