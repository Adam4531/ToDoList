import java.util.*;

public class Main {
    public static List<ToDoList> lists = new ArrayList<>();
    static int counter = 0;

    public static void main(String[] args) {
        int choice = displayMainMenu();

        while (choice != 0) {
            switch (choice) {
                case 1:
                    create();
                    break;
                case 2:
                    showLists();
                    break;
                default:
                    System.out.println("Enter a valid option (from 0 to 2)");
            }
        }

    }

    private static void showLists() {
        lists.stream().forEach(s -> System.out.println(s.getTitle()));
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

    public static boolean save(ToDoList aToDoList){
        lists.add(aToDoList);

        return lists.contains(aToDoList);
    }

    }