import java.util.Date;
import java.text.SimpleDateFormat;
public class TestDate{
    public static void main(String[] args){
        SimpleDateFormat formater = null;
        Date aujourdhui = new Date();
        //d = day, M=month et y=annee au format numerique 
        //exemple 1
        formater = new SimpleDateFormat("dd-MM-yy");
        System.out.println(formater.format(aujourdhui));
        //exemple 2
        formater = new SimpleDateFormat("EEEE, d MMM yyyy");
        System.out.println(formater.format(aujourdhui));
        //exemple 3
        formater = new SimpleDateFormat("'le' dd/MM/yyyy à hh:mm:ss");
        System.out.println(formater.format(aujourdhui));
        //exemple 4
        formater = new SimpleDateFormat("'le' dd MMMM yyyy à hh:mm:ss");
        System.out.println(formater.format(aujourdhui));
        //exemple 5
        formater = new SimpleDateFormat("dd MMMMM yyyy GGG, hh:mm aaa");
        System.out.println(formater.format(aujourdhui));
    }



}