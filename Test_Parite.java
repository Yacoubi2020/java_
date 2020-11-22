import java.util.Scanner;
public class Test_Parite {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
        System.out.println("entrez un nombre entier psitif");
        int z=c.nextInt();
        if (z>0){
                }
        else {
            System.out.println(" c'est un nombre négative essayez une notre fois :");
              z=c.nextInt();}
        if(z%2==0){
            System.out.println(" le nombre  "+z+" est un pair" );
        }
        else
            System.out.println("le nombre "+z+" est un impaire");
        }

	}
