package Exercicio12;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String[] frase = input.nextLine().split(" ");

        System.out.println("Total de palavras: " + frase.length);
        for (String s : frase) {
            System.out.print(s + " | ");
        }
    }
}
