import javax.swing.JOptionPane;

public class Exercicios4{
    public static void main(String[] args){
      int numero = Integer.parseInt(
          JOptionPane.showInputDialog("Digite um numero")
      );
      if(numero ==0){
          JOptionPane.showMessageDialog(null, "O numero não é par");

      }else if(numero %2==0){
          JOptionPane.showMessageDialog(null, "O numero é par");
      }else if(numero %2!=0){
          JOptionPane.showMessageDialog(null, "O numero não é par");
      }
        
    }
}