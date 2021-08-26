package AbstractOrnek;

/**
 * BirinciFirma
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public class BirinciFirma extends Calisan{

    public static void main(String[] args) {
        BirinciFirma birinciFirma = new BirinciFirma();
        birinciFirma.setId(1L);
        birinciFirma.setAdi("Goksel");
        birinciFirma.setSoyadi("Ates");
        birinciFirma.setUnvani("Yazılım");

        System.out.println("Calisan ID:"+birinciFirma.getId());
        System.out.println("Calisan Adı:"+birinciFirma.getAdi());
        System.out.println("Calisan Soyadı:"+birinciFirma.getSoyadi());
        System.out.println("Calisan Unvanı:"+birinciFirma.getUnvani());
        System.out.println("Calisan Maaşı:"+ birinciFirma.maasHesapla());

    }

    @Override
    public float maasHesapla() {
        return 1000*2;
    }
}