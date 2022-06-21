import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = displayMainMenu();

        while (choice != 0) {
            switch (choice) {
                case 1:
                    create();
                    break;
                case 2:

                    break;
                default:
                    System.out.println("Enter a valid option (from 0 to 2)");
            }
        }

    }

    static int displayMainMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Main Menu:");
        System.out.println("=================");
        System.out.println("0. Exit");
        System.out.println("1. Create new list");
        System.out.println("2. Choose existing list");
        System.out.println("=================");
        System.out.print("> ");
        return input.nextInt();
    }

    public static ToDoList create(){
        return new ToDoList(setTitle());
    }

    public static String setTitle(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    }


