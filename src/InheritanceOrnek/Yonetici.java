package InheritanceOrnek;

/**
 * Yonetici
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public class Yonetici extends Calisan{

    private int sorumluKisi;

    public Yonetici(String isim, Long maas, String departman,int sorumluKisi) {
        super(isim, maas, departman);
        this.sorumluKisi = sorumluKisi;
    }

    public void zamYap(int zamMiktari){
        System.out.println(zamMiktari+" kadar zam yapıldı");
    }

    public void bilgileriGoster(){
        System.out.println("isim :"+getIsim());
        System.out.println("Maaş :"+getMaas());
        System.out.println("Departman :"+getDepartman());

        System.out.println("Sorumlu Kişi Sayısı "+this.sorumluKisi);
    }
}