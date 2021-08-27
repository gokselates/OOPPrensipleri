package InheritanceOrnek;

/**
 * Main
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public class Main {
    public static void main(String[] args) {

        Ceo ceo = (Ceo) new Calisan("Ahmet",2L,"fe");
        ceo.calis();
    }

}