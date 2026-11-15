package nivel5.animal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("totó");
        Animal gato = new Gato("bixano");

        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(cachorro);
        animais.add(gato);

        for(Animal animal : animais){
            animal.emitirSom();
        }
    }
}
