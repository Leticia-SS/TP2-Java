package Exercicio11;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um valor inicial (menor que 100): ");
        int inicial = input.nextInt();

        System.out.print("Digite um incremento: ");
        int incremento = input.nextInt();

        while(inicial<100){
            System.out.println(inicial);
            inicial += incremento;
        }

    }
}
