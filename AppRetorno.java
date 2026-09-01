
import javax.swing.JOptionPane;

public class AppRetorno {
    public static void main(String[] args){
        conta cc1 = new conta(123, "John Doe");
        cc1.depositar(5000);
        cc1.limite = 3000;

        boolean retorno = cc1.saque(9000);
        if (retorno == true){
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para saque!");
        }
    }
}
