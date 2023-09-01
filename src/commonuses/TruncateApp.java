package commonuses;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

@SuppressWarnings("ALL")
public class TruncateApp {

    public static void main(String[] args) {

        // Havendo necessidade de truncar algum elemento (nano ou mili segundos)
        var time = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println(time);

        // Para salvar num banco de dados podemos remover os nano segundos usando o truncatedTo passando uma unidade temporal
        // onde dali pra frente vai retonar o que sobrou, exemplo
        time = time.truncatedTo(ChronoUnit.MILLIS); // aqui optamos pelo ChronoUnit trazendo só até mili segundos
        System.out.println(time);

        // ou até os segundos...
        time = time.truncatedTo(ChronoUnit.SECONDS);
        System.out.println(time);
    }
}
