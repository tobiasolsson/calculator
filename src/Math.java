import java.util.ArrayList;

public class Math {
    static void add(ArrayList<Double> x) {
        double n = x.get(0);
        for (int i = 1; i < x.size(); i++) {
            n += x.get(i);
        }
        System.out.println("Summan av talen är: " + (int)n);
    }

    static void subtract(ArrayList<Double> x) {
        double n = x.get(0);
        for (int i = 1; i < x.size(); i++) {
            n -= x.get(i);
        }
        System.out.println("Summan av talen är: " + (int)n);
    }

    static void divide(ArrayList<Double> x) {
        double n = x.get(0);
        for (int i = 1; i < x.size(); i++) {
            n /= x.get(i);
        }
        System.out.println("Kvoten av talen är: " + n);
    }

    static void multiply(ArrayList<Double> x) {
        double n = x.get(0);
        for (int i = 1; i < x.size(); i++) {
            n *= x.get(i);
        }
        System.out.println("Produkten av talen är: " + (int)n);
    }

    static void modulus(ArrayList<Double> x) {
        double n = x.get(0);
        for (int i = 1; i < x.size(); i++) {
            n %= x.get(i);
        }
        System.out.println("Resten av talen är: " + (int)n);
    }

    static void largerThan(ArrayList<Double> x) {
        double n1 = x.get(0);
        double n2 = x.get(1);

        //convert to int
        int a = (int)n1;
        int b = (int)n2;

        if (a > b) {
            System.out.printf("%d ÄR större än %d\n", a, b);
        } else if (a < b) {
            System.out.printf("%d ÄR INTE större än %d\n", a, b);
        } else {
            System.out.printf("%d ÄR LIKA MED %d\n", a, b);
        }
    }
}
