package Atividade3;

import sun.awt.geom.AreaOp;

import javax.swing.*;

public class exercicio3 {


    public static void main(String[] args) {

        String mensagem = "",mensagem2 = "", mensagem3 = "", aux = "", qnt ="";
        int[] pv = new int[10];
        int[] novopv = new int[10];
        int y = 0;

        for (int x = 0; x <pv.length; x++){
            qnt = JOptionPane.showInputDialog("Insira os arrays");
            pv[x] = Integer.parseInt(qnt);
        }

        mensagem = "Leitura de 10 números e printe as posições pares com o dobro do valor original e os ímpares com o triplo do valor original!";
        JOptionPane.showMessageDialog(null, mensagem, "Java array", -1);
        mensagem2 = String.format("posição 0: %d\nPosição 1: %d\nPosição 2: %d\nPosição 3: %d\nPosição 4: %d\nPosição 5: %d\nPosição 6: %d\nPosição 7: %d\nPosição 8: %d\nPosição 9: %d\n",
                pv[0],pv[1],pv[2],pv[3],pv[4],pv[5],pv[6],pv[7],pv[8],pv[9]);
        JOptionPane.showMessageDialog(null,mensagem2, "Vetores 1", 1);
        for (int x = 1; x < pv.length; x++){
            if (pv[x]% 2 == 0) {
                y = (pv[x]*2);
                novopv[x] = y;
            }
            else {
                y = (pv[x] * 3);
                novopv[x] = y;

            }

        }
        mensagem3 = String.format("posição 0: %d\nPosição 1: %d\n Posição 2: %d\nPosição 3: %d\nPosição 4: %d\nPosição 5: %d\nPosição 6: %d\nPosição 7: %d\nPosição 8: %d\nPosição 9: %d\n",
                novopv[0],novopv[1],novopv[2],novopv[3],novopv[4],novopv[5],novopv[6],novopv[7],novopv[8],novopv[9]);
        JOptionPane.showMessageDialog(null,mensagem3, "Vetores multiplicados", 1);

    }
}
