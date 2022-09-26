package Main;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public abstract class Animal{
    private String tipoDeAnimal;


    protected void emitirsonido() {
    }

    protected void comer(){
    }

    protected void comerAnimal(String animal){
    }

    public Animal(String tipoDeAnimal) {
        this.tipoDeAnimal = tipoDeAnimal;
    }


}
