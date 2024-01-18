import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Proje20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum tarihinizi (GG.AA.YYYY formatında) girin : ");
        String dogumTarihiStr = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate dogumTarihi = LocalDate.parse(dogumTarihiStr, formatter);

        DayOfWeek gun = dogumTarihi.getDayOfWeek();
        String gunAdi = gun.toString();

        System.out.println("Doğduğunuz gün : " + gunAdi);

        scanner.close();
    }
}
