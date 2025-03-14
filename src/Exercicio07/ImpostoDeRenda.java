package Exercicio07;

public class ImpostoDeRenda {
    double imposto, liquido;
    public String calcularImposto(double bruto){
        if(bruto>=64259.59){
            imposto = bruto * 0.275;
        } else if(bruto<64259.59 && bruto>=50148.26){
            imposto = bruto * 0.225;
        } else if(bruto<50148.26 && bruto>=37751.56){
            imposto = bruto * 0.15;
        } else if(bruto<37751.56 && bruto>=27870.41){
            imposto = bruto * 0.075;
        } else {
            imposto = 0;
        }

        liquido = bruto - imposto;

        return "=====================\n" + "Imposto a pagar: R$" + imposto + "\nSalário Anual Líquido: R$" + liquido;
    }
}
