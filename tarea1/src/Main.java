// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int resultado = suma(2,3,5);
        System.out.println("El resultado de la suma es: " + resultado);
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println("Mi coche tiene " + miCoche.getNumeroPuertas() + " puerta(s).");
    }
    public static int suma(int a, int b, int c) {
            return a + b + c;
    }

    public class Coche {
        private int numeroPuertas;

        public void incrementarPuertas() {
            numeroPuertas++;
        }

        public int getNumeroPuertas() {
            return numeroPuertas;
        }
    }



}