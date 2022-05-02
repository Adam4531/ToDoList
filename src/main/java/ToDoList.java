import java.time.LocalDateTime;
import java.util.HashMap;

public class ToDoList { //ToDoListFactory - jak ma to się odbywać?
    private String title;
    private HashMap<Integer, String> thingsToDo;
    private LocalDateTime createAt;
//    private LocalDateTime doneAt;


    public ToDoList(String aTitle, HashMap<Integer, String> aThingsToDo, LocalDateTime aCreateAt) {
        title = aTitle;
        thingsToDo = aThingsToDo;
        createAt = aCreateAt;
    }


}
