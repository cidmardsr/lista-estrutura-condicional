import javax.swing.JOptionPane;

public class Exercicios12{
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
        if(numero1 > numero2){
            JOptionPane.showMessageDialog(null, "O maior número é: " + numero1);
        }else if(numero1 < numero2){
            JOptionPane.showMessageDialog(null, "O maior número é: " + numero2);
        }
    }
}