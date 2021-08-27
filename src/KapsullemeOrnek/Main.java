package KapsullemeOrnek;

/**
 * Main
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public class Main {
    public static void main(String[] args) {
//        Abone abone = new Abone();
//
//        abone.adi = "Goksel";
//        abone.bakiye=250;
//        abone.sehir="İstanbul";
//
//        abone.dogalgazKullan(250);

        EncAbone encAbone = new EncAbone("Goksel",250,"İstanbul");
        encAbone.bakiyeOgren();
    }
}