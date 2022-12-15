import java.util.Scanner;

public class Matrice{
    
    //public static void affichageHorizontal(int[][] mat);
    public static void affichageHorizontal(int[][] mat){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int max(int[][] mat){
        int maxi = 0;
        for(int i = 0; i < mat.length; i++){
            if(maxi < mat[i].length){
                maxi = mat[i].length;
            }
        }
        return maxi;
    }
    //public static void affichageHorizontal(int[][] mat);
    public static void affichageVertical(int[][] mat){
        int i,j=0,k = 1;
        while(j < max(mat)){
            i = 0;
            //tant qu'on a pas fini les vecteurs
            while(i < mat.length){
                //s'il y a des elements a parcourir
                if(j < mat[i].length){
                    System.out.print(mat[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
                i++;
            }
            System.out.println();
            j++;
        }
    }
    public static void main(String args[]){
            int mat[][];
            Scanner in = new Scanner(System.in);
            System.out.println("Donner le nombre de vecteurs");
            int n = in.nextInt();
            mat = new int[n][];
            for(int i = 0; i < n; i++){
                System.out.println("Donner le nombre d'elements du vecteur numero "+i+" ");
                int m = in.nextInt();
                mat[i] = new int[m];
                for(int j = 0; j < m; j++){
                    System.out.println("Donner la valeur de l'element "+i+", "+j+" ");
                    mat[i][j] = in.nextInt();
                }
            }
            System.out.println("======================");
            System.out.println("Affichage horizontal");
            System.out.println("======================");
            affichageHorizontal(mat);
            System.out.println("======================");
            System.out.println("Affichage vertical");
            System.out.println("======================");
            affichageVertical(mat);
    }
    


}