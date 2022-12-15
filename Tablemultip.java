import java.util.Scanner;
public class Tablemultip {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        System.out.println("veuiller entrer le nombre de table");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.println(+i);
            for(j=1;j<=10;j++)
            {
                System.out.println(i+ "x" + j + "=" +(i*j));
            }

        }
    }
}
