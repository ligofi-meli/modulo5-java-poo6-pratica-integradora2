package gomes.filipe.Exercicio3;

import gomes.filipe.Exercicio3.domain.Cachorro;
import gomes.filipe.Exercicio3.domain.Gato;
import gomes.filipe.Exercicio3.domain.Vaca;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Au Auuuuuuu");
        cachorro.emitirSom();
        cachorro.comerMeat();
        cachorro.comerAnimal();

        System.out.println();

        Gato gato = new Gato("Miauuuuuuuuuu");
        gato.emitirSom();
        gato.comerMeat();
        gato.comerAnimal();

        System.out.println();

        Vaca vaca =  new Vaca("MUUUUUUU");
        vaca.emitirSom();
        vaca.comerHerb();
        vaca.comerAnimal();
    }
}
