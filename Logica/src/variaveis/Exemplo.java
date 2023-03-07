package variaveis;

import java.math.BigDecimal;
import java.time.*;

public class Exemplo {
    public static void main(String[] args) {
        // Grupo dos inteiros
        short ipequeno = 300;
        System.out.println(ipequeno);
        int imedio = 3000000;
        System.out.println(imedio);
        long igrande = 300000000;
        System.out.println(igrande);
        
        // Grupo dos reais
        float rpequeno = (float)5.555555;
        System.out.println(rpequeno);
        double rmedio = 5.555555555555555;
        System.out.println(rmedio);
        BigDecimal rgrande = new BigDecimal("5000000000000.5555555555555555555555555");
        System.out.println(rgrande);
        
        // Lógico
        boolean logico = true;
        logico = false;
        System.out.println(logico);
        
        // Grupos de textos
        char letra = 'H';
        System.out.println(letra);
        String frase = "Hello world";
        System.out.println(frase);
        
        // Grupos de datas
        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);
        LocalDate data = LocalDate.now();
        System.out.println(data);
        ZonedDateTime dataHoraZoneada = ZonedDateTime.now();
        System.out.println(dataHoraZoneada);
        OffsetDateTime dataHoraZoneada2 = OffsetDateTime.now();
        System.out.println(dataHoraZoneada2);
    }
}
