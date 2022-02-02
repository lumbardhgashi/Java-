import java.util.Scanner;

public class Pjestimi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first double: ");
        double q = sc.nextDouble();
        System.out.println("Enter second double: ");
        double p = sc.nextDouble();

        double c = q / p;

        System.out.println(q + " / " + p + " = " + c);
    }
}
