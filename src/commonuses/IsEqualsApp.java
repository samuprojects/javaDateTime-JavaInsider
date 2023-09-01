package commonuses;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

@SuppressWarnings("ALL")
public class IsEqualsApp {

    public static void main(String[] args) {

        // Para obter resultado esperado em comparações de data/hora...

        OffsetDateTime odt1 = OffsetDateTime.of(
                2000,1,1,12,0,0,0, ZoneOffset.of("-00:00")
        );

        OffsetDateTime odt2 = OffsetDateTime.of(
                2000,1,1,11,0,0,0, ZoneOffset.of("-01:00")
        );

        // Tomar cuidado com o equals porque nesse caso vai comparar os elementos (se os offsets são iguais), nesse caso a hora também é diferente
        // porém no quesito "instante no tempo" são a mesma coisa, e o equals não abrange esse cenário
        System.out.println(odt1.equals(odt2));

        // Para comparar instantes no tempo precisamos utilizar o isEqual, que possui uma aobrdagem totalmente diferente
        // o isEqual converte para um toEpochSecond() os dois objetos e realiza a comparação seguindo tembém os nanos segundos
        System.out.println(odt1.isEqual(odt2)); // resultado será true

    }
}
