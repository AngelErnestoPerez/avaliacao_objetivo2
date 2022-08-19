package model;

public class Associado implements AssociadoVip{

    private final String nome;
    private final int qdeCotas;

    public Associado(String nome, int qdeCotas) {
        this.nome = nome;
        this.qdeCotas = qdeCotas;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Associado{" +
                "nome='" + nome + '\'' +
                ", qdeCotas=" + qdeCotas +
                '}';
    }


    @Override
    public int getQdeCotas() {
        return qdeCotas;
    }

}
