package AbstractOrnek;

/**
 * BirinciFirma
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public class IkinciFirma extends Calisan{

    public static void main(String[] args) {
        IkinciFirma birinciFirma = new IkinciFirma();
        birinciFirma.setId(2L);
        birinciFirma.setAdi("Ahmet");
        birinciFirma.setSoyadi("Mehmet");
        birinciFirma.setUnvani("HR");

        System.out.println("Calisan ID:"+birinciFirma.getId());
        System.out.println("Calisan Adı:"+birinciFirma.getAdi());
        System.out.println("Calisan Soyadı:"+birinciFirma.getSoyadi());
        System.out.println("Calisan Unvanı:"+birinciFirma.getUnvani());
        System.out.println("Calisan Maaşı:"+ birinciFirma.maasHesapla());

    }

    @Override
    public float maasHesapla() {
        return 1000*7;
    }
}