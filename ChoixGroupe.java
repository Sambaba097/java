import java.util.Random;

public class ChoixGroupe {
    
    public static int generate(int borne_max, int borne_min){
        Random rand = new Random();
        int  nombre;
        do{
            nombre = rand.nextInt() % (borne_max + 1);
        } while(nombre < borne_min);
        return nombre;
    }
    public static boolean estEnregistre(int tab[], int nombre){
        for(int i = 0; i < tab.length; i++){
            if(nombre == tab[i])
                return true;
        }
        return false;
    }
    public static int[] sauvegardeRandom(int borne_min, int borne_max){
        int tab[] = new int[borne_max - borne_min + 1];
        int i = 0;
        while(i < tab.length){
            int nombre = generate(borne_max,borne_min);            
            if(!estEnregistre(tab,nombre)){
                tab[i] = nombre;
                i++;
            }
        }
        return tab;
    }
    public static void afficheTableau(int[] tab){
        for(int i = 0; i < tab.length; i++){
            System.out.println("groupe numero "+ (i+1) + " : " + tab[i]);
        }
    }
    
    public static void main(String[] args){
        int borne_min = Integer.parseInt(args[0]);
        int borne_max = Integer.parseInt(args[1]);
        int aleatoire[] = sauvegardeRandom(borne_min,borne_max);
        afficheTableau(aleatoire);         
    }


}
