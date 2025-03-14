package Exercicio06;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = input.nextInt();

        if (ano % 4 == 0 || ano % 100 == 0) {
            System.out.println("Ano é bissexto");
        } else {
            System.out.println("Ano não é bissexto");
        }

    }
}
