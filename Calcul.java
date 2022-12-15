public class Calcul {
    public static void main(String[] args)
    {
        char operateur=args[1].charAt(0);
        int resultat;
        switch (operateur)
        {
            case '+' :resultat=(Integer.parseInt(args[0])) + (Integer.parseInt(args[2]));
                        System.out.println(+resultat);
                        break;
            case '-' :resultat=(Integer.parseInt(args[0])) - (Integer.parseInt(args[2]));
                        System.out.println(+resultat);
                        break;
            case '/' :resultat=(Integer.parseInt(args[0])) / (Integer.parseInt(args[2]));
                        System.out.println(+resultat);
                        break;
            case '*' :resultat=(Integer.parseInt(args[0])) * (Integer.parseInt(args[2]));
                        System.out.println(+resultat);
                        break;
            // default :System.out.println("erreur");

        }
    }
}
