package med;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Rectangle po=new Rectangle();
		
	}
	
	public Rectangle() {
		while(true){
		Scanner a= new Scanner(System.in);
		System.out.println("Enter la largeur :");
	    int b=a.nextInt();
	    this.b=b;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter la hauteur ");
	    int d=c.nextInt();
	    this.d=d;s
		if(d<0 || b<0) {
			System.out.println("error");
			continue;
			
		}
		else 
			break;

		
		}
		Scanner o=new Scanner(System.in);
		System.out.println("choisi si la surface entrer S mais si per p");
		String c=o.next();
		switch(c) {
		case "s":
			System.out.print("La surface est :"+(b*d));
			break;
		case "p":
			break;
		}
	}
	int d;
	int b;

}

