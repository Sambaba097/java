import java.util.Scanner;
import java.lang.Math;
public class Factorielle{

    public static int factorielle(int n){
        if(n == 0 || n == 1)//oubien n<=1 ou n<2
            return 1;
        else
            return n * factorielle(n-1);
    }

    public static void main(String[] args){
        Scanner lecteur = new Scanner(System.in);
        int n;
        do{
            System.out.println("Veuillez saisir un nombre entier positif");
            n = lecteur.nextInt();
        }while(n < 0);
        int facto = factorielle(n);
        System.out.println(n+"! = "+facto);
    }

}