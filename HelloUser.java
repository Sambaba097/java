import java.util.Scanner;

public class HelloUser {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello User votre nom svp!");
        String name = sc.nextLine();
        System.out.println("Bienvenue " +name);
    }
}
