import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class dateInstance {

    public static void main (String[] args) {

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt05 = DateTimeFormatter.ISO_INSTANT;

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2023-04-20");
        LocalDateTime d05 = LocalDateTime.parse("2023-04-20T01:16:29");
        Instant d06 = Instant.parse("2023-04-20T01:16:29Z");
        Instant d07 = Instant.parse("2023-04-20T01:16:29-03:00");

        LocalDate d08 = LocalDate.parse("18/04/2023", fmt01 );
        LocalDateTime d09 = LocalDateTime.parse("18/04/2023 02:54", fmt02 );

        LocalDate d10 = LocalDate.of(2023, 4, 18);
        LocalDateTime d11 = LocalDateTime.of(2023, 4, 18 ,2 ,58);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);

        System.out.println("d04 = " + d04);
        System.out.println("d04 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

        System.out.println("_________________________________________________");

        System.out.println("D04 = " + d04.format(fmt01));
        System.out.println("D04 = " + fmt01.format(d04));
        System.out.println("D04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("D05 = " + d05.format(fmt01));
        System.out.println("D05 = " + d05.format(fmt02));
        System.out.println("D05 = " + d05.format(fmt04));

        System.out.println("D06 = " + fmt03.format(d06));
        System.out.println("D06 = " + fmt05.format(d06));

        System.out.println("_________________________________________________");

        LocalDate r1 = LocalDate.ofInstant(d06,ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06,ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mes = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());

        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minute = " + d05.getMinute());

        System.out.println("_________________________________________________");

        LocalDate pastWeek = d04.minusDays(7);
        LocalDate nextWeek = d04.plusWeeks(1);

        System.out.println("d04 semana atras = " + pastWeek);
        System.out.println("d04 semana afrente = " + nextWeek);

        LocalDateTime pastHourTime = d05.minusDays(9);
        LocalDateTime nextHourTime = d05.plusDays(5);

        System.out.println("d05 3 horas atras = " + pastHourTime);
        System.out.println("d04 5 horas afrente = " + nextHourTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeek.atTime(0,0), d04.atTime(0,0));
        Duration t2 = Duration.between(pastHourTime, d05);
        Duration t3 = Duration.between(pastWeekInstant,d06);
        Duration t4 = Duration.between(d06,pastWeekInstant);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());



    }
}
