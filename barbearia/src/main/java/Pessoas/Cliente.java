package Pessoas;

public class Cliente extends Pessoa {

    protected int id;
    protected static int gerarid=1;

    public Cliente() { this.id=gerarid++;}
    public Cliente(int id, String nome, String cpf, String telefone, String email, String endereco) {

        super(nome, cpf, telefone, email, endereco);
        this.id=gerarid++;

    }

    public int getId() { return id;
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



