import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numberChoice = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numberChoice + " x " + i +" = " + numberChoice*i);
        }
        scanner.close();
    }
}