package EncapsulationOrnek2;

/**
 * EncAbone
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public class EncAbone {

    private String isim;
    private int bakiye = 150;
    private String sehir;


    public EncAbone(String isim, int bakiye, String sehir) {
        this.isim = isim;

        if(bakiye >= 0 && bakiye<= 150){
            this.bakiye = bakiye;
        }

        this.sehir = sehir;
    }

    public void dogalgazKullan(int miktar){
        if(this.bakiye - miktar < 0){
            System.out.println("Yeterli Bakiye Yok");
        }else {
            this.bakiye -=miktar;
            if(this.bakiye <= 0){
                System.out.println("Bakiyeniz Bitmiştir. Kredi yükleyiniz Kredi Limitiniz 150 TL dir");
            } else {
                System.out.println("Yeni Bakiyeniz"+this.bakiye);
            }
        }
    }

    public void bakiyeOgren(){
        System.out.println("Bakiyeniz "+bakiye);
    }


}