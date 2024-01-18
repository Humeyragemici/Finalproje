import java.util.Scanner;
public class Proje17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine().toLowerCase();
        int sesliharfsys = 0;
        int sessizharfsys = 0;
        for (int i = 0; i < kelime.length(); i++) {
            char karakter = kelime.charAt(i);

            if (karakter >= 'a' && karakter <= 'z') {
                if (karakter == 'a' || karakter == 'e' || karakter == 'i' || karakter == 'o' || karakter == 'u') {
                    sesliharfsys++;
                } else {
                    sessizharfsys++;
                }
            }
        }
        System.out.println("Sesli Harf Sayısı: "+sesliharfsys);
        System.out.println("Sesssiz Harf Sayısı: "+sessizharfsys);
    }
}
