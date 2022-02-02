import java.util.Scanner;

public class Mbledhja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first double: ");
        double q = sc.nextDouble();

        System.out.println("Enter second double: ");
        double p = sc.nextDouble();


        int c =(int) (p + q);
        int d = (int) p + (int) q;

        System.out.println("a)" + c);
        System.out.println("b)" + d);

    }


}
