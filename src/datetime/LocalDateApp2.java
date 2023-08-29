package datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@SuppressWarnings("ALL")
public class LocalDateApp2 {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(1990,1,1); // todos os objetos de LocalDate API são imutáveis
        LocalDate date2 = date1.withYear(2000); // para alterar o ano precisamos criar outro objeto (todos os with... retornam novos objetos)
        LocalDate date3 = date1.withYear(2000).withMonth(5);
        LocalDate date4 = date3.plusYears(2); // métodos plus... soma alguma coisa
        LocalDate date5 = date4.minusDays(5); // API subtrai já regredindo o calendário
        LocalDate date6 = date4.minus(5, ChronoUnit.DAYS); // mesmo resultado da linha acima porém ChronoUnit traz outras opções

        // todos os objetos LocalDate possuem o método format() que nos permite apresentar a data da forma que julgarmos melhor, exemplo, pt-br
        String formatDate = date6.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")); // converte para String no formato pt-br


        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
        System.out.println(date5);
        System.out.println(date6);
        System.out.println(formatDate);
    }
}
