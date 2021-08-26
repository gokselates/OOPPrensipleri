package AbstractOrnek3;

/**
 * Sekil
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public abstract class Sekil {
    private String isim;

    public Sekil(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }


    public void setIsim(String isim) {
        this.isim = isim;
    }

    abstract void alanHesapla();

    public void isminiSoyle(String isim){
        System.out.println("Bu bir "+isim+" dir");
    }
}