package commonuses;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;

import static java.time.ZoneOffset.UTC;

@SuppressWarnings("ALL")
public class InRangeApp {

    public static void main(String[] args) {


        // Quando for necessário checar se determinado período (Data/hora) está dentro de um intervalo podemos utilizar...

        var start = LocalDate.of(2020,1,1).atStartOfDay().atOffset(UTC);
        System.out.println(start); // atStartOfDay retorna um LocalDate e atOffSet retorna um offSetDateTime

        var end = LocalDate.of(2030,12,31).atTime(LocalTime.MAX).atOffset(UTC);
        System.out.println(end); // MAX representa os últimos segundos antes de virar a hora

        // Agora podemos checar se nossa data atual está dentro do intervalo acima por exemplo...
        var now = OffsetDateTime.now();
        System.out.println(inRange(now, start, end));
    }

    private static boolean inRange(OffsetDateTime odt, OffsetDateTime start, OffsetDateTime end) {
        // se a odt for igual a inicial OU odt for igual a última retorna verdadeiro
        // OU se a data informada está depois do ínicio E antes do fim
        // como o E tem prioridade sobre o OU primeiro vai testar o intervalo depois as extremidades
        // qualquer uma das situações sendo verdadeiro significa que está dentro do intervalo
        return odt.isEqual(start) || odt.isEqual(end) || odt.isAfter(start) && odt.isBefore(end);

        // NÃO USAR O compareTo pois não abrange INSTANTES NO TEMPO

        /*
        * Comanetário de apoio do fórum se fosse utilizado OffsetDateTime now, no método
        *  e no return colocar now.isEqual(start)
        *
        * Se fosse declarado o now diretamente no método isRange, haveria um acoplamento do OffsetDateTime atual,
        * mas como o odt está sendo passado como parâmetro do método inRange,
        * é possível informar qualquer valor para o OffsetDateTime ao invés de usar sempre apenas o now como valor fixo
        * dentro do método (data e hora de agora)! */
    }
}
