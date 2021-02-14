package soru1;

public class Main {
        public static void main(String[] args) {
                AdvancedCalculator<Integer> intCalculator = new AdvancedCalculator<>();
                AdvancedCalculator<Double> doubleCalculator = new AdvancedCalculator<>();

                int x, y, z;
                double a, b, c;

                //Çarpma ve Bölme
                x = 10;
                y = 5;
                a = 5;
                b = 2.5;
                System.out.println("x * y: " + intCalculator.multiply(x, y));
                System.out.println("x / y: " + intCalculator.divide(x, y));
                System.out.println("a * b: " + doubleCalculator.multiply(a, b));
                System.out.println("a / b: " + doubleCalculator.divide(a, b));

                //Karesi
                z = 8;
                c = 5.0;
                System.out.println("z'nin karesi: " + intCalculator.square(z));
                System.out.println("c'nin karesi: " + doubleCalculator.square(c));

                //Küpü
                System.out.println("z'nin küpü: " + intCalculator.cube(z));
                System.out.println("c'nin küpü: " + doubleCalculator.cube(c));
        }
}
