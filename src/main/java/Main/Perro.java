package Main;

public class Perro extends Animal implements Carnivoro{
    private String sonido = "Guauu";
    public void emitirsonido() {
        System.out.println(this.sonido);
    }

    @Override
    public void comerCarne() {
        System.out.println("El animal se encuentra comiendo carne...");
    }

    @Override
    protected void comer() {
        comerCarne();
    }

    public Perro(String tipoDeAnimal) {
        super(tipoDeAnimal);
    }
}
