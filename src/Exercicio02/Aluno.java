package Exercicio02;

public class Aluno {
    double nota1, nota2, nota3, nota4;
    public String mediaBimestral(){
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media >= 7){
            return "Média: " + media + "\nVocê foi aprovado";
        } else if(media >= 5){
            return "Média: " + media + "\nVocê está de Recuperação";
        } else {
            return "Média: " + media + "\nVocê foi reprovado";
        }
    }
}
