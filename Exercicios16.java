import javax.swing.JOptionPane;

public class Exercicios16{
    public static void main(String[] args) {
        double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Temperatura")); 
        
    
        
        String escalaOrigem = JOptionPane.showInputDialog
        (null, 
        "Selecione a escala de origem",
        "SISTEMA - Exercicicos",
        JOptionPane.QUESTION_MESSAGE,
        null,
        new Object[]{
                "", "Celsius", "Fahrenheit", "Kelvin"
        },
         ""    
    
        ).toString();
        System.out.println(escalaOrigem);
        if(escalaOrigem.equals("Celsius")){
            System.out.println("Celsius");
        }else if(escalaOrigem.equals("Fahrenheit")){
            System.out.println("Fahrenheit");
        }else if(escalaOrigem.equals("Kelvin")){
            System.out.println("Kelvin");
        }
        
        
        String escalaDestino = JOptionPane.showInputDialog
        (null,
        "Selecione a escala de destino",
        "SISTEMA - Exercicios",
        JOptionPane.QUESTION_MESSAGE,
        null,
        new Object[]{
            "", "Celsius", "Fahrenheit", "Kelvin"
        },
        ""

        ).toString();
        System.out.println(escalaDestino);
        if(escalaDestino.equals("Celsius")){
            System.out.println("Celsius");
        }else if(escalaDestino.equals("Fahrenheit")){
            System.out.println("Fahrenheit");
        }else if(escalaDestino.equals("Kelvin")){
            System.out.println("Kelvin");
        }
       
    }
}