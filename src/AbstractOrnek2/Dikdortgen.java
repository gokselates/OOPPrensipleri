package AbstractOrnek2;

/**
 * Dikdortgen
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public class Dikdortgen extends Sekil{

    private Long en;
    private Long boy;

    public Dikdortgen(String isim, Long en, Long boy) {
        super(isim);
        this.en = en;
        this.boy = boy;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim()+" alanı "+en*boy+" dur");
    }
}