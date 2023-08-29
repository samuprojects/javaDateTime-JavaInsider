package datetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeApp2 {

    public static void main(String[] args) {

        LocalTime time1 = LocalTime.of(15,30);
        System.out.println(time1);

        LocalTime time2 = time1.plusHours(12); // novo objeto será retornado pelos métodos plus...
        System.out.println(time2);

        // Da mesma forma que no LocalDate podemos fazer operações com as horas, minutos...
        LocalTime time3 = time2.minusMinutes(30);
        System.out.println(time3);

        // Podemos usar o format para mostrar num formato diferente
        String formattedTime = time3.format(DateTimeFormatter.ofPattern("HH mm"));
        System.out.println(formattedTime);

        /*
        * Comentário de apoio do fórum JavaInsider
        * Ao usar o parse você consegue informar diretamente um horário em formato de String.
        * Por exemplo: LocalTime.parse(“23:45:57“) - O método parse também aceita um DateTimeFormatter como parâmetro,
        * então você pode unir as duas coisas! Exemplo: LocalTime.parse(“23 45“, DateTimeFormatter.ofPattern(“HH mm“)).
         *
        * */

    }
}
