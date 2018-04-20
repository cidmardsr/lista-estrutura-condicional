import javax.swing.JOptionPane;

public class Exercicio02{

   public static void main(String[] args){

      int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero"));

      int antecessor = numero - 1;
      int sucessor = numero + 1;

      JOptionPane.showMessageDialog(null, "O antecessor de " + numero + " é " + antecessor + " e o sucessor é " + sucessor);

   }

}