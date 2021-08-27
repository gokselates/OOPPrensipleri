package AbstractOrnek5;

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

    public void isminiSoyle(){
        System.out.println("Bu obje "+isim+" objesidir.");
    }

    abstract void alanHesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}