import java.util.Scanner;

public class Permuter_variables {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez x: ");
        int x = scanner.nextInt();

        System.out.print("Entrez y: ");
        int y = scanner.nextInt();

        System.out.println("Avant permutation: ");
        System.out.println("x : " + x);
        System.out.println("y : " + y);

        int tmp = x;
        x = y;
        y = tmp;

        System.out.println("Apr�s permutation: ");
        System.out.println("x : " + x);
        System.out.println("y : " + y);

	}

}
