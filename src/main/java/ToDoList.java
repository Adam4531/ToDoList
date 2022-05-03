import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashMap;

@Getter
@Setter
public class ToDoList { //TODO ToDoListFactory - jak ma to się odbywać? JavaBean?
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
