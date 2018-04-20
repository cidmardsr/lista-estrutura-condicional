import javax.swing.JOptionPane;

public class Exercicio06{

   public static void main(String[] args){

      String nomeVeiculo = JOptionPane.showInputDialog("Informe o nome do veiculo");
      double valorVeiculo = Double.parseDouble(
                         JOptionPane.showInputDialog("Informe o valor do veiculo")
      );
      double valorParcela = Double.parseDouble(
                         JOptionPane.showInputDialog("Informe o valor de cada parcela")
      );
      int quantidadeMeses = Integer.parseInt(
                         JOptionPane.showInputDialog("Informe a quantidade de meses que o carro foi financiado")
      );
      String nome = nomeVeiculo;
      double valor = valorVeiculo;
      double valorParcelas = valorParcela;
      int quantidadeParcelas = quantidadeMeses;
      double valorTotal = valorParcela * quantidadeMeses;
      double diferençaValor = valorTotal - valorVeiculo;
      


      JOptionPane.showMessageDialog(null, "O nome do carro é: " + nomeVeiculo + 
      "\n" + 
      "O valor do carro é: " + valorVeiculo + 
      "\n" + 
      "O valor de cada parcela é: " + valorParcelas + 
      "\n" + 
      "A quantidade de parcelas é: " + quantidadeParcelas + 
      "\n" + 
      "O valor total do financiamento é: " + valorTotal + 
      "\n" + 
      "A diferença entre o financiamento e o valor do veiculo é: " + diferençaValor);

   }

}