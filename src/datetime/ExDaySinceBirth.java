package datetime;

import java.time.LocalDate;
import java.time.Period;

@SuppressWarnings("ALL")
public class ExDaySinceBirth {

    public static void main(String[] args) {

        // Escolhido LocalDate para armazenar as informações do ano, mes, dia (sem considerar o tempo da hora,minuito...)
        var birthDate = LocalDate.of(1980,6,10);

        // vamos contar o tempo usando a data atual do sistema
        var today = LocalDate.now();

        // Para fazer o cálculo específico de Dias, Meses e Anos podemos usar o Period
        var period = Period.between(birthDate, today); // passando a data de início e fim

        // Apresentando o resultado de forma personalizada
        System.out.format("O período é de %d anos, %d meses e %d dias",
                period.getYears(),
                period.getMonths(),
                period.getDays()
        );
    }
}
