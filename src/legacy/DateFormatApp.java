package legacy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("ALL")
public class DateFormatApp {

    public static void main(String[] args) throws Exception {

        // Para formatar data/hora usando a API legada
        Calendar calendar = Calendar.getInstance(); // criado calendar
        calendar.set(2000,Calendar.APRIL,10); // definido data (se quiser ignorar a hora especificar com zeros)
        System.out.println(calendar.getTime()); // exibição na tela, como não foi passado hora, pegou a do sistema

        // Podemos usar o SimpleDateFormat que é uma classe do pacote java.text que foi criado para formatar datas
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // passa o padrão (pattern)
        String formatted = sdf.format(calendar.getTime()); // format com calendar.getTime vai retornar a data formatada
        System.out.println(formatted); // seguir com a impressão na tela

        // É possível fazer a operação inversa. Com base numa String transformar num objeto Date utilizando o parse
        Date parsedDate = sdf.parse("15/05/2010 15:00:00"); // o parse pode lançar uma exceção que deve ser tratadaou lançada, nesse momento a opção foi lançar para o main
        System.out.println(parsedDate);
    }
}
