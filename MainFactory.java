
import Package.PatternFactory;
import PatternFactory.FabriqueDeForme;
import PatternFactory.Forme;

public class MainFactory {
    public static void main(String[] args) {
        FabriqueDeForme fabrique = new FabriqueDeForme();
        
        Forme forme1 = fabrique.creerForme("cercle");
        forme1.dessiner();

        Forme forme2 = fabrique.creerForme("carre");
        forme2.dessiner();
    }   
    
}
