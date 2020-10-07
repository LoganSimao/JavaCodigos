package atividade4;

import javax.swing.*;


public class interacaoHerancas {


    public static void main(String[] args) {
        String [] arraysAux = new String[6];
        String [] arraysAux2 = new String[9];

        clientes C = new clientes();


        for(int x = 0; x < arraysAux.length; x++){
            arraysAux[x] = JOptionPane.showInputDialog(null,"Dados necessários! \n1 - Nome\n2 - CPF\n3 - Telefone\n4 - Email\n5 - Data de Nascimento\n" +
                    "6 - Cliente Desde\n\nInsira o "+(x+1)+"º Dado!","Entrada de Dados dos Clientes!",3);
        }


        C.setNome(arraysAux[0]);
        C.setCPF(arraysAux[1]);
        C.setTelefone(arraysAux[2]);
        C.setEmail(arraysAux[3]);
        C.setDataNascimento(arraysAux[4]);
        C.setClienteDesde(arraysAux[5]);

        JOptionPane.showMessageDialog(null,"Nome: " + C.getNome()
                + "\nCPF: " + C.getCPF()
                + "\nTelefone: " + C.getTelefone()
                + "\nEmail: " + C.getEmail()
                + "\nData de Nascimento: " + C.getDataNascimento()
                + "\nCliente desde: " + C.getClienteDesde(),"Saída de Dados!",1);

        funcionarios F = new funcionarios();

        for(int x = 0; x < arraysAux2.length; x++){
            arraysAux2[x] = JOptionPane.showInputDialog(null,"Dados necessários! \n1 - Nome\n2 - CPF\n3 - Telefone\n4 - Email\n5 - Data de Nascimento\n6 - Nº Registro\n" +
                    "7 - N° Carteira de Trabalho\n8 - Nº Pis\n\nInsira o "+(x+1)+"º Dado!","Entrada de Dados dos Funcionários!",3);
        }


        F.setNome(arraysAux2[0]);
        F.setCPF(arraysAux2[1]);
        F.setTelefone(arraysAux2[2]);
        F.setEmail(arraysAux2[3]);
        F.setDataNascimento(arraysAux2[4]);
        F.setClienteDesde(arraysAux2[5]);
        F.setRegistro(arraysAux2[6]);
        F.setCarteiraTrabalho(arraysAux2[7]);
        F.setPis(arraysAux2[8]);

        JOptionPane.showMessageDialog(null,"\n\nNome: " + F.getNome()
                + "\nCPF: " + F.getCPF()
                + "\nTelefone: " + F.getTelefone()
                + "\nEmail: " + F.getEmail()
                + "\nData de Nascimento: " + F.getDataNascimento()
                + "\nCliente desde: " + F.getClienteDesde()
                + "\nRegistro: " + F.getRegistro()
                + "\nCarteira de Trabalho: " + F.getCarteiraTrabalho()
                + "\nPis: " + F.getPis(),"Saída de dados!",1);

    }

}
