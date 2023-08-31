package datetime;

import java.time.Duration;
import java.time.LocalTime;

@SuppressWarnings("ALL")
public class DurationApp {

    public static void main(String[] args) {

        // A classe Duration representa uma duração de tempo em segundos, e nano segundos, podendo inclusive converter em minutos, horas...
        Duration d1 = Duration.ofHours(3);
        System.out.println(d1);

        // resultado para 60 minutos
        Duration d2 = Duration.ofMinutes(60);
        System.out.println(d2);

        // convertendo em segundos
        System.out.println(d2.toSeconds());

        // Atenção esses objetos não levam em consideração fuso horário


        // Podemos usar o Duration para fazer pequenos calculos temporais
        LocalTime l1 = LocalTime.of(12,0);
        LocalTime l2 = LocalTime.of(16,0);

        Duration d3 = Duration.between(l1, l2); // inclusive (12, 13, 14, 15), exclusive (16)
        System.out.println(d3);

        // podemos trazer o resultado em minutos
        System.out.println(d3.toMinutes());

        // os métodos de conversão começam com o to...
    }
}
