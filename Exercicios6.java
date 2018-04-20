import javax.swing.JOptionPane;

public class Exercicios6{
    public static void main(String[] args){
        int numero = Integer.parseInt(
            JOptionPane.showInputDialog("Digite um numero")
        );
        if(numero ==1){
            JOptionPane.showMessageDialog(null, "O numero é igual a 1");
        }else if(numero <1){
            JOptionPane.showMessageDialog(null, "O numero não é igual a 1");
        }else if(numero >1){
            JOptionPane.showMessageDialog(null, "O numero não é igual a 1");
        }
    }
}