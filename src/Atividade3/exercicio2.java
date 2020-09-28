
package Atividade3;

import javax.swing.*;

public class exercicio2 {

    public static void main (String args []){

        int pessoas = 0;
        String aux = "", mensagem= "";

        try {
            aux =  JOptionPane.showInputDialog(null,"Quantidade de Pessoas:", "Pesquisa Regional!", 3);
            pessoas = Integer.parseInt(aux);

            int inp_idade, inp_sexo, inp_cabelo, qnt_mulheres = 0, qnt_cabelosCastanhos = 0, qnt_pessoas_over30 = 0, calc_porcentagem = 0;

            for (int i = 0; i < pessoas; i++) {

                String idade = JOptionPane.showInputDialog((i+1)+"º Pessoa - Insira a Idade:");
                inp_idade = Integer.parseInt(idade);

                String sexo = JOptionPane.showInputDialog((i+1)+"º Pessoa - Insira o Sexo:\n1 - Masculino\n2 - Feminino");
                inp_sexo = Integer.parseInt(sexo);

                String cabelo = JOptionPane.showInputDialog((i+1)+"º Pessoa - Insira a Cor do Cabelo:\n1 - Castanho\n2 - Preto\n3 - Loiro\n4 - Ruivo");
                inp_cabelo = Integer.parseInt(cabelo);

                if (inp_sexo == 2) {
                    qnt_mulheres++;
                }

                if (inp_idade >= 31){
                    qnt_pessoas_over30++;
                }
                if (inp_cabelo == 1) {
                    qnt_cabelosCastanhos++;
                }
            }

            qnt_pessoas_over30 = qnt_pessoas_over30 * 100;
            calc_porcentagem = qnt_pessoas_over30 / pessoas;


            mensagem = String.format("Quantidade de Mulheres na cidade: %d%nQuantidade de habitantes com cabelo castanho: %d%nPorcentagem de Habitantes com mais de 30 anos: %d%% ",qnt_mulheres,qnt_cabelosCastanhos,calc_porcentagem);
            JOptionPane.showMessageDialog(null, mensagem, "Resultado da pesquisa", 1);
        }
        catch (NumberFormatException fechamento) {
            JOptionPane.showMessageDialog(null, "Dados invalidos!", "Desculpe", 2);
            System.exit(0);
        }
    }
}