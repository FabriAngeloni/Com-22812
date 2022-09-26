package Main;

public class Vaca extends Animal implements Herbivoro {

    private String sonido = "Muuu";

    public void emitirsonido() {
        System.out.println(this.sonido);
    }

    @Override
    public void comerHierbas(){
        System.out.println("El animal se encuentra comiendo hierbas...");
    }

    @Override
    public void comer(){
        comerHierbas();
    }


    public Vaca(String tipoDeAnimal) {
        super(tipoDeAnimal);
    }
}
