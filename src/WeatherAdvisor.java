import java.util.Scanner;

public class WeatherAdvisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el número inicial: ");
        int inicio = input.nextInt();

        System.out.print("Ingrese el número final: ");
        int fin = input.nextInt();

        for (int i = inicio; i <= fin; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.println("FizzBuzzBoom");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 7 == 0) {
                System.out.println("Boom");
            } else {
                System.out.println(i);
            }
        }

        input.close();
    }
}

