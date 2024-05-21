public class AnimalConcrete extends AnimalAbstraite {

    @Override
    public void crier() {
        System.out.println("Je suis un chien du coup je crie waaaaaaaaaf!");
    }

    public static void main(String [] args){
        AnimalConcrete animal = new AnimalConcrete();
        animal.crier();
        
    }
    
}
