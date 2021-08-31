package gomes.filipe.Exercicio3.domain;

import gomes.filipe.Exercicio3.repository.ComerHerb;

public class Vaca extends Animal implements ComerHerb {
    private String som;

    public Vaca(String som) {
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
    public void comerHerb() {
        System.out.println("Vaca é Herbivoro!");
    }
}
