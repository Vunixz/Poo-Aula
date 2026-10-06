package Aula10;

public class Gerente extends Funcionario { //Gerente, tal como Vendedor, é uma subclasse de Funcionario e portanto herda todos os atributos e métodos da classe Funcionario.
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}