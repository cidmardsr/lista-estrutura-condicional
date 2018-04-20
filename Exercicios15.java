import javax.swing.JOptionPane;

public class Exercicios15{
    public static void main(String[] args){
        int numero1 = Integer.parseInt("Digite um numero");
        int numero2= Integer.parseInt("Digite um numero");
        int numero3 = Integer.parseInt("Digite um numero");

        if(numero1 > numero2 && numero2 > numero3){
            JOptionPane.showMessageDialog(null, "Em ordem decrescente: " + numero1 + numero2 + numero3);
        }else if(numero1 > numero2 && numero2 < numero3){
            JOptionPane.showMessageDialog(null, "Em ordem decrescente: " + numero1 + numero3 + numero2);
        }else if(numero2 > numero1 && numero1 > numero3){
            JOptionPane.showMessageDialog(null, "Em ordem decrescente: " + );
        }
    }
}