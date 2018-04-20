import javax.swing.JOptionPane;

public class exercicio08{

   public static void main(String[] args){

    double contaLuz = Double.parseDouble(
                 JOptionPane.showInputDialog("Informe o valor da conta de Luz")
    ); 
    double contaAgua = Double.parseDouble(
                 JOptionPane.showInputDialog("Informe o valor da conta de água")
    );
    double contaNet = Double.parseDouble(
                 JOptionPane.showInputDialog("Informe o valor da conta NET")
    );
    double contaVivo = Double.parseDouble(
                 JOptionPane.showInputDialog("Informe o valor da conta Vivo")
    );
    double contaOi = Double.parseDouble(
                 JOptionPane.showInputDialog("Informe o valor da conta Oi")
    );
    double valorIptu = Double.parseDouble(
                 JOptionPane.showInputDialog("Informe o valor do IPTU")
    );
    double valorIpva = Double.parseDouble(
                 JOptionPane.showInputDialog("Informe o valor do IPVA")
    );
    double valorSeguro = Double.parseDouble(
                 JOptionPane.showInputDialog("Informe o valor do seguro do carro")
    );

    double telefone = contaVivo + contaOi;
    double impostos = valorIptu + valorIpva;
    double restante = contaLuz + contaAgua + contaNet + valorSeguro;
    double total = telefone + impostos + restante;

    JOptionPane.showMessageDialog(null, "O valor total das contas de telefone é: " + telefone + 
    "\n" + 
    "O valor total dos impostos é: " + impostos + 
    "\n" + 
    "O valor do restante das contas é: " + restante +  
    "\n" + 
    "O valor total das contas é: " + total);
   }

}