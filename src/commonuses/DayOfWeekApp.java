package commonuses;

import java.time.DayOfWeek;

@SuppressWarnings("ALL")
public class DayOfWeekApp {

    public static void main(String[] args) {

        // Podemos trabalhar com dias da semana através de um enum DayOfWeek
        DayOfWeek dow1 = DayOfWeek.MONDAY;
        System.out.println(dow1);

        // Apesar de ser um enum internamente cada dia da semana é representado por um número
        System.out.println(dow1.getValue()); // 1 é segunda...

        // Com isso pode-se transformar um objeto DayOfWeek num inteiro (por meio do getValue) e o inverso
        DayOfWeek dow2 = DayOfWeek.of(6); // passamos no value o número do dia
        System.out.println(dow2);

        // Esse enum também permite somar ou subtrair dias
        DayOfWeek dow3 = dow2.plus(2); // passamos a quantidade de dias a somar e vai retornar um novo DayOfWeek
        System.out.println(dow3);
    }
}
