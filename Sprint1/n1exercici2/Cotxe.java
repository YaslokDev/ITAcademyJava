package Sprint1.n1exercici2;

public class Cotxe {
    private static final String MARCA = "Tesla";
    private static String model;
    private final double POTENCIA = 500;

    /* DIFERENCIAS
    static final: Se crea una variable constante que es compartida por todas las instancias de la clase
    y que no puede ser modificada una vez inicializada.

    static: La variable se comparte entre todas las instancias de la clase y acceder sin necesidad de crear
    una instancia. Es única para toda la clase y se puede acceder utilizando el nombre y un punto.

    final: Una vez asignado el valor no puede ser cambiado, se convierte en inmutable.

     */

    /*
    N’hi ha algun que es pugui inicialitzar al constructor de la classe?

    Todas se pueden inicializar en el constructor de la clase, pero en el case de static no se recomienda
    hacerlo en el constructor.
     */

    public static void frenar() {
        System.out.println("El vehicle està frenant");
    }

    public void accelerar() {
        System.out.println("El vehicle està accelerant");
    }

}
