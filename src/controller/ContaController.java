package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ContaController {

    private static int qdeCotas = 0;
    private static double valorCota = 0.0;

    static double total_folha;

    static {
        total_folha = 0.0;
    }

    public static void main(String[] args) {

        //a:
        ContaCorrente cc1 = new ContaCorrente(300, 100);
        ContaCorrente cc2 = new ContaCorrente(700.00, 400);
        ContaCorrente cc3 = new ContaCorrente(1000.00, 600);
        ContaPoupanca cp1 = new ContaPoupanca();
        ContaPoupanca cp2 = new ContaPoupanca(2000.00);
        ContaPoupanca cp3 = new ContaPoupanca(400.00);
        Associado as1 = new Associado("Pedro", 300);
        Associado as2 = new Associado("João", 600);
        Associado as3 = new Associado("Carlos", 300);

        //b:
        System.out.print("\n\nContas criadas: ");
        List<Conta> contas = new ArrayList<>();
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        contas.add(cp1);
        contas.add(cp2);
        contas.add(cp3);

        System.out.print("\n\nAssociados criados: ");
        List<AssociadoVip> associados = new ArrayList<>();
        associados.add(as1);
        associados.add(as2);
        associados.add(as3);
        associados.add(cc1);
        associados.add(cc2);
        associados.add(cc3);

        //contas.sort(Comparator.comparingDouble(Conta::));
        //c:
        cp1.deposita(1800.00);
        cp1.saca(300.00);
        cp1.atualiza(0.05);
        System.out.println(cp1);

        cp2.deposita(800.00);
        cp2.saca(10.00);
        cp2.atualiza(0.05);
        System.out.println(cp2);

        cp3.deposita(180.00);
        cp3.saca(30.00);
        cp3.atualiza(0.05);
        System.out.println(cp3);

        //d:
        cc1.deposita(500.00);
        cc1.saca(400.00);
        cc1.atualiza(0.05);

        System.out.println(cc1);

        cc2.deposita(1000.00);
        cc2.saca(50.00);
        cc2.atualiza(0.05);
        System.out.println(cc2);

        cc3.deposita(1600.00);
        cc3.saca(60.00);
        cc3.atualiza(0.05);
        System.out.println(cc3);


        //f:

        associados.sort(Comparator.comparing(AssociadoVip::getQdeCotas).reversed());
        System.out.println(associados);

        //g:
        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println(contas);
      for (AssociadoVip associado : associados) {
         if (associado instanceof ContaCorrente){
             System.out.println(associado);
         }
        }


    }
}

