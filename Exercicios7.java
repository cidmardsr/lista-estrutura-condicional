import javax.swing.JOptionPane;

public class Exercicios7{
    public static void main(String[] args){
        String texto = "";
        int numero = Integer.parseInt(
            JOptionPane.showInputDialog("Digite um numero")
        );
        if(numero %2==0){
            texto = texto +"\nO numero é par";
        }else if(numero ==0){
            texto = texto +"\nO numero é neutro";
        }else if(numero %2!=0){
            texto = texto +"\nO numero é impar";
        }
        
        if(numero >0){
            texto = texto +"\nO numero é positivo";
        }else if(numero<0){
            texto = texto +"\nO numero é negativo";
        }
        

        if(numero >10){
            texto = texto +"\nO numero é maior que 10";
        }
        

        if(numero ==50){
           texto = texto +"\nO numero é igual a 50";
        }else if(numero <50){
            texto = texto +"\nO numero é menor que 50";
        
        if(numero >-10){
            texto = texto +"\nO numero não é menor que -10";
        }else if(numero <-10){
            texto = texto +"\nO numero é menor que -10";
        }
        
        if(numero ==30){
            texto = texto +"\nO numero é igual a 30";
        }else if(numero >30){
            texto = texto +"\nO numero é maior que 30";
        }
        
        if(numero !=1){
            JOptionPane.showMessageDialog(null, texto = texto +"\nO numero é diferente de 1");
        }
    }
}}