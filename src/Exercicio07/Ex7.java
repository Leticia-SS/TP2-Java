package Exercicio07;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor do salário anual");
        double salarioAnual = input.nextDouble();

        ImpostoDeRenda imposto = new ImpostoDeRenda();

        System.out.println(imposto.calcularImposto(salarioAnual));
    }
}
