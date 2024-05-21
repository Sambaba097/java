public class RecupereSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.setNom("Mo","aicha");
        s2.setNom("lims","ly");

        System.out.println(s1.getPrenom());
        System.out.println(s2.getNom());
    }
}
