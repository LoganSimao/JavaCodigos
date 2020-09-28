package Atividade3;

import javax.swing.*;


public class teste {
    public static void main(String[]args){
    double altura[] = new double[10];
    double soma = 0, media = 0;

    String aux, novo;
    int  transfer = 0;
    float totalaltura = 0;

    for(int i = 0; i< altura.lenght;i++)

        {
            altura[] = JOptionPane.showInputDialog(null, "Insira a" + i + "ªaltura em metros: ");
            transfer = Integer.parseInt(altura[]);
            totalaltura = totalaltura + transfer;
        }

        media =totalaltura /10;

    JOptionPane.showMessageDialog(null,"A média das 10 alturas = "+media);
}
}