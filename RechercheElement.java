import java.util.Scanner;
public class RechercheElement{

    public static boolean recherche(int[] Tab, int x){
        for(int i = 0; i < Tab.length; i++)
            if(Tab[i] == x)
                return true;
        return false;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        do{
            System.out.println("Donner le nombre d'element du tableau");
            n = in.nextInt();
        } while(n < 1);
        int[] tab = new int[n];
        for(int i = 0; i < tab.length; i++){
            System.out.print("Saisir l'element d'indice "+i+" : ");
            tab[i] = in.nextInt();
        }
        System.out.println("Veuillez donner l'element a rechercher");
        int x = in.nextInt();
        boolean trouve = recherche(tab,x);
        if(trouve)
            System.out.println(x+" se trouve dans le tableau");
        else
            System.out.println(x+" ne se trouve pas dans le tableau");
    }

}