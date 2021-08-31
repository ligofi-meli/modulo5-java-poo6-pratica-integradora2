package gomes.filipe.Exercicio2;

import java.util.List;

public class Curriculo extends Imprimir {
    private final Pessoa pessoa = new Pessoa();
    //private  final Endereco endereco = new Endereco();

    public Curriculo(String nome, String idade, Endereco endereco, List<String> habilidades) {
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        pessoa.setEndereco(endereco);
        pessoa.setHabilidades(habilidades);
    }

    public void imprimir() {
        imprimir(this);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
}
