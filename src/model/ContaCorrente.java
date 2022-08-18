package model;

public class ContaCorrente extends Conta implements AssociadoVip{

    private int qdeCotas;
    public ContaCorrente() {
        super();
    }

    public ContaCorrente(double saldo, int qdeCotas) {
        this.saldo =saldo;
        this.qdeCotas = qdeCotas;
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public void setSaldo(double saldo) {
        super.setSaldo(saldo);
    }

    @Override
    public void deposita(double valor) {
        super.deposita(valor);
    }

    @Override
    public void atualiza(double taxa) {
        super.atualiza(taxa);
    }

    @Override
    public void saca(double valor) {
        super.saca(valor);
        double saldoAtual = saldo - valor;

        if (saldoAtual >= -200){
            saldo -= valor;
        } else {
            System.out.println("Não foi possível realizar o saque.");
        }
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "qdeCotas=" + qdeCotas +
                ", saldo=" + saldo +
                "} ";
    }



    @Override
    public String getValorCota() {
        return null;
    }

    @Override
    public void setValorCota(String valorCota) {

    }

    @Override
    public int getQdeCotas() {
        return qdeCotas;
    }

    @Override
    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }
}
