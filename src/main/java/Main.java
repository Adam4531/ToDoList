import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = display();

    }

    static int display() {
        Scanner input = new Scanner(System.in);
        System.out.println("Main Menu:");
        System.out.println("=================");
        System.out.println("1. Create new list");
        System.out.println("2. Choose existing list");
        System.out.println("3. Exit");
        System.out.println("=================");
        System.out.print("> ");
        return input.nextInt();
    }

    static void menu(int option) {
        while (option != -1) {
            switch (option) {
                case 1:
                    ToDoListUtils.create();
                    break;
                case 2:

                    break;
                case 3:
                    break;
                default:
                    System.out.println("Enter a valid option (from 1 to 3)");
            }
        }
    }

}
