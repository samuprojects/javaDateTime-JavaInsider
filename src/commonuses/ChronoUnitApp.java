package commonuses;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

@SuppressWarnings("ALL")
public class ChronoUnitApp {

    public static void main(String[] args) {

        // Outro enum que pode ajudar como um atalho é o ChronoUnit que possui a representação de vários elementos da API DateTime
        // Por exemplo podemos usar between para calcular a quantidade de dias entre um período A e B de datas
        var start = LocalDate.of(2000,1,1);
        var end = LocalDate.of(2000,12,31);
        System.out.println(ChronoUnit.DAYS.between(start, end));

        // Podemos obter o resultado em meses
        System.out.println(ChronoUnit.MONTHS.between(start, end));

        // ou em Anos
        System.out.println(ChronoUnit.YEARS.between(start, end));

        // Vale também para trabalhar com horas e nesse exemplo adicionar informações
        var newTime = ChronoUnit.HOURS.addTo(LocalTime.of(12,0,0), 3); // retorna um LocalTime 12h depois soma 3h
        System.out.println(newTime);

        // Podemos assim fazer operações com base no elemento do enum, que pode ser um atalho para soma ou subtração de tempo e comparação entre intervalos

    }
}
