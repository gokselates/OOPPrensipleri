package InheritanceOrnek;

/**
 * Calisan
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public class Calisan {

    private String isim;
    private Long maas;
    private String departman;

    public Calisan(String isim, Long maas, String departman) {
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }

    public void calis(){
        System.out.println("Çalış Metodu Çalışıyor");
    }

    public void bilgileriGoster(){
        System.out.println("isim :"+isim);
        System.out.println("Maaş :"+maas);
        System.out.println("Departman :"+departman);
    }

    public void departmanDegistir(String yeniDepartman){
        System.out.println("Departman Değiştiriliyor");
        this.departman = yeniDepartman;
        System.out.println("Yeni Departman "+this.departman);

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Long getMaas() {
        return maas;
    }

    public void setMaas(Long maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}