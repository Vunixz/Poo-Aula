// ...existing code...
package Aula10;

public class App {
    public static void main(String[] args) {
        Gerente ger = new Gerente();
        ger.setNome("Gerente");
        ger.setDocumento("123456789");
        ger.setEndereco("Rua A, 123");
        ger.setMatricula("222");
        ger.setSalario(5000.00);
        ger.setBonus(3000.00);

        Vendedor vend1 = new Vendedor();
        vend1.setDocumento("987654321");
        vend1.setEndereco("Rua B, 456");
        vend1.setMatricula("333");
        vend1.setSalario(2000.00);
        vend1.setSetor("Vendas");

        System.out.println(ger);
        System.out.println(vend1);
    }
}