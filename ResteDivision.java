import java.util.Scanner;

public class ResteDivision{

    public static int reste (int n, int p){
        while(n >= p)
            n = n-p;
        return n;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n,p;
        do{
            System.out.println("Veuillez saisir une valeur entiere positive pour la dividende");
            n = in.nextInt();
        } while(n < 0);
        do{
            System.out.println("Veuillez saisir une valeur entiere strictement positive pour le diviseur");
            p = in.nextInt();
        } while(p <= 0);
        int res = reste(n,p);
        System.out.println(n+" % "+p+" = "+res);
    }
}