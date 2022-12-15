public class Factoriel {
    public static void main(String args[ ])
    {
        int i,s=1;
        int n=Integer.parseInt(args[0]);
        for(i=1;i<=n;i++)
        {
            s=s*i;
        }
        System.out.println("le factoriel est :"+s);
    }
}
