package AbstractOrnek;

/**
 * Calisan
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public abstract class Calisan extends Kisi{

    private String unvani;

    public String getUnvani() {
        return unvani;
    }

    public void setUnvani(String unvani) {
        this.unvani = unvani;
    }

    public abstract float maasHesapla();
}