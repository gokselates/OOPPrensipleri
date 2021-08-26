package AbstractOrnek2;

/**
 * Kare
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public class Kare extends Sekil{

    private Long kenar;

    public Kare(String isim, Long kenar) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim()+ " alanı " + kenar*kenar +"dır.");
    }
}