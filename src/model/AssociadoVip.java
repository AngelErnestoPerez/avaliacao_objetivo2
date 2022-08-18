package model;

public interface AssociadoVip {


    //os métodos em uma 'interface' são, por natureza, públicos e abstratos
    default double lucros(int qdeCotas, double valorCota) {
        return 0;
    }
    String getValorCota();
    void setValorCota(String valorCota);
    int getQdeCotas();
    void setQdeCotas(int qdeCotas);

}
