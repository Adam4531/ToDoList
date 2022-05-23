import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class ToDoList {
    private String title;
    private List<String> thingsToDo;
    private final LocalDateTime createAt;
    private List<Boolean> isDoneList;
    private LocalDateTime doneAt;


    public ToDoList(String aTitle) {
        title = aTitle;
        thingsToDo = new ArrayList<>();
        isDoneList = new ArrayList<>();
        createAt = LocalDateTime.now();
    }


    public void addElement(String element){
        thingsToDo.add(element);
        isDoneList.add(false);
    }


    public boolean isListDone(){
        for (Boolean isDone: isDoneList) {
            if(isDone.equals(false)){
                return false;
            }
        }
        this.doneAt = LocalDateTime.now();
        return true;
    }

    public void elementIsDone(int index){
        String element = thingsToDo.get(index);
        thingsToDo.add(index, element + " \u2705");
        isDoneList.set(index, true);
    }

    @Override
    public String toString(){
        StringBuilder list = new StringBuilder();
        int i = 1;

        for (String element: thingsToDo) {
            list.append(String.format("%d. %s\n",i , element));
            i++;
        }
        return list.toString();
    }





}
