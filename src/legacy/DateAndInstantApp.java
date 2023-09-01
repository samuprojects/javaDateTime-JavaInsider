package legacy;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import static java.time.ZoneOffset.UTC;

@SuppressWarnings("ALL")
public class DateAndInstantApp {

    public static void main(String[] args) {

        // Com o mercado ainda utilizando a API antiga de data/hora é possivel fazer uma ponte entre as duas APIs
        // podendo assim desenvolver alguma coisa na API nova e conectar isso com o legado e o contrário
        Instant instant = LocalDateTime.of(2030,10,1,10,0,0).toInstant(UTC);
        System.out.println(instant);


        // para converter em um Date usamos um método (from) que foi inserido no Date com a chegada da nova API DateTime
        Date date= Date.from(instant); // from é um método estático que recebe um Instant e devolve um objeto Date
        System.out.println(date);

        // para fazer o inverso (Date para Instant)
        Instant instant2 = date.toInstant();
        System.out.println(instant2);

        /*
        * Obs.:
        * Na verdade foram adicionados 2 métodos na classe Date
        * um é estático, serve para criar um objeto Date com base no Instant;
        * e um outro para ser chamado no objeto que converte a representação de Date num Instant
        * Esse roteiro forma a ponte entre as duas APIs, sendo possível chegar num Calendar conforme a seguir:
        *
        * */

        Calendar calendar = Calendar.getInstance(); // cria um calendar com base na data atual
        calendar.setTime(date); // chama o setTime passando o Date
        System.out.println(calendar); // dessa forma vai representar a mesma data informada no início, apesar do formato não muito interessante

        // é possível também extrair o Date de um Calendar, chamando um getTime pra receber o Date, e com a chamado do
        // toInstant é possível converter Date do Calendar no Instant da nova API do Java
    }
}
