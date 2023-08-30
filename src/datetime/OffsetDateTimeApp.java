package datetime;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeApp {

    public static void main(String[] args) {

        // o LocalDateTime não carrega informação de fuso horario, somente o horário local
        LocalDateTime ldt = LocalDateTime.of(2000,3,1,15,0);
        System.out.println(ldt);

        // uma das classes para se trabalhar com fuso horario é a OffsetDateTime
        // após o of precisamos passar a zona do fuso horario, por exemplo se for o de Greenwich usar só UTC
        OffsetDateTime odt1 = OffsetDateTime.of(ldt, ZoneOffset.UTC);
        System.out.println(odt1);

        // podemos por exemplo exibir o mesmo horário porém com fuso do Brasil
        OffsetDateTime odt2 = odt1.withOffsetSameInstant(ZoneOffset.of("-03:00")); // off de menos 3h
        System.out.println(odt2);
        System.out.println(odt1.isEqual(odt2)); // podemos comparar o tempo em locais diferentes do mundo e o resultado é true
        // apesar de serem informações diferentes mas representam o mesmo instante no tempo

        // ideal por exemplo, num cenário global onde você precisa talvez analisar um log, e poder observar o horário da ocorrência com detalhes
        // do fuso horario.

    }
}
