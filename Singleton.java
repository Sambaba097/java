public class Singleton {
    private static Singleton instance;

    private String nom;
    private String prenom;

    private Singleton() {
        this.nom = "Ba";
        this.prenom = "Samba";
    }

    public
     static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getNom() {
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }

    public void setNom(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}
