package datetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeApp {

    public static void main(String[] args) {

        // o LocalTime trabalha com tempo em horas, minutos, segundos... funciona semelhante ao LocalDate (usado para datas)
        LocalTime time1 = LocalTime.of(23,10,15);
        System.out.println(time1);

        // método now do LocalTime retorna a hora atual
        LocalTime time2 = LocalTime.now();
        System.out.println(time2);

        // acrescido o método with em now para remover os segundos e os nano segundos
        LocalTime time3 = LocalTime.now().withSecond(0).withNano(0);
        System.out.println(time3);

        // Toda vez que um método que "altera" o tempo é chamado estamos criando uma nova instancia de LocalTime (porque API LocalTime também é imutavel)
        LocalTime time4 = LocalTime.parse("00:00:00");
        System.out.println(time4);

        // Se quisermos o tempo de outra forma precisamos passar a informação para o parse
        LocalTime time5 = LocalTime.parse("13-30-20", DateTimeFormatter.ofPattern("HH-mm-ss")); // passa o padrão para transformar em horas
        System.out.println(time5);

        // HH - em maiúsculo são as horas em 24
        // hh - em minúsculo são as horas em 12 AM ou PM, tendo que passar essa informação
        // MM - usamos em maiúsculo no LocalDate para representar o mês
        // mm - usamos em minúsculo no LocalTime para representar os minutos

    }
}
