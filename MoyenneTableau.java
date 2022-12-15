import java.util.Scanner;

public class MoyenneTableau{
    
    public static double moyenne(int[] Tab){
        double moy;
        int somme = 0;
        for(int i = 0; i < Tab.length; i++)
            somme += Tab[i];
        moy = (double)somme/Tab.length;
        return moy;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Veuillez saisir le nombre d'elements du tableau");
            n = sc.nextInt();
        } while(n < 1);
        int[] tab = new int[n];
        for(int i = 0; i < tab.length; i++){
            System.out.print("Donner l'element d'indice "+i+" : ");
            tab[i] = sc.nextInt();
        }
        double moy = moyenne(tab);
        System.out.println("moyenne = "+moy);

    }
}