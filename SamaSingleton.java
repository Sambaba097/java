public class SamaSingleton {
    // Instance unique et privée de la classe
    private static SamaSingleton instance;
     // Constructeur privé pour empêcher l'instanciation directe
    private SamaSingleton(){}
    // Méthode statique pour obtenir l'instance unique
    private static SamaSingleton getInstance(){
        if (instance == null) {
            instance = new SamaSingleton(); 
            
        }
        return instance;
    }
     // Méthode pour tester le singleton
    public void AfficherMessage(){
        System.out.println("Hello World");
    }

    public static void main(String [] args){
        SamaSingleton single = SamaSingleton.getInstance();
        single.AfficherMessage();   
    }

    
}
