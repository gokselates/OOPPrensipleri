package AbstractOrnek2;

/**
 * Daire
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public class Daire extends Sekil{
    private Long yaricap;

    public Daire(String isim, Long yaricap) {
        super(isim);
        this.yaricap = yaricap;
    }

    @Override
    void alanHesapla() {
        System.out.println("Daire Alanı"+Math.PI*yaricap*yaricap);
    }
}