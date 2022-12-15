import java.util.Scanner;
import java.lang.Integer;

public class Conversion{
    //idée: Pour contourner la limite théorique des types traitant sur les nombres, il faut utiliser des chaines et surdefinir les operateurs
    //l'addition doit etre complètement redéfini, pareil que la soustraction. La division et le modulo peuvent etre tirés à partir de la soustraction et la
    //multiplication à partir de l'addition. 
    public static void main(String[] args){
        Scanner lecteur = new Scanner(System.in);
        //System.out.println("Veuillez saisir un nombre entier");
        //int nombre = lecteur.nextInt();
        //System.out.println("Voici  le nombre saisi : "+nombre);   
        System.out.println("Integer.MAX_VALUE = "+Integer.MAX_VALUE);
        System.out.println("Long.MAX_VALUE = "+Long.MAX_VALUE);
        if((long)Integer.MAX_VALUE + 1 > Integer.MAX_VALUE)
            System.out.println("true");
        else
            System.out.println("false");
    }
}