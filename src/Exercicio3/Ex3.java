package Exercicio3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor em Real a ser convertido");
        double real = input.nextDouble();

        System.out.println("Digite a moeda para converter (euro, dolar ou libra)");
        String moeda = input.next();

        Conversor converter = new Conversor();

        System.out.println(converter.converterMoeda(real, moeda));

    }
}
