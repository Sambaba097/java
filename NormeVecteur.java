import java.util.Scanner;
import java.lang.Math;

public class NormeVecteur{
    
    public static double norme(double x, double y)
    {
        double res = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return res;
    }

    public static void main(String[] args){
        Scanner lecteur = new Scanner(System.in);
        double[] v = new double[2];
        System.out.println("Donner l'abscisse du vecteur");
        v[0] = lecteur.nextDouble();
        System.out.println("Donner l'ordonnée du vecteur");
        v[1] = lecteur.nextDouble();
        double res = norme(v[0],v[1]);
        System.out.println("norme du vecteur = " + res);
    }
}