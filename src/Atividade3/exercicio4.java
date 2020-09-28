package Atividade3;

import javax.swing.*;


public class exercicio4 {
    public static void main(String[]args){
        try{
        double [] altura = new double[10];
        double soma = 0, media = 0;
        String arrays;

        for(int x = 0; x< altura.length;x++)

        {
            arrays = JOptionPane.showInputDialog(null, "Insira a " + (x+1) + "ª altura em metros: ");
            arrays = arrays.replace(',','.');
            altura[x] = Double.parseDouble(arrays);
            soma += altura[x];
        }

        media =soma /10;
        String formato = String.format("%.2f",media);
        JOptionPane.showMessageDialog(null,"A média das 10 alturas é: "+ formato);
    }
        catch (NumberFormatException sair){
            System.exit(0);
        }
    }
}