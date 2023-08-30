package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeApp {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2000,1,1);
        LocalTime time = LocalTime.of(16,45);

        // Para juntar informações de data e hora usar LocalDateTime
        LocalDateTime ldt1 = LocalDateTime.of(date, time); // construindo com base em valores já existentes
        System.out.println(ldt1);

        LocalDateTime ldt2 = LocalDateTime.of(2000, 1, 1, 16, 45); // construção de outra forma com mesmos dados
        System.out.println(ldt2);


        // se quiser aproveitar uma data existente e acrescentar apenas as novas informações da hora
        LocalDateTime ldt3 = date.atTime(time); // o retorno é um LocalDateTime
        System.out.println(ldt3);

        // se quiser acrescentar uma data a horario já ecistente
        LocalDateTime ldt4 = time.atDate(date); // também retorna um LocalDateTime
        System.out.println(ldt4);

        // As mesmas operações disponíveis para LocalDate e LocalTime são possíveis no LocalDateTime

        String formattedDateTime = ldt4.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println(formattedDateTime);
        // colocando por exemplo em formatação personalizada


        // é possível alterar partes desses date time usando também os métodos with...
    }
}
