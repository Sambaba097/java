import java.util.Scanner;
public class Tableaux {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,n;
        System.out.println("entrer le nombre d'element du tableau");
        n=sc.nextInt();
        int[] tab=new int[n];
        for(i=0;i<tab.length;i++)
        {
            System.out.println("veuiller saisir l'element "+i+" du tableau");
            tab[i]=sc.nextInt();

        }
        sc.close();
        System.out.println("voici les element du tableau");
        for(i=0;i<tab.length;i++)
        {
            System.out.print(+tab[i]);
        }
    }
    

}
