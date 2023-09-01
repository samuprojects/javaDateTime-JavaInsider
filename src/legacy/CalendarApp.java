package legacy;

import java.util.Calendar;

@SuppressWarnings("ALL")
public class CalendarApp {

    public static void main(String[] args) {


        // Como o Date é limitado, em cenários legados podemos utilizar a classe abstrata Calendar para representar várias informações de tempo Data/hora
        // suporta até no máximo mili segundos e para chamar uma instância precisamos do getInstance

        Calendar calendar = Calendar.getInstance(); // retorna a representação da data atual

        // os objetos de Date e Calendar são mutáveis, diferente da nova API DateTime
        calendar.set(2020,3,10,14,30,20);

        System.out.println(calendar.getTime());

        // o mês no Calendar começa em 0, por isso o resultado de 3 saiu como Abril

        // para ter mais segurança ao trabalhar nesse cenário o prof recomenda utilizar Constantes para não ocorrer de confundir
        calendar.set(2020,Calendar.MARCH,10,14,30,20);
        System.out.println(calendar.getTime());

        // se quiser somar ou subtrair em datas usar o método add
        calendar.add(Calendar.YEAR, 2); // passando um field (campo on de vai somar) e um amount (quantidade)
        System.out.println(calendar.getTime());

        calendar.add(Calendar.YEAR, -3); // para subtrair passar o número negativo
        System.out.println(calendar.getTime());

        // o add não suporta enums, porque foi criado numa época em que o Java ainda não suportava Enums
        // por isso o a constante YEAR de Calendar é um inteiro com valor 1

        // Outro ponto é que olegado não suporta fuso horário, tendo que ser administrado manualmente

    }

}
