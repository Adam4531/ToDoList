import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
public class ToDoList {
    private String title;
    private List<String> thingsToDo;
    private final LocalDateTime createAt;
    private List<Boolean> isDone;
    private LocalDateTime doneAt;


    public ToDoList(String aTitle) {
        title = aTitle;
        thingsToDo = new ArrayList<>();
        isDone = new ArrayList<>();
        createAt = LocalDateTime.now();
    }


    public void addElement(String element){
        thingsToDo.add(element);
        isDone.add(false);
    }


    public boolean isListDone(){
        for (Boolean isDone: isDone) {
            if(isDone.equals(false)){
                return false;
            }
        }
        this.doneAt = LocalDateTime.now();
        return true;
    }





}
