import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Tp2EquationSecondDegre{
    
    public static void main(String[] args){
        double x0,x1,x2;
        
        NumberFormat formatter = new DecimalFormat("#.##");
        //valueOf ou parseInt
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = b*b - 4*a*c;
        System.out.println("delta = "+d);
        if((a == 0 && b == 0) || (a != 0 && d < 0)){
            System.out.println("Pas de solution");
        }
        else if(a == 0 && b != 0){
            x0 = (double)-c/b;
            String solution0 = formatter.format(x0);
            System.out.println("La solution est x0 = " + solution0);
        }
        else if(a != 0 && d == 0){
            x0 = (double)-b/(2*a);
            String solution0 = formatter.format(x0);
            System.out.println("La solution est x0 = " + solution0);
        }
        else if(a != 0 && d > 0){
            x1 = (-b - Math.sqrt(d))/(2*a);
            x2 = (-b + Math.sqrt(d))/(2*a);
            String solution1 = formatter.format(x1);
            String solution2 = formatter.format(x2);
            System.out.println("Les deux solutions sont x1 = "+ solution1 + " et x2 = " + solution2);
        }
        
    }


}