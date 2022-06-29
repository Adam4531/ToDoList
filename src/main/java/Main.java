import java.util.*;

public class Main {
    public static List<ToDoList> lists = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = displayMainMenu();

        while (choice != 0) {
            switch (choice) {
                case 1:
                    create();
                    break;
                case 2: //TODO choose one list for CRUD
                    showLists();
                    displayCurrentListMenu();
                    break;
                default:
                    System.out.println("Enter a valid option (from 0 to 2)");
            }
        }
        input.close();
    }

    private static void showLists() {
        lists.stream().distinct().forEach(s -> System.out.println(s.getTitle()));
    }

    static int displayMainMenu() {
//        Scanner input = new Scanner(System.in);
        System.out.println("Main Menu:");
        System.out.println("=================");
        System.out.println("0. Exit");
        System.out.println("1. Create new list");
        System.out.println("2. Choose existing list");
        System.out.println("=================");
        System.out.print("> ");
        int choice = input.nextInt();
        input.close();

        return choice;
    }

    static void displayCurrentListMenu() {
        final ToDoList toDoList = lists.get(input.nextInt());
        System.out.println("You chose: " + toDoList);
        System.out.println("What do you want to do with it?");
        System.out.println("1. Print elements");
        System.out.println("2. Add elements");
        System.out.println("3. Check element");
        System.out.println("4. Delete element");
        System.out.println("5. Delete list");
    }

    public static ToDoList create() {
        String title = setTitle();
        ToDoList toDoList = new ToDoList(title);
        save(toDoList);

        return toDoList;
    }

    public static String setTitle() { //FIXME NoSuchElementException
        System.out.println("Name a new list: ");
//        Scanner scanner = new Scanner(System.in);
        return input.next();
    }

    public static boolean save(ToDoList aToDoList) {
        lists.add(aToDoList);

        return lists.contains(aToDoList);
    }

}