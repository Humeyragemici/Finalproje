import java.util.Scanner;
public class Proje7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int top50us=0;
        int top50alt=0;
        for (int i = 0; i < 10; i++){
            System.out.print("0 ile 100 arasında lütfen bir sayı giriniz: ");
            int sayi = scanner.nextInt();
            if (sayi >= 50) {
                top50us += sayi;
            } else {
                top50alt += sayi;
            }
        }
        if(top50alt==0){
            System.out.println("50'den küçük sayı girilmediği için oran hesaplanamaz.");
        }
        else {
            double oran = (double) top50us / top50alt;
            System.out.println("50 ve üstü sayıların toplamı: " + top50us);
            System.out.println("50'den küçük sayıların toplamı: " + top50alt);
            System.out.println("Oran: " + oran);
        }
    }
}
