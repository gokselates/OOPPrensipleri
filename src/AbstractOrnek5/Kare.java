package AbstractOrnek5;

/**
 * Kare
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public class Kare extends Sekil{

    private int kenar;

    public Kare(String isim, int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim()+" objesi "+kenar*kenar + " alandır");
    }
}