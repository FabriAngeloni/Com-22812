package Main;

public class Main {
    public static void main(String[] args) {
        Animal g0 = new Gato("carnivoro");
        Animal v0 = new Vaca("herviboro");
        Animal p0 = new Perro("carnivoro");
        System.out.println("Gato: ");
        g0.comer();
        g0.emitirsonido();
        System.out.println("Vaca: ");
        v0.comer();
        v0.emitirsonido();
        System.out.println("Perro: ");
        p0.comer();
        p0.emitirsonido();

    }
}