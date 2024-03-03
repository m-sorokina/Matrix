import java.util.*;

public class Menu {

    static Scanner input = new Scanner(System.in);
    String[] menuItems;

    public Menu(String[] menuItems){
        this.menuItems = menuItems;
    }

    public String getCommand(){
        for(int i = 1; i < menuItems.length; i++){
            System.out.printf("%d - %s%n", i, menuItems[i]);
        }
        System.out.printf("%d - %s%n", 0, menuItems[0]);
        int commandNumber = readInt("Select menu item: ");
        while (commandNumber < 0 || commandNumber > menuItems.length - 1){
            commandNumber = readInt("Wrong number, repeat: ");
        }
        return menuItems[commandNumber];
    }

    public int readInt(String prompt){
        System.out.printf(prompt);
        String text = input.nextLine();
        try{
            return Integer.parseInt(text);
        }
        catch(Exception e){
            return -1;
        }
    }

}
