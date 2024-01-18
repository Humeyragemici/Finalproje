import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;
public class Proje15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Denklemi giriniz (örnek: 45 - 40 = x): ");
        String denklem = scanner.nextLine();

        double x = cozDenklem(denklem);

        System.out.println("x = " + x);

        scanner.close();
    }

    private static double cozDenklem(String denklem) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");

        try {
            Object result = engine.eval(denklem);

            if (result instanceof Integer) {
                return (double) ((Integer) result);
            } else if (result instanceof Double) {
                return (double) result;
            }

        } catch (ScriptException e) {
            System.out.println("Geçersiz denklem formatı. Lütfen doğru bir denklem giriniz.");
        }

        return 0;
    }
}