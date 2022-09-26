package Main;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Gato extends Animal implements Carnivoro{
    private String sonido = "Miauu";

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

    public Gato(String tipoDeAnimal) {
        super(tipoDeAnimal);
    }
}
