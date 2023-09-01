package commonuses;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

@SuppressWarnings("ALL")
public class YearMonthApp {

    public static void main(String[] args) {

        // Outra classe do Java que pode ser utilizada para um fim bem específico é a YearMonth
        // Essa classe aremazena duas informações: Ano e Mês
        YearMonth ym1 = YearMonth.of(2000,12);
        System.out.println(ym1); // muito usado no armazenamento de dados de cartão de crédito

        // podemos usar os métodos with para alterar e criar novos objetos com essas alterações
        YearMonth ym2 = ym1.withYear(2010);
        System.out.println(ym2);

        // podemos usar o format para trazer um resultado personalizado em String
        String formatted = ym2.format(DateTimeFormatter.ofPattern("MM/yyyy")); // não esquecer que mm minúsculo são minutos no Java
        System.out.println(formatted);
    }
}
