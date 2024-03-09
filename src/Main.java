public class Main {
    static final String EXIT = "Exit";
    static final String CREATE = "Create an array";
    static final String SET_ELEMENT = "Set an element";
    static final String SORT_BY_ROW = "Sort by row";
    static final String SORT_BY_COLUMN = "Sort by column";
    static final String SORT_ALL = "Sort all items";
    static final String ARRAY_MIDDLE = "Array middle value";
    static String[] menuItems = {EXIT, CREATE, SET_ELEMENT, SORT_BY_ROW, SORT_BY_COLUMN, SORT_ALL, ARRAY_MIDDLE};

    static Matrix matrix;


    public static void main(String[] args) {

        Menu menu = new Menu(menuItems);
        String menuCommand = menu.getCommand();
        while (!menuCommand.equals(EXIT)) {
            switch (menuCommand) {
                case CREATE -> matrix = createArray2();
                case SET_ELEMENT -> setMatrixElement(matrix);
                case SORT_BY_ROW -> sortByRow(matrix);
                case SORT_ALL -> sortAll(matrix);
                case SORT_BY_COLUMN -> sortByColumn(matrix);
                case ARRAY_MIDDLE -> arrayMiddle(matrix);
            }
            System.out.println(matrix);
            menuCommand = menu.getCommand();
        }

    }

    public static Matrix createArray() {
        int matrixHeight = Menu.readInt("Enter the height of array: ");
        int matrixWidth = Menu.readInt("Enter the width of array: ");
        return new Matrix(matrixHeight, matrixWidth);
    }

    public static Matrix createArray2() {
        int[][] array = {{1, 4, 5, 6}, {2, 4, 8, 6}, {5, 7, 9, 10}, {1, 4, 78, 0}};
        return new Matrix(array);
    }


    public static void setMatrixElement(Matrix matrix) {
        while (true) {
            int i = Menu.readInt("Enter column index: ");
            if (i == -1) break;

            int j = Menu.readInt("Enter row index: ");
            int value = Menu.readInt("Enter item value: ");
            try {
                matrix.setElement(i, j, value);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void sortByRow(Matrix matrix) {
        matrix.sortByRow();

    }

    public static void sortAll(Matrix matrix) {
        matrix.sortAll();

    }

    public static void arrayMiddle(Matrix matrix) {
        double middle = matrix.middle();
        System.out.printf("%s = %.02f%n%n", "Array middle", middle);

    }

    public static void sortByColumn(Matrix matrix){
        matrix.sortByColumn();
    }

}