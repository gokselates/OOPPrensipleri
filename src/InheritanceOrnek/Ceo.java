package InheritanceOrnek;

/**
 * Ceo
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public class Ceo extends Calisan{

    private int sorumlukisi;

    public Ceo(String isim, Long maas, String departman,int sorumlukisi) {
        super(isim, maas, departman);
        this.sorumlukisi = sorumlukisi;
    }


    public void calis() {
        System.out.println("Custon Çalış Çalıştır");
    }
}