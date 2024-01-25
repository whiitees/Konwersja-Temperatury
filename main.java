import java.util.Scanner;

public class KonwersjaTemperatury {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj temperaturę w stopniach Celsiusza: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsiusNaFahrenheit(celsius);

        System.out.printf("%.2f stopni Celsiusza to %.2f stopni Fahrenheit.%n", celsius, fahrenheit);
    }

    public static double celsiusNaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
