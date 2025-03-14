package Exercicio10;

import java.util.Random;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("Tente adivinhar o Número de 0 a 100");
        System.out.println("------------------------------------");
        System.out.print("Digite seu palpite: ");
        int palpite = input.nextInt();

        Random aleatorio = new Random();
        int random = aleatorio.nextInt(100);

        while(random!=palpite){
            if(palpite>random){
                System.out.println("Um pouco alto demais.... diminua um pouco");
            } else {
                System.out.println("Um pouco baixo demais.... aumente um pouco");
            }
            System.out.print("Digite seu palpite: ");
            palpite = input.nextInt();
        }

        System.out.printf("Você acertou!!!!!!\n Palpite: %d\nSorteado: %d", palpite, random);

    }
}
