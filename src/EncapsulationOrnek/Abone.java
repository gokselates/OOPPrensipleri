package EncapsulationOrnek;

/**
 * Abone
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public class Abone {

    public String adi;
    public Long bakiye;
    public String sehir;

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

    /*
    İlk olarak özelliklerimizi tanımladık. Ancak bu sefer özelliklerimizi private değilde public olarak tanımladık. Bütün özellikleri public yaparak encapsulation a  aykırı bir durum yapmış olduk.

Ardından dogalgaz_kullan() metodumuzu oluşturduk. Miktar eğer bakiyemizden daha yüksek ise yeterli bakiye yok uyarısını verdik. Yeterli bakiyemiz var ise else durumuna girdik ve bakiyemizi azalttık. Ve diğer koşulları kontrol ettirdik.

Bir metot daha yazdık. bakiye_ogren() şeklinde.

Dikkat ederseniz constructor oluşturmadık. Constructor kullanmadan örneği daha iyi anlayacağız.
     */

}