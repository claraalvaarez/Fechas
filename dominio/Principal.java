package dominio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        // 1
        LocalDate fechaLocal = LocalDate.now();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("1. Fecha actual local (España): " + fechaLocal.format(formatoFecha));

        // 2
        ZoneId zonaCaracas = ZoneId.of("America/Caracas");
        ZonedDateTime fechaCaracas = ZonedDateTime.now(zonaCaracas);
        LocalDate fechaCaracasLocalDate = fechaCaracas.toLocalDate();
        System.out.println("2. Fecha actual en Caracas: " + fechaCaracasLocalDate.format(formatoFecha));

        // 3
        int anoDescubrimientoAmerica = 1492;
        int anosTranscurridos = fechaLocal.getYear() - anoDescubrimientoAmerica;
        System.out.println("3. Años transcurridos desde el descubrimiento de América: " + anosTranscurridos);

        // 4
        LocalTime horaLocal = LocalTime.now();
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("4. Hora actual local (España): " + horaLocal.format(formatoHora));

        // 5
        LocalTime horaCaracas = fechaCaracas.toLocalTime();
        System.out.println("5. Hora actual en Caracas: " + horaCaracas.format(formatoHora));

        // 6
        Duration diferenciaHoraria = Duration.between(fechaCaracas.toLocalTime(), horaLocal);
        System.out.println("6. Horas de diferencia entre Madrid y Caracas: " + diferenciaHoraria.toHours() + " horas");

        // 7
        LocalDateTime neilArmstrongLuna = LocalDateTime.of(1969, 7, 21, 3, 56);
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("7. Fecha y hora cuando Neil Armstrong pisó la luna (Hora de Madrid): " + neilArmstrongLuna.format(formatoFechaHora));
    }
}
