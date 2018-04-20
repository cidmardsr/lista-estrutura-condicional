import javax.swing.JOptionPane;

public class Exercicio04{

   public static void main(String[] args){

      int primeiroNumero = Integer.parseInt(
                 JOptionPane.showInputDialog("Digite um numero inteiro")
      );

      int segundoNumero = Integer.parseInt(
                 JOptionPane.showInputDialog("Digite outro numero inteiro")
      );

      int soma = primeiroNumero + segundoNumero;
      int subtração = primeiroNumero - segundoNumero;
      int multiplicação = primeiroNumero * segundoNumero;
      int divisão = primeiroNumero / segundoNumero;
      int primeiroProduto = primeiroNumero * primeiroNumero;
      int segundoProduto = segundoNumero * segundoNumero;
     
      JOptionPane.showMessageDialog(null, "A soma dos valores é " + soma + "\n A subtração dos valores é " + subtração + "\n A multiplicação dos valores é " + multiplicação + "\n A divisão dos valores é " + divisão + "\n O produto do primeiro numero é " + primeiroProduto + "\n E o produto do segundo numero é " + segundoProduto); 

   }

}