import javax.swing.JOptionPane;

public class Exercicios14{
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));

        if(numero1 > numero2 && numero2 > numero3){
            JOptionPane.showMessageDialog(null, "A ordem crecente dos números é: " + numero1 + numero2 + numero3); 
        }else if(numero1 > numero2 && numero2 < numero3){
        
            JOptionPane.showMessageDialog(null, "A ordem crescente dos número é: " + numero1 + numero3 + numero2);
        }else if(numero2 > numero1 && numero1 > numero3){
        
            JOptionPane.showMessageDialog(null, "A ordem crescente do números e: " + numero2 + numero1 + numero3);
        }else if(numero2 > numero1 && numero1 < numero3){
        
            JOptionPane.showMessageDialog(null, "A ordem crescente dos números é: " + numero2 + numero3 + numero1);
        }else if(numero3 > numero2 && numero2 > numero1){
            JOptionPane.showMessageDialog(null, "A ordem crescente dos números é: " + numero3 + numero2 + numero1);
        }else if(numero3 > numero2 && numero2 < numero1){
            JOptionPane.showMessageDialog(null, "A ordem crescente dos números é: " + numero3 + numero1 + numero2);
        }else if(numero3 > numero1 && numero2 < numero1){
    
        }

        


    }
}