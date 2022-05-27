import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = display();

        while (choice != 3) {
            switch (choice) {
                case 1:
                    ToDoListFactory.create();
                    break;
                case 2:

                    break;
                default:
                    System.out.println("Enter a valid option (from 1 to 3)");
            }
        }

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

//    static void menu(int option) {
//        while (option != 3) {
//            switch (option) {
//                case 1:
//                    ToDoListFactory.create();
//                    break;
//                case 2:
//
//                    break;
//                default:
//                    System.out.println("Enter a valid option (from 1 to 3)");
//            }
//        }
    }

}
