import javax.swing.JOptionPane;

public class Exercicios11{
    public static void main(String[] args){
        double nota1 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite sua primeira nota")
        );
        double nota2 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite sua segunda nota")
        );
        double nota3 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite sua terceira nota")
        );
        double nota4 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite sua quarta nota")
        );
        double nota5 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite sua quinta nota")
        );
        double media = (nota1 + nota2 + nota3 + nota4 + nota5)/5;

        if(media <= 5.99){
            JOptionPane.showMessageDialog(null, "Reprovado");
        }else if(media <= 7.99){
            JOptionPane.showMessageDialog(null, "Recuperação");
        }else {
            JOptionPane.showMessageDialog(null, "Aprovado");
        }

    }
}