package Exercicio04;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira sua data de aniversário (dd/mm/aaaa");
        String anv = input.next();

        AnvCalculadora calcular = new AnvCalculadora();

        System.out.println(calcular.calculadoraAniversario(anv));

    }
}
