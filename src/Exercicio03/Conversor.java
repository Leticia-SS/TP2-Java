package Exercicio03;

public class Conversor {
    double taxa = 1;
    String nomenclatura;

    public String converterMoeda(double reais, String moeda) {

        if (moeda.toLowerCase().equals("euro")) {
            taxa = 6.6;
            nomenclatura = "€";
        } else if (moeda.toLowerCase().equals("dolar")) {
            taxa = 5.8;
            nomenclatura = "US$";
        } else if (moeda.toLowerCase().equals("libra")) {
            taxa = 7.5;
            nomenclatura = "£";
        }

        double valorConvertido = reais * taxa;
        return "Valor Convertido: " + nomenclatura + valorConvertido;
    }
}