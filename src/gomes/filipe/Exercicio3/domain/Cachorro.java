package gomes.filipe.Exercicio3.domain;

import gomes.filipe.Exercicio3.repository.ComerMeat;

public class Cachorro extends Animal implements ComerMeat {
    private String som;

    public Cachorro(String som) {
        this.som = som;
    }

    public void emitirSom() {
        emitirSom(this);
    }

    public void comerAnimal() {
        comerAnimal(this);
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    @Override
    public void comerMeat() {
        System.out.println("Cachorro é carnívoro!");
    }
}
