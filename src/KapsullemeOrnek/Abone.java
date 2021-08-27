package KapsullemeOrnek;

/**
 * Abone
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public class Abone {

    public String adi;
    public int bakiye;
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

}