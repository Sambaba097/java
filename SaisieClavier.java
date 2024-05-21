import java.util.Scanner;

public class SaisieClavier
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez renseigner un entier");
		int entier = sc.nextInt();
		System.out.println("Veuillez renseigner un flottant");
		float flottant = sc.nextFloat();
		System.out.println("Veuillez renseigner une chaine de caractère");
		String chaine = sc.next(); // chaine sans espace
		// String chaine = sc.nextLine(); // chaine avec espace

		System.out.println("L'entier saisi vaut    : " + entier);
		// System.out.printf("L'entier saisi vaut    : %d\n", entier);
		System.out.println("Le flottant saisi vaut : " + flottant);
		System.out.println("La chaine saisie vaut  : " + chaine);

	}
}