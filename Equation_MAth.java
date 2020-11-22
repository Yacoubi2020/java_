import java.util.Scanner;
public class Equation_MAth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1,x2,x3;
        Scanner r=new Scanner(System.in);
        System.out.println("entrez a :");
        double a=r.nextInt();

        Scanner d=new Scanner(System.in);
        System.out.println("entrez b :");
        double b=d.nextInt();

        Scanner e=new Scanner(System.in);
        System.out.println("entrez c :");
        double c=d.nextInt();
        double z=Math.pow(b,2)-4*a*c;
        System.out.println(a+"x2"+b+"x"+c);

        if((a==0) &&(c==0)&&(b==0)){
            System.out.println("solution c'est R");
        }
        else if (a==0){
            if ((b==0) && (c!=0)){
                System.out.println("Ensemble vide");
            }
            else if((b!=0 )&&(c!=0)){
                System.out.println("x="+-c/b);
            }
        }
        if (z>0){
            System.out.println("l'équation admet deux solution");
            x1=(-b+Math.sqrt(z))/(2*a);
            x2=(-b-Math.sqrt(z))/(2*a);
            System.out.println("x1="+x1+"\n"+"x2="+x2);

        }
        else if(z==0){
            x3=-b/(2*a);
            System.out.println("x3 ="+x3);
        }
        else
            System.out.println("ensmble vide");
	}

}
