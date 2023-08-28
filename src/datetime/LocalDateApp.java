package datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateApp {

    public static void main(String[] args) {

        /*
        * Dentro da API de Datas e Horas do Java temos diversos tipos de classes para trabalhar com diversos tipos
        * de conceitos que envolvem tempo.
        *
        * Todas as classes da API DateTime estão no pacote java.time
        *
        * Começando pelo LocalDate é comum chamar métodos estáticos no nome da classe para construir objetos
        * Por exemplo um LocalDate.from() constrói um LocalDate com base em outro objeto qualquer do tipo TemporalAcessor
        * LocalDate.now() retorna o LocalDate atual
        * LocalDate.of() retorna um LocalDate com base em um Ano, mês e dia
        * */

        LocalDate date = LocalDate.of(2050, 1, 1);
        System.out.println(date);

        //podemos usar o método parse para transtormar Strings em Datas
        LocalDate date2 = LocalDate.parse("2050-01-01");
        System.out.println(date2);
        // quando temos uma String oriunda de uma fonte externa e precisamos converter isso num objeto LocalDate usamos o método parse

        // se a data estiver em outro formato (por exemplo o do Brasil dia-mes-ano), passamos a informação desejada seguida do padrão desejado para que o Java possa compreender qual é a data
        LocalDate date3 = LocalDate.parse("01/01/2050", DateTimeFormatter.ofPattern("dd/MM/yyyy")); // Obs.: no java mm (minúsculo) representa minutos
        System.out.println(date3);
    }
}
