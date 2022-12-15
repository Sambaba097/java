import java.util.Scanner;

public class FusionTableaux{

    public static int[] fusion(int[] T1, int[] T2)
    {
        int i,j;
        int n = T1.length + T2.length;
        int[] T3 = new int[n];
        for(i = 0; i < T1.length; i++)
            T3[i] = T1[i];
        for(j = 0; j < T2.length;j++,i++)
            T3[i] = T2[j];
        return T3;
    }
    public static void saisieTableau(int[] T){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < T.length; i++){
            System.out.print("saisir la valeur de l'element d'indice "+i+" : ");
            T[i] = in.nextInt();
        }
    }
    public static void affichageHorizontal(int[] tableau){
        for(int i = 0; i < tableau.length; i++)
            System.out.print(tableau[i]+"  ");
        System.out.println();
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1, n2;
        do{
            System.out.println("Veuillez saisir la taille du premier tableau");
            n1 = in.nextInt();
        } while(n1 <= 0);
        
        int[] tab1 = new int[n1];
        saisieTableau(tab1);

        do{
            System.out.println("Veuillez saisir la taille du second tableau");
            n2 = in.nextInt();
        } while(n2 <= 0);
        
        int[] tab2 = new int[n2];
        saisieTableau(tab2);
        
        int[] tab3 = fusion(tab1,tab2);
        affichageHorizontal(tab1);
        affichageHorizontal(tab2);
        affichageHorizontal(tab3);

    }


}