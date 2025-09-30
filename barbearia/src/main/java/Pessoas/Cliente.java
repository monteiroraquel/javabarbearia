package Pessoas;

public class Cliente extends Pessoa {

    private int id;

    public Cliente() {

    }
    public Cliente(int id, String nome, String cpf, String telefone, String email, String endereco) {

        super(nome, cpf, telefone, email, endereco);
        this.id = id;

    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return  "\nId:" + getId() +
                "\nNome: " + getNome() +
                "\nCpf: " + getCpf() +
                "\nTelefone: " + getTelefone() +
                "\nEmail: " + getEmail() +
                "\nEndereco: " + getEndereco();
    }



}



