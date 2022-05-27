import java.util.Scanner;

public class ToDoListUtils {

    public static ToDoList create(){
        Scanner input = new Scanner(System.in);
        System.out.println("Name a new list: ");
        System.out.print("> ");
        String name = input.next();


        return new ToDoList(name);
    }
}
