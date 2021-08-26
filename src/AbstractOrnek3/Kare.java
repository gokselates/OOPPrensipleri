package AbstractOrnek3;

/**
 * Kare
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public class Kare extends Sekil{

    private Long kenar;

    public Kare(String isim,Long kenar) {
        super(isim);
        this.kenar = kenar;
    }

    public void cevreHesapla(){
        System.out.println("Çevresi"+4*kenar);
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim()+ " nin Alanı"+kenar*kenar);
    }
}