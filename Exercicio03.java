import javax.swing.JOptionPane;

public class Exercicio03{

   public static void main(String[] args){

      double litrosDia = Double.parseDouble(
                           JOptionPane.showInputDialog("Informe a quantidade de �gua que voc� ingere por dia")
      );
      int anos = Integer.parseInt(
                           JOptionPane.showInputDialog("Informe o periodo que voc� deseja")
      );
      double valor = Double.parseDouble(
                           JOptionPane.showInputDialog("Informe o valor do litro de �gua")
      );


      double totalLitros = (litrosDia * 365) * anos;

      double valorTotal = valor * totalLitros;

      JOptionPane.showMessageDialog(null, "A quantidade de litros consumida � " + totalLitros + "L e o valor total � R$" + valorTotal); 

   }

}