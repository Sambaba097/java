import java.util.Scanner;
import java.lang.String;

public class Palindrome{

    public static boolean palindrome(String mot){
        int i = 0, j = mot.length() - 1;
        while(i < j){
            if(mot.charAt(i) != mot.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String args[]){

        Scanner lecteur = new Scanner(System.in);
        
        System.out.println("Veuillez saisir une chaine");
        String ch = lecteur.next();
        boolean estPalindrome = palindrome(ch);
        if(estPalindrome)
            System.out.println(ch+" est un palindrome");
        else    
            System.out.println(ch+" n'est pas un palindrome");
    }
}