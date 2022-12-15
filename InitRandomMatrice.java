import java.util.Random;
import java.util.Scanner;

public class InitRandomMatrice{

    public static void init(int[][] m){
        Random r = new Random();
        for(int i = 0; i < m.length; i++)
            for(int j = 0; j < m.length; j++)
                m[i][j] = r.nextInt(); 
    }
    public static void main(String args[]){
        int n;
        Scanner lecteur = new  Scanner(System.in);

        do{
            System.out.println("Veuillez saisir l'ordre de la matrice");
            n = lecteur.nextInt(); 
        } while(n < 1);

        int mat[][] = new int[n][n];
        init(mat);
        
        for(int j = 0; j < mat.length; j++){
            for(int i = 0; i < mat.length; i++){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
}