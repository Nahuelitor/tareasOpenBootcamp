public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println("Mi coche tiene " + miCoche.getNumeroPuertas() + " puerta(s).");
    }
}