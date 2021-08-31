package gomes.filipe.Exercicio1;

import gomes.filipe.Exercicio1.domain.Cliente;

public class CriarConta {
    public static void main(String[] args) {
        Cliente fulano = new Cliente(
                "Mercado Pago",
                323,
                "0001",
                "00000000011",
                "Fulano Silva",
                "11122233344",
                1000000,
                "executivo"
                );

        fulano.imprimeDadosDoCliente("00000000011");

        fulano.deposita(500000);

        System.out.println("--- Novo saldo ---");
        fulano.saldo();

        fulano.imprimeDadosDoCliente("00000000011");

        System.out.println();

        fulano.consultaSaldo();
        fulano.depositaNaConta();
        fulano.transfereParaOutraConta();
        fulano.pagamentoDeServicos();
        fulano.saqueDaConta();

        System.out.println();

        Cliente bertrano = new Cliente(
                "Mercado Pago",
                323,
                "0001",
                "00000000012",
                "Bertrano Costa",
                "22244466688",
                12456,
                "basico"
        );

        bertrano.imprimeDadosDoCliente("00000000012");

        bertrano.deposita(857);

        System.out.println("--- Novo saldo ---");
        bertrano.saldo();

        bertrano.imprimeDadosDoCliente("00000000012");

        System.out.println();

        bertrano.consultaSaldo();
        bertrano.depositaNaConta();
        bertrano.transfereParaOutraConta();
        bertrano.pagamentoDeServicos();
        bertrano.saqueDaConta();

        Cliente ciclano = new Cliente(
                "Mercado Pago",
                323,
                "0001",
                "00000000013",
                "Ciclano Monteiro",
                "88833311122",
                45000,
                "coletores"
        );

        ciclano.imprimeDadosDoCliente("00000000013");

        ciclano.deposita(897000);

        System.out.println("--- Novo saldo ---");
        ciclano.saldo();

        ciclano.imprimeDadosDoCliente("00000000013");

        System.out.println();

        ciclano.consultaSaldo();
        ciclano.depositaNaConta();
        ciclano.transfereParaOutraConta();
        ciclano.pagamentoDeServicos();
        ciclano.saqueDaConta();

    }
}
