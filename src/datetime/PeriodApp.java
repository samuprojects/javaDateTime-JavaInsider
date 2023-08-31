package datetime;

import java.time.LocalDate;
import java.time.Period;

@SuppressWarnings("ALL")
public class PeriodApp {

    public static void main(String[] args) {

        // Para informações maiores de tempo além do Duration temos o Period
        Period p1 = Period.ofYears(1);
        System.out.println(p1);

        //Quantidade em meses
        System.out.println(p1.toTotalMonths());

        // Diferença de tempo entre datas
        Period p2 = Period.between(LocalDate.of(2000,3,1), LocalDate.of(2020,3,1));
        System.out.println(p2); // usamos LocalDate porque Period alcança valores maiores (dias) e não conta horas, minutos...

        // Diferença trazida em meses
        System.out.println(p2.toTotalMonths());
    }
}
