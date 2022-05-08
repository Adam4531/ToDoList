public abstract class Menu {
    String border = "==============";
    String option1 = "1. Create new To-Do List";
    String option2 = "2. Read existing To-Do List";
    String option3 = "3. Update To-Do List";
    String option4 = "4. Delete one of existing To-Do List";
    String goBack = "Press \"~\" to go back";
    String end = "0. End";

    public static Option show(int command){
        StringBuilder stringBuilder = new StringBuilder();


        switch (command){
            case 1:
                return Option.CREATE;
            case 2:
                return Option.READ;
            case 3:
                return Option.UPDATE;
            case 4:
                return Option.DELETE;
            default:
                throw new IllegalArgumentException("Command were not recognised");
        }
    }

    //TODO metoda z switch case do wyboru opcji
}
