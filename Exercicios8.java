import javax.swing.JOptionPane;

public class Exercicios8{
    public static void main(String[] args){
        
        double preco1 = 0;
        double total = preco1;       
        
        String nome1 = JOptionPane.showInputDialog("Escolha um produto do cardápio"+
        "\nTipo               Nome                       Valor" +
        "\nBolos              Bolo Brigadeiro            R$ 29.50" +
        "\nBolos              Bolo Floresta Negra        R$ 2.00" +
        "\nBolos              Bolo Leite com Nutella     R$ 29.23" +
        "\nBolos              Bolo Mousse de Chocolate   R$ 7.10" +
        "\nBolos              Bolo Nega Maluca           R$ 19.33" +
        "\nDoces              Bomba de Creme             R$ 17.71" +
        "\nDoces              Bomba de Morango           R$ 4.82" +
        "\nSanduíches         Filé-Mignon com fritas e   R$ 21.16" +
        "\n                   cheddar" +
        "\nSanduíches         Hambúrguer com queijos,    R$ 12.70" +
        "\n                   champignon e rúcula" +
        "\nSanduíches         Provolone com salame       R$ 19.70" +
        "\nSanduíches         Vegetariano de berinjela   R$ 28.22" +
        "\nPizzas             Calabresa                  R$ 8.98" +
        "\nPizzas             Napolitana                 R$ 0.42" +
        "\nPizzas             Peruana                    R$ 18.36" +
        "\nPizzas             Portuguesa                 R$ 27.50");

        String nome2 = JOptionPane.showInputDialog("Escolha um produto do cardápio"+
        "\nTipo               Nome                       Valor" +
        "\nBolos              Bolo Brigadeiro            R$ 29.50" +
        "\nBolos              Bolo Floresta Negra        R$ 2.00" +
        "\nBolos              Bolo Leite com Nutella     R$ 29.23" +
        "\nBolos              Bolo Mousse de Chocolate   R$ 7.10" +
        "\nBolos              Bolo Nega Maluca           R$ 19.33" +
        "\nDoces              Bomba de Creme             R$ 17.71" +
        "\nDoces              Bomba de Morango           R$ 4.82" +
        "\nSanduíches         Filé-Mignon com fritas e   R$ 21.16" +
        "\n                   cheddar" +
        "\nSanduíches         Hambúrguer com queijos,    R$ 12.70" +
        "\n                   champignon e rúcula" +
        "\nSanduíches         Provolone com salame       R$ 19.70" +
        "\nSanduíches         Vegetariano de berinjela   R$ 28.22" +
        "\nPizzas             Calabresa                  R$ 8.98" +
        "\nPizzas             Napolitana                 R$ 0.42" +
        "\nPizzas             Peruana                    R$ 18.36" +
        "\nPizzas             Portuguesa                 R$ 27.50");

        String nome3 = JOptionPane.showInputDialog("Escolha um produto do cardápio"+
        "\nTipo               Nome                       Valor" +
        "\nBolos              Bolo Brigadeiro            R$ 29.50" +
        "\nBolos              Bolo Floresta Negra        R$ 2.00" +
        "\nBolos              Bolo Leite com Nutella     R$ 29.23" +
        "\nBolos              Bolo Mousse de Chocolate   R$ 7.10" +
        "\nBolos              Bolo Nega Maluca           R$ 19.33" +
        "\nDoces              Bomba de Creme             R$ 17.71" +
        "\nDoces              Bomba de Morango           R$ 4.82" +
        "\nSanduíches         Filé-Mignon com fritas e   R$ 21.16" +
        "\n                   cheddar" +
        "\nSanduíches         Hambúrguer com queijos,    R$ 12.70" +
        "\n                   champignon e rúcula" +
        "\nSanduíches         Provolone com salame       R$ 19.70" +
        "\nSanduíches         Vegetariano de berinjela   R$ 28.22" +
        "\nPizzas             Calabresa                  R$ 8.98" +
        "\nPizzas             Napolitana                 R$ 0.42" +
        "\nPizzas             Peruana                    R$ 18.36" +
        "\nPizzas             Portuguesa                 R$ 27.50");

        if(nome1.equalsIgnoreCase("Bolo Brigadeiro")){
                total = total + 29.50;                    
            }else if(nome1.equalsIgnoreCase("Bolo Floresta Negra")){
                total = total + 2.00;
            }else if(nome1.equalsIgnoreCase("Bolo Leite com Nutella")){
                total = total + 29.23;
            }else if(nome1.equalsIgnoreCase("Bolo Mousse de Chocolate")){
                total = total + 7.10;
            }else if(nome1.equalsIgnoreCase("Bolo Nega Maluca")){
                total = total + 19.33;
            }else if(nome1.equalsIgnoreCase("Bomba de Creme")){
                total = total + 17.71;
            }else if(nome1.equalsIgnoreCase("Bomba de Morango")){
                total = total + 4.82;
            }else if(nome1.equalsIgnoreCase("Filé-Mignon com fritas e cheddar")){
                total = total + 21.16;
            }else if(nome1.equalsIgnoreCase("Hambúrguer com queijos, champignon e rúcula")){
                total = total + 12.70;
            }else if(nome1.equalsIgnoreCase("Provolone com salame")){
                total = total + 19.70;
            }else if(nome1.equalsIgnoreCase("Vegetariano de berinjela")){
                total = total + 28.22;
            }else if(nome1.equalsIgnoreCase("Calabresa")){
                total = total + 8.98;
            }else if(nome1.equalsIgnoreCase("Napolitana")){
                total = total + 0.42;
            }else if(nome1.equalsIgnoreCase("Peruana")){
                total = total + 18.36;
            }else if(nome1.equalsIgnoreCase("Portuguesa")){
                total = total + 27.50;
            }
            if(nome2.equalsIgnoreCase("Bolo Brigadeiro")){
                total = total + 29.50;                    
            }else if(nome2.equalsIgnoreCase("Bolo Floresta Negra")){
                total = total + 2.00;
            }else if(nome2.equalsIgnoreCase("Bolo Leite com Nutella")){
                total = total + 29.23;
            }else if(nome2.equalsIgnoreCase("Bolo Mousse de Chocolate")){
                total = total + 7.10;
            }else if(nome2.equalsIgnoreCase("Bolo Nega Maluca")){
                total = total + 19.33;
            }else if(nome2.equalsIgnoreCase("Bomba de Creme")){
                total = total + 17.71;
            }else if(nome2.equalsIgnoreCase("Bomba de Morango")){
                total = total + 4.82;
            }else if(nome2.equalsIgnoreCase("Filé-Mignon com fritas e cheddar")){
                total = total + 21.16;
            }else if(nome2.equalsIgnoreCase("Hambúrguer com queijos, champignon e rúcula")){
                total = total + 12.70;
            }else if(nome2.equalsIgnoreCase("Provolone com salame")){
                total = total + 19.70;
            }else if(nome2.equalsIgnoreCase("Vegetariano de berinjela")){
                total = total + 28.22;
            }else if(nome2.equalsIgnoreCase("Calabresa")){
                total = total + 8.98;
            }else if(nome2.equalsIgnoreCase("Napolitana")){
                total = total + 0.42;
            }else if(nome2.equalsIgnoreCase("Peruana")){
                total = total + 18.36;
            }else if(nome2.equalsIgnoreCase("Portuguesa")){
                total = total + 27.50;
            }
            if(nome3.equalsIgnoreCase("Bolo Brigadeiro")){
                total = total + 29.50;                    
            }else if(nome3.equalsIgnoreCase("Bolo Floresta Negra")){
                total = total + 2.00;
            }else if(nome3.equalsIgnoreCase("Bolo Leite com Nutella")){
                total = total + 29.23;
            }else if(nome3.equalsIgnoreCase("Bolo Mousse de Chocolate")){
                total = total + 7.10;
            }else if(nome3.equalsIgnoreCase("Bolo Nega Maluca")){
                total = total + 19.33;
            }else if(nome3.equalsIgnoreCase("Bomba de Creme")){
                total = total + 17.71;
            }else if(nome3.equalsIgnoreCase("Bomba de Morango")){
                total = total + 4.82;
            }else if(nome3.equalsIgnoreCase("Filé-Mignon com fritas e cheddar")){
                total = total + 21.16;
            }else if(nome3.equalsIgnoreCase("Hambúrguer com queijos, champignon e rúcula")){
                total = total + 12.70;
            }else if(nome3.equalsIgnoreCase("Provolone com salame")){
                total = total + 19.70;
            }else if(nome3.equalsIgnoreCase("Vegetariano de berinjela")){
                total = total + 28.22;
            }else if(nome3.equalsIgnoreCase("Calabresa")){
                total = total + 8.98;
            }else if(nome3.equalsIgnoreCase("Napolitana")){
                total = total + 0.42;
            }else if(nome3.equalsIgnoreCase("Peruana")){
                total = total + 18.36;
            }else if(nome3.equalsIgnoreCase("Portuguesa")){
                JOptionPane.showMessageDialog(null, "total = total + 27.50 + total = total + 27.50 + total = total + 27.50");
                
            }
    }
}