package model;

public class Associado implements AssociadoVip{

    private String nome;
    private int qdeCotas;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Associado() {
        super();
    }

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
    public double lucros(int qdeCota, double valorCota) {
        return 0;

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
