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
      int subtra��o = primeiroNumero - segundoNumero;
      int multiplica��o = primeiroNumero * segundoNumero;
      int divis�o = primeiroNumero / segundoNumero;
      int primeiroProduto = primeiroNumero * primeiroNumero;
      int segundoProduto = segundoNumero * segundoNumero;
     
      JOptionPane.showMessageDialog(null, "A soma dos valores � " + soma + "\n A subtra��o dos valores � " + subtra��o + "\n A multiplica��o dos valores � " + multiplica��o + "\n A divis�o dos valores � " + divis�o + "\n O produto do primeiro numero � " + primeiroProduto + "\n E o produto do segundo numero � " + segundoProduto); 

   }

}