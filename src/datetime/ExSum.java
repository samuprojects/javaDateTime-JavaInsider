package datetime;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

@SuppressWarnings("ALL")
public class ExSum {

    public static void main(String[] args) {

        System.out.println(calculateExpirationTime(5));
        // vai apresentar quanto tempo falta (em segundos) para expirar alguma coisa a partir da hora atual e da quantidade de horas fornecida
    }

    private static long calculateExpirationTime(int hours) {
        // Instant.now representa o instante atual, o plus vai somar com o parametro recebido hours, e usamos como unidade de tempo o enum ChronoUnit para horas
        return Instant.now().plus(hours, ChronoUnit.HOURS).getEpochSecond(); // por fim getEpochSecond vai retornar um long que é o que precisamos
    }
}
