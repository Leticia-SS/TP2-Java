package Exercicio05;

public class Desconto {
    double desconto;
    double valorFinal;
    double valorDesconto;
    public String calcularDesconto(double valor){
        if(valor>1000){
            desconto = 0.1;
            valorDesconto = valor * desconto;
            valorFinal = valor - valorDesconto;
        } else if(valor<= 1000 && valor>500){
            desconto = 0.05;
            valorDesconto = valor * desconto;
            valorFinal = valor - valorDesconto;
        } else{
            desconto = 0;
            valorDesconto = 0;
            valorFinal = valor;
        }
        return "Valor Inicial: R$" + valor + "\nDesconto Aplicado: R$" + valorDesconto + "\nTaxa de desconto: " + desconto * 100 + "%" + "\nValor Final: R$" + valorFinal;
    }
}
