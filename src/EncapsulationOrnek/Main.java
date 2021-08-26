package EncapsulationOrnek;

/**
 * Main
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public class Main {
    public static void main(String[] args) {
//        Abone abone = new Abone();
//        abone.adi="goksel";
//        abone.bakiye = 250L;
//        abone.sehir="İst";
//
//        abone.dogalgazKullan(250);
//        abone.bakiyeOgren();

        /*
        Birinci Dezavantaj
Bakiye özelliğine direk olarak ulaşabildiğimiz için saçma bir değer verdik. Kredi limitine 150 TL demiştik. Yani en fazla 150 yazabilmemiz gerekirken biz 200 değerini verebildik. Bu özelliği public yerine private olarak belirtseydik direk ulaşamayacağımız için saçma bir değer verme şansımız ortadan kalkacaktı. Bu ilk dezavantajı.

İkinci Dezavantaj
Abone classımız içinde 3 tane özellik tanımladık. Ancak bizim 20 tane özelliğimiz olsaydı ve bir tanesinin değerini başlatmayı unutsaydık böyle bir durumda ne olacaktı? O zaman classımızda belli yerler yanlış çalışacaktı. Tek tek değer vererek birini unutma ihtimalimiz yüksek. Eğer bir constructor şeklinde yapsaydık hiçbir değeri unutmayacaktık. Birini unuttuğumuz zaman kodun bir yerinin çalışmama ihtimali olacaktı. Bu da 2. dezavantajı. Örneğin ŞEhir yazılmayı unutulabilir

Üçüncü Dezavantaj
Abone classında tanımladığımız herhangi bir özelliğin adını değiştirdiğimizi düşünelim. Böyle bir durumda o özelliğin kullanıldığı main classında böyle bir özellik tanımlanamadı şeklinde uyarı ile karşılaşacaktık. Diyelim onu da düzelttik. Fakat bizim Abone classımızı bir çok class bir çok java programı kullansaydı böyle bir durumda tüm özellikleri tek tek düzeltecek miydik? İşte burda da 3. dezavantaj ortaya çıkıyor.
         */


        //Encapsulation

        EncAbone encAbone = new EncAbone("Göksel",250L,"İstanbul");
        encAbone.bakiyeOgren();

    }

}