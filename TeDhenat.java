import java.util.Scanner;

public class TeDhenat {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter your ID:");
        Long id = sc.nextLong();
        System.out.println("Enter your average grade:");
        Float averageGrade = sc.nextFloat();

        System.out.println("Studenti " + name + " me ID " + id + " ka noten mesatare " + averageGrade);


    }


}
