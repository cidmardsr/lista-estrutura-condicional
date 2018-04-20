import javax.swing.JOptionPane;

public class Exercicios13{
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        
        if(numero1 > numero2){
            JOptionPane.showMessageDialog(null, "O menor número é: " + numero2);
        }else if(numero1 < numero2){
            JOptionPane.showMessageDialog(null, "O menor número é: " + numero1);
        }
    }
}