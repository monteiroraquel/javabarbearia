/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;

/**
 *
 * @author KEL
 */
public class Funcionario extends Pessoa {

    protected int id;
    protected static int gerarid=1;
    protected String cargo;
    protected double salario;
    protected String login;
    protected int senha;

    public Funcionario() { this.id=gerarid++;}

    public Funcionario(String cargo, double salario, String login, int senha, int id, String nome, String cpf, String telefone, String email, String endereco) {
        super(nome, cpf, telefone, email, endereco);
        this.id=gerarid++;
        this.cargo = cargo;
        this.salario = salario;
        this.login = login;
        this.senha = senha;
    }

    public int getId(){ return id; }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
public String toString() {
    return "Funcionario:\n" +
           "ID: " + id + "\n" +
           "Nome: " + nome + "\n" +
           "Telefone: " + telefone + "\n" +
           "Email: " + email + "\n" +
           "CPF: " + cpf + "\n" +
           "Endereço: " + endereco + "\n" +
           "Cargo: " + cargo + "\n" +
           "Salário: " + salario;
    }

}

