package PontoApp;

public class Ponto {
    int x;

    void alteraX(int novoValor){
        this.x = novoValor; //uso opcional do this. Não é obrigatório
    }

    void novoAlteraX(int x){
        this.x = x; //o this é obrigatório para diferenciar o atributo x do parâmetro x(Para não criar ambiguidade)
    }
}
