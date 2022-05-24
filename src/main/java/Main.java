import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        display();
        int option = input.nextInt();
        menu(option);
    }

    static void display() { //TODO Create display menu and make a tests
        System.out.println("=================");
        System.out.println("1. Create new list");
        System.out.println("2. Choose existing list");
        System.out.println("3. Exit");
        System.out.println("=================");
    }

    static void menu(int option) {
        switch (option){
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            default:
                throw new IllegalArgumentException("");
        }

    }
}
