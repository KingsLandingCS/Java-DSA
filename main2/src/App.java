import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favortie food");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You're " + age + " years old");
        System.out.println("You like " + food);
    }
}
