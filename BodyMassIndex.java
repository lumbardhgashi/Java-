import java.util.Scanner;

public class BodyMassIndex{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your mass: ");
        int m = sc.nextInt();

        System.out.println("Enter your height: ");
        int l = sc.nextInt();

        System.out.println("Your mass is: " + m);
        System.out.println("Your height is: " + l);

        double BMI = m / Math.pow(l, 2);
        System.out.println("Your BMI is: " + BMI);



    }


}



