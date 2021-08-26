package EncapsulationOrnek2;

/**
 * Main
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public class Main {
    public static void main(String[] args) {
//        Abone abone = new Abone();
//        abone.bakiye=300;
//        abone.sehir="İstanbul";
//
//        abone.dogalgazKullan(400);

        EncAbone encAbone = new EncAbone("Goksel",300,"İstanbul");
        encAbone.dogalgazKullan(400);

    }
}