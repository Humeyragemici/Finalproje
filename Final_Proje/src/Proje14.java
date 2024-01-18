import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Proje14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("İlk tarihi (GG.AA.YYYY) formatında giriniz: ");
            String tarihStr1 = scanner.nextLine();
            Date tarih1 = new SimpleDateFormat("dd.MM.yyyy").parse(tarihStr1);

            System.out.print("İkinci tarihi (GG.AA.YYYY) formatında giriniz: ");
            String tarihStr2 = scanner.nextLine();
            Date tarih2 = new SimpleDateFormat("dd.MM.yyyy").parse(tarihStr2);

            long farkMillis = Math.abs(tarih1.getTime() - tarih2.getTime());
            int gunFarki = (int) (farkMillis / (1000 * 60 * 60 * 24));
            int ayFarki = gunFarki / 30;
            int yilFarki = gunFarki / 365;

            System.out.println("Gün Farkı: " + gunFarki + " gün");
            System.out.println("Ay Farkı: " + ayFarki + " ay");
            System.out.println("Yıl Farkı: " + yilFarki + " yıl");

        } catch (ParseException e) {
            System.out.println("Geçersiz tarih formatı. Lütfen GG.AA.YYYY formatında giriniz.");
        } finally {
            scanner.close();
        }
    }
}