public class Main {
    static final String EXIT = "Exit";
    static final String CREATE = "Create an array";
    static final String DO_NOTHING = "Nothing";

    static String[] menuItems = {EXIT, CREATE, DO_NOTHING};


    public static void main(String[] args) {

        Menu menu = new Menu(menuItems);
        System.out.printf("%s%n", menu.getCommand());

    }
}