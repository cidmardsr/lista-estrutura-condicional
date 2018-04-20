import javax.swing.JOptionPane;

public class Exercicio03{

   public static void main(String[] args){

      double litrosDia = Double.parseDouble(
                           JOptionPane.showInputDialog("Informe a quantidade de água que você ingere por dia")
      );
      int anos = Integer.parseInt(
                           JOptionPane.showInputDialog("Informe o periodo que você deseja")
      );
      double valor = Double.parseDouble(
                           JOptionPane.showInputDialog("Informe o valor do litro de água")
      );


      double totalLitros = (litrosDia * 365) * anos;

      double valorTotal = valor * totalLitros;

      JOptionPane.showMessageDialog(null, "A quantidade de litros consumida é " + totalLitros + "L e o valor total é R$" + valorTotal); 

   }

}