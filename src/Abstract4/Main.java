package Abstract4;

/**
 * Main
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public class Main {

    public static void main(String[] args) {
        Kare kare = new Kare("Kare",8);
        Daire daire = new Daire("Daire",6);

        kare.alanHesapla();
        daire.alanHesapla();
    }

}