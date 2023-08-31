package datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@SuppressWarnings("ALL")
public class ZonedDateTimeApp {

    public static void main(String[] args) {


        // A classe ZonedDateTime é parecida com a OffsetDateTime...
        // OffsetDateTime armazena horas a mais ou a menos com base no horário oficial mundial (UTC)
        // ZonedDateTime não tem os Offsets (até tem internamente, mas não os define, não trabalha diretamente com eles...), o que você usa são as zonas.
        // Zonas são lugares do mundo que representam os fuso horários
        LocalDateTime ldt = LocalDateTime.of(2000,2,10,14,0,0);
        ZonedDateTime zdt1= ZonedDateTime.of(ldt, ZoneId.systemDefault()); // o ZoneId tem alguns recursos como esse de pegar o que está em uso pelo S.O.

        System.out.println(zdt1); // o Z que pode surgir no resultado indica que é a mesma região do horário Central de Greenwich

        // Se quiser ver no Brasil o mesmo instante no tempo podemos usar
        ZonedDateTime zdt2 = zdt1.withZoneSameInstant(ZoneId.of("America/Sao_Paulo"));
        System.out.println(zdt2); // o ZonedDateTime considera horário de verão

        // Se quiser saber quais zonas estão disponíveis basta usar o get abaixo que retorna um Set com as informações
        System.out.println(ZoneId.getAvailableZoneIds());

        // outras opções estão disponíveis com os gets e os with...
    }
}
