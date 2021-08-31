package gomes.filipe.Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> habilidades = new ArrayList<>();
        habilidades.add("Java");
        habilidades.add("React");
        habilidades.add("Desenvolvimento mobile");
        habilidades.add("Inglês fluente");

        Curriculo curriculo = new Curriculo("Maria Helena", "30", new Endereco("Avenida das Araras", 1, "00.000-010"), habilidades);
        curriculo.imprimir();

        System.out.println();
        Relatorio relatorio = new Relatorio(100, 247, "Ron Martinez", "Mariflor Rocha");
        relatorio.imprimir();

        System.out.println();
        LivroPdf livro = new LivroPdf(800, "Jhon Bevere ", "Implacável", "Auto ajuda");
        livro.imprimir();
    }
}
