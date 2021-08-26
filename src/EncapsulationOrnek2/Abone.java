package EncapsulationOrnek2;

/**
 * Abone
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public class Abone {

    public String isim;
    public int bakiye;
    public String sehir;


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