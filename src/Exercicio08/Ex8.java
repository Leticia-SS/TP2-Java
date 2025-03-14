package Exercicio08;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o primeiro lado");
        int lado1 = input.nextInt();

        System.out.println("Insira o segundo lado");
        int lado2 = input.nextInt();

        System.out.println("Insira o terceiro lado");
        int lado3 = input.nextInt();

        Triangulos triangulo = new Triangulos();

        System.out.println(triangulo.verificarTipoTiangulo(lado1, lado2, lado3));

    }
}
