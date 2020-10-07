package Atividade3;

import javax.swing.*;
import java.io.InputStream;

public class exercicio1 {

    public static void main(String args[]) {
        InputStream cor = (System.in);
        System.out.println(cor);
        System.exit(0);
        novamente();
    }
    public static void novamente() {
        try {
            int A = 0;
            String aux = "", outmensagem = "";

            aux = JOptionPane.showInputDialog(null, "Quantidade de Pessoas");
            A = Integer.parseInt(aux);

            double contador = 0, valor_novo = 0, altura_menor = 100, altura_nova = 0, alturaX = 0, altura_maior = 0;
            int idadeX, sexoX, mais_velho = 0, mais_nova = 120;
            for (int i = 0; i < A; i++) {

                String altura2 = JOptionPane.showInputDialog((i + 1) + "º Pessoa - Digite a altura");
                altura2 = altura2.replace(',', '.');
                alturaX = Double.parseDouble(altura2);

                String idade = JOptionPane.showInputDialog((i + 1) + "º Pessoa - Digite a idade");
                idadeX = Integer.parseInt(idade);

                String sexo = JOptionPane.showInputDialog((i + 1) + "º Pessoa - Informe o sexo\n1 = Masculino\n2 = Feminino");
                sexoX = Integer.parseInt(sexo);

                if (altura_maior < alturaX) {
                    altura_maior = alturaX;
                }
                if (altura_menor > alturaX) {
                    altura_menor = alturaX;
                }
                if (sexoX == 2) {
                    valor_novo += alturaX;
                    contador++;
                }
                if (sexoX == 1) {
                    if (mais_velho < idadeX) {
                        mais_velho = idadeX;
                    }
                }
                if (sexoX == 2) {
                    if (mais_nova > idadeX) {
                        mais_nova = idadeX;
                    }
                }
            }
            valor_novo = valor_novo / contador;
            outmensagem = String.format("Maior altura: %.2fM%nMenor Altura: %.2fM%nAltura media das mulheres: %.2fM%nO homem mais velho tem: %d anos%nA mulher mais nova tem: %d anos", altura_maior, altura_menor, valor_novo, mais_velho, mais_nova);
            JOptionPane.showMessageDialog(null, outmensagem, "Resultado da pesquisa", 1);

        }
        catch(NumberFormatException again){
            System.exit(0);
        }
    }
}
