package datetime;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

@SuppressWarnings("ALL")
public class InstantApp {

    public static void main(String[] args) {

        // A classe Instant representa um instante no tempo e considera tudo, a data e hora para fazer o cálculo
        // Para isso é necessário uma base e o Instant utiliza o EPOCH (termo muito usado na programação ao trabalhar com datas)
        // EPOCH representa a data a partir de 01.01.1970 00:00 no horario oficial mundial UTC - horário de Greenwich
        Instant i = Instant.EPOCH;
        System.out.println(i);

        // mili segundos passados desde EPOCH
        System.out.println(i.toEpochMilli());

        // segundos passados desde o EPOCH
        System.out.println(i.getEpochSecond());

        // outro instante no tempo usando como base um offset com data futura
        OffsetDateTime odt = OffsetDateTime.of(2050,12,31,0,0,0,0, ZoneOffset.of("+00:00"));
        Instant i1 = odt.toInstant();
        // Vários objetos temporais da API possuem o toInstant que permite converter a representação de tempo para um instante no tempo.

        System.out.println(i1);
        System.out.println(i1.toEpochMilli());
        System.out.println(i1.getEpochSecond());

        // Para fazer o contrário, transformando um Instant em OffsetDateTime, podemos fazer
        OffsetDateTime odt2 = OffsetDateTime.ofInstant(i1, ZoneOffset.UTC); // Precisa informar a zona para o OffsetDateTime
        System.out.println(odt2);
    }
}
