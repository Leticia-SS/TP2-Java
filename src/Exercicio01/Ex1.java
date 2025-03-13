package Exercicio01;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Cadastro pessoa1 = new Cadastro();

        System.out.println("Insira dados de cadastro:");
        System.out.print("Nome: ");
        pessoa1.nome = input.next();

        System.out.print("Mãe: ");
        pessoa1.mae = input.next();

        System.out.print("Pai: ");
        pessoa1.pai = input.next();

        System.out.print("Idade: ");
        pessoa1.idade = input.nextInt();

        boolean booleanLengthCheck = pessoa1.compareNames();
        if(booleanLengthCheck) {
            System.out.println("O nome é maior que o da mãe e do pai");
        } else {
            System.out.println("O nome é menor que o da mãe e do pai");
        }

        System.out.println("==================");
        System.out.println("Cadastro Registrado");
        System.out.println(pessoa1.cadastroPessoa());

    }
}
