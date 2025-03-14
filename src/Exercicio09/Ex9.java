package Exercicio09;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma senha:");
        String senha = input.next();

        System.out.println("Confirme a senha:");
        String verificarSenha = input.next();

        while(!verificarSenha.equals(senha)){
            System.out.println("Senhas não coincidem, digite novamente");
            verificarSenha = input.next();
        }

        System.out.println("Senha confirmada com sussesso");
    }
}
