import javax.swing.JOptionPane;

public class Exercicio07{

   public static void main(String[] args){

      double nota1 = Double.parseDouble(
                     JOptionPane.showInputDialog("Informe sua primeira nota")
      );
      double nota2 = Double.parseDouble(
                     JOptionPane.showInputDialog("Informe sua segunda nota")
      );
      double nota3 = Double.parseDouble(
                     JOptionPane.showInputDialog("Informe sua terceira nota")
      );
      double nota4 = Double.parseDouble(
                     JOptionPane.showInputDialog("Informe sua quarta nota")
      );
      double media = (nota1 + nota2 + nota3 + nota4)/4;

      
      JOptionPane.showMessageDialog(null, "Sua média é " + media); 

   }

}