import java.util.Scanner;

public class ToDoListFactory { //TODO implementation of interface? Then methods can't be a static method and it's needed to create an object of implementation

    public static ToDoList create() {
        Scanner input = new Scanner(System.in);
        System.out.println("Name a new list: ");
        System.out.print("> ");
        String name = input.next();


        return new ToDoList(name);
    }
}
