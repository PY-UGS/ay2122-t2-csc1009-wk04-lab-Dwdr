import java.util.Scanner;

public class MainBMI {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double Weight = scan.nextDouble();
        System.out.print("Enter height in inches: ");
        double Height = scan.nextDouble();
        scan.close();
        BMI test = new BMI(Weight, Height);
        System.out.println("BMI is " + test.getBMI());
        System.out.println(test.printBMI(test.getBMI()));
    }
}
