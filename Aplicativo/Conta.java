package Aplicativo;

public class Conta {
    int numero;
    double saldo;
    double limite;
    Cliente titular;

    public void infocc(){
        System.out.printf("Número: %d\n", this.numero);
        System.out.printf("Saldo: %.2f\n", this.saldo);
        System.out.printf("Limite: %.2f\n", this.limite);
        System.out.printf("Titular: %s %s\n", this.titular.nome, this.titular.sobrenome);
        
    }

    @Override
    public String toString() {
        return "Conta [numero=" + numero + ", saldo=" + saldo + ", limite=" + limite + ", titular=" + titular + "]";
    }
}
