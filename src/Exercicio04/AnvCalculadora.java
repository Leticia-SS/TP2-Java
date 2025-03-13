package Exercicio04;

import java.time.LocalDate;
//import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AnvCalculadora {
    public String calculadoraAniversario(String data) {
        LocalDate dataAnv = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate dataAtual = LocalDate.now();

        long diasAnv = ChronoUnit.DAYS.between(dataAnv, dataAtual);
        //Link de referência
        // https://learn.microsoft.com/pt-br/dotnet/api/java.time.temporal.chronounit?view=net-android-34.0

        return "Idade em dias: " + diasAnv;
    }
}
