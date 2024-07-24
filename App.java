import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1.Celsius To Fahrenheit");
        System.out.println("2.Fahrenheit To Celsius");
        System.out.println("3.Celsius To Kelvin");
        System.out.println("4.Kelvin To Celsius");
        System.out.println("5.Fahrenheit To Kelvin");
        System.out.println("6.Kelvin To Fahrenhit");
        System.out.println("7.Exit");
        System.out.println("Choose Converter: ");
        int n = sc.nextInt();
        while (n != -1) {
            switch (n) {
                case 1:
                    CelsiusToFahrenheit();
                    break;
                case 2:
                    FahrenheitToCelsius();
                    break;
                case 3:
                    CelsiusToKelvin();
                    break;
                case 4:
                    KelvinToCelsius();
                    break;
                case 5:
                    FahrenheitToKelvin();
                    break;
                case 6:
                    KelvinToFahrenhit();
                    break;
                case 7:
                    System.out.println("Thank you !");
                    System.exit(0);
                default:
                    System.out.println("Invaild");
            }
            System.out.println("Enter another number:");
            n = sc.nextInt();
        }
    }

    public static void CelsiusToFahrenheit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the celsius:");
        double c = sc.nextDouble();
        double f = (c * 9 / 5) + 32;
        System.out.println(c + " Celsius is equal to " + f);
    }

    public static void FahrenheitToCelsius() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fahrenheit:");
        double f = sc.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println(f + " Fahrenheit is equal to " + c);
    }

    public static void CelsiusToKelvin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the celsius:");
        double c = sc.nextDouble();
        double k = c + 273.15;
        System.out.println(c + " Celsius is equal to " + k);
    }

    public static void KelvinToCelsius() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the kelvin:");
        double k = sc.nextDouble();
        double c = k - 273.15;
        System.out.println(k + " Kelvin is equal to " + c);
    }

    public static void FahrenheitToKelvin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fahrenheit:");
        double f = sc.nextDouble();
        double k = (f + 459.67) * 5 / 9;
        System.out.println(f + " Fahrenheit is equal to " + k);
    }

    public static void KelvinToFahrenhit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the kelvin:");
        double k = sc.nextDouble();
        double f = k * 9 / 5 - 459.69;
        System.out.println(k + " Kelvin is equal to " + f);
    }
}
