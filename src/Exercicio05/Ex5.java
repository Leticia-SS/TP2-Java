package Exercicio05;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor da compra");
        double valorCompra = input.nextDouble();

        Desconto desconto = new Desconto();

        System.out.println("===============");
        System.out.println(desconto.calcularDesconto(valorCompra));

    }
}
