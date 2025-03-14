package Exercicio08;

public class Triangulos {
    public String verificarTipoTiangulo(int lado1, int lado2, int lado3){
        boolean valido = (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);

        if(!valido){
            return "Triângulo não é válido";
        } else if (lado1 == lado2 && lado2 == lado3){
            return "Triângulo é Equilátero";
        } else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            return "Trinagulo é Isócceles";
        } else {
            return "Triângulo é Escaleno";
        }
    }
}
