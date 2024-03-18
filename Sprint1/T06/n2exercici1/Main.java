package n2exercici1;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("Aitor", "Val Gil", 40);

        GenericMethods.imprimirArgumentos(persona.getNom() + " " + persona.getCognoms() + " , " + persona.getEdat(), "Cadena de texto", 25);
    }
}
