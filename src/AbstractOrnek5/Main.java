package AbstractOrnek5;

/**
 * Main
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public class Main {
    public static void main(String[] args) {
        Kare kare = new Kare("Kare",8);
        kare.alanHesapla();
        Daire daire = new Daire("Daire",5);
        daire.alanHesapla();
    }
}