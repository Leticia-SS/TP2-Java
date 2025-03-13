package Exercicio2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite as notas do Bimestre");
        System.out.print("Nota 1: ");
        aluno.nota1 = input.nextDouble();

        System.out.print("Nota 2: ");
        aluno.nota2 = input.nextDouble();

        System.out.print("Nota 3: ");
        aluno.nota3 = input.nextDouble();

        System.out.print("Nota 4: ");
        aluno.nota4 = input.nextDouble();

        System.out.println("=================");
        System.out.println(aluno.mediaBimestral());

    }
}
