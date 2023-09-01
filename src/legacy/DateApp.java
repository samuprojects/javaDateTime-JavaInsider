package legacy;

import java.util.Date;

@SuppressWarnings("ALL")
public class DateApp {

    public static void main(String[] args) {

        // Apesar da DateTime API ter recursos muito bons ela é nova e há ainda muitos projetos no mercado
        // que usam API legada de data/hora do Java

        // a classe central da API legada é a Date do pacote java.util, que não representa uma data e sim um instante no tempo
        Date date = new Date(); // o objeto Date carrega um EpochMilli com a data de referencia 01.01.1970
        // o único construtor que pode ser usado como parametro no Date é o long, pois os demais são deprecated

        // para extrair a informação precisamos do getTime que retorna um Long com o número de mili segundos desde 01.01.1970
        System.out.println(date.getTime());

        // o Date trabalha internamente com no máximo mili segundos, já o Instant pode representar nano segundos
    }
}
