import java.util.Scanner;
public class Proje16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Metni giriniz: ");
        String metin = scanner.nextLine();

        System.out.print("Aranacak karakteri giriniz: ");
        char karakter = scanner.next().charAt(0);

        int karakterSayisi = sayac(metin, karakter);
        System.out.println("'" + karakter + "' karakteri metin içinde " + karakterSayisi + " kez geçmektedir.");

        scanner.close();
    }

    private static int sayac(String metin, char karakter) {
        int sayac = 0;

        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i) == karakter) {
                sayac++;
            }
        }

        return sayac;
    }

}
