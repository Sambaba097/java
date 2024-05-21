public class PatternFactory {
  
    public interface Forme {
        void dessiner();    
    }
    
    public class Cercle implements Forme {
        @Override
        public void dessiner() {
            System.out.println("je dessine un Cercle");
        }
    
        
    }

   
    public class Carre implements Forme {
        public void dessiner(){
            System.Out.Println("je dessine un carre");
        }
    
        
    }
    
    
    public class FabriqueDeForme {
        public Forme creerForme(String type) {
            if (type == null) {
                return null;
            }
            if (type.equalsIgnoreCase("cercle")) {
                return new Cercle();
            } else if (type.equalsIgnoreCase("carre")) {
                return new Carre();
            } else {
                return null;
            }
        }   
    
        
    }


    
}
