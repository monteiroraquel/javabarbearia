package Pessoas;

public class Cliente extends Pessoa {


    public Cliente() {

    }
    public Cliente(int id, String nome, String cpf, String telefone, String email, String endereco) {
        super(id, nome, cpf, telefone, email, endereco);
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



