import java.util.Scanner;

public class PuissanceRec{
    
    public static int puissance(int x, int n){
        if(n == 0)
            return 1;
        else
            return x*puissance(x,n-1);
    }
    public static void main(String[] args){
        Scanner lecteur = new Scanner(System.in);
        System.out.println("Veuillez donner un nombre entier");
        int x = lecteur.nextInt();
        int n;
        do{
            System.out.println("Veuillez saisir une valeur de puissance positive");
            n = lecteur.nextInt();
        } while(n < 0);
        int res = puissance(x,n);
        System.out.println(x+"^"+n+" = "+res);
    }
}
 