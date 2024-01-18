import java.util.Scanner;
public class Proje6 {
 public static void main(String[]args){
     Scanner klavye =new Scanner(System.in);
     int sayi,eb=0;
     for(int i=1;i<=10;i++){
         System.out.print(i + ".Sayıyı Giriniz: ");
         sayi = klavye.nextInt();
         if(sayi>=eb){
             eb=sayi;
         }
     }
     System.out.println();
     System.out.println("En büyük sayı:" + eb);
 }
}
