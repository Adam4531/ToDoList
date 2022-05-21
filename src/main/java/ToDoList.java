import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
public class ToDoList { //TODO ToDoListFactory - jak ma to się odbywać?
    private String title;
    private List<String> thingsToDo;
    private LocalDateTime createAt;
    private List<Boolean> isDone;
    private LocalDateTime doneAt;


    public ToDoList(String aTitle, List<String> aThingsToDo, LocalDateTime aCreateAt) {
        title = aTitle;
        thingsToDo = aThingsToDo;
        createAt = aCreateAt;
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
        return true;
    }





}
