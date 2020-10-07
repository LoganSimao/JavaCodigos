package atividade4;

public class pessoa {

    private String nome;
    private String CPF;
    private String telefone;
    private String email;
    private String dataNascimento;
    private String ClienteDesde;

    public pessoa() {
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getClienteDesde() {
        return ClienteDesde;
    }

    public void setClienteDesde(String ClienteDesde) {
        this.ClienteDesde = ClienteDesde;
    }

}

