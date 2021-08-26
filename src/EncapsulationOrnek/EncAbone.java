package EncapsulationOrnek;

/**
 * EncAbone
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public class EncAbone {

    private String adi;
    private Long bakiye = 150L;
    private String sehir;

    public EncAbone(String adi, Long bakiye, String sehir) {
        this.adi = adi;

        if (bakiye >= 0 && bakiye <= 150){
            this.bakiye = bakiye;
        }

        this.sehir = sehir;
    }

    public void dogalgazKullan(int miktar){
        if (this.bakiye - miktar < 0){
            System.out.println("Yeterli Bakiye Yok");
        }else {
            this.bakiye -= miktar;

            if(this.bakiye <= 0){
                System.out.println("Bakiyeniz Bitmiştir Kredi Yükleyiniz Kredi limiti 150TL");
            } else {
                System.out.println("Yeni Bakiye "+bakiye);
            }
        }
    }

    public void bakiyeOgren(){
        System.out.println("Bakiye"+bakiye);
    }

}