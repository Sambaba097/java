import java.sql.Date;
import java.util.Scanner;

public class TestEtudiant{
    public static void main(String[] args){
        Etudiant e = new Etudiant();
        Scanner lecteur = new Scanner(System.in);
        System.out.println("Saisir la date au format aaaa-mm-jj");
        String s = lecteur.next();
        Date d = Date.valueOf(s);  
        e.setDateNaissance(d);
        e.afficheEtudiant();

    }
}