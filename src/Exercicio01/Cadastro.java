package Exercicio01;

public class Cadastro {
    String nome, pai, mae;
    int idade;

    public boolean compareNames(){
        return nome.length() > pai.length() && nome.length() > mae.length();
    }
    public String cadastroPessoa(){
        return "Nome: " + nome + " | Idade: " + idade + "\nMãe: " + mae + " | Pai: " + pai;
    }
}
