package Contas;
public class Conta{
    int numero;
    String titular;
    double saldo;
    double limite;

    //construtor
    public Conta(int numero){
        this.numero = numero;
    }
    public Conta(int num, String tit){
        this.numero = num;
        this.titular = tit;
    }
    //metodo = funcao para exibir os dados da conta
    /**
     * Metodo que exibe as informações da conta.
     */
    public void exibirInformacoes(){
        System.out.printf("----------Número da conta: %d -----------\n", this.numero);
        System.out.printf("    Titular da conta: %s\n", this.titular);
        System.out.printf("    Saldo da conta: %.2f\n", this.saldo);
        System.out.printf("    Limite da conta: %.2f\n", this.limite);
        System.out.printf("----------Limite disponível: %.2f----------\n", this.saldo + this.limite);
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.printf("===== Valor depositado: %.2f ======\n", valor);
        } else if (valor <=0){
            System.out.printf("Valor inválido para depósito: %.2f\n", valor);
        }
        else{
            System.out.printf("Valor inválido para depósito: %.2f\n", valor);
        }
        
    }

    public boolean saque(double valor){
        if(valor > 0 && valor <= this.saldo + this.limite){
            this.saldo -= valor;
            System.out.printf("===== Valor sacado: %.2f ======\n", valor);
            return true;
        } else if (valor <= 0){
            System.out.printf("Valor inválido para saque: %.2f\n", valor);
            return false;
        }
        else{
            System.out.printf("Saldo insuficiente para saque de: %.2f\n", valor);
            return false;
        }
    }





}