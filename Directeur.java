public class Directeur {
    private String nom;
    private int age;
    private static Directeur instance;
    private Directeur(){}
    private Directeur(String nom){
        this.nom = nom;
    }
    private Directeur(String nom, int age){
        this.nom = nom;
        this.age = age;
    }
    public String toString(){
        System.out.println("voici le nom du directeur:"+nom);
        System.out.println("voici l'age du directeur:"+age);
    }
    public void saluer(){
        System.out.println("le Directeur"+nom+"vous salue");
    }
    private static Directeur getInstance() {
        if (instance == null) {
            instance = new Directeur();
            
        }else
        return instance;

    }

}
