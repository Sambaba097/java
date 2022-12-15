import java.util.Scanner;

public class AfficheMatrice{
    
    public static void affichageVertical(int[][] m){
        for(int j = 0; j < m.length; j++){
            for(int i = 0; i < m.length; i++){
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n;
        Scanner entree = new Scanner(System.in);
        do{
            System.out.println("Veuillez saisir l'ordre de la matrice carree");
            n = entree.nextInt();
        } while(n < 1);
        int[][] m = new int[n][n];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++){
                System.out.print("Saisir la valeur de l'element d'indice ("+i+","+j+") : ");
                m[i][j] = entree.nextInt();
            }
        }        
        affichageVertical(m);
    }

}