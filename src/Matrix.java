import java.util.Arrays;

public class Matrix {
    int[][] matrix;

    public Matrix() {
        this.matrix = new int[0][0];
    }

    public Matrix(int height, int width) {
        this.matrix = new int[height][width];
    }

    public Matrix(int[][] matrix) {
        this.matrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                this.matrix[i][j] = matrix[i][j];
            }
        }

    }

    public int getElement(int i, int j) throws Exception {
        if (i < 0 || i >= getHeight() || j < 0 || j >= getWidth()) {
            throw new Exception("An element with such index doesn't exist");
        }

        return matrix[i][j];
    }

    public void setElement(int i, int j, int value) throws Exception {
        if (i < 0 || i >= getHeight() || j < 0 || j >= getWidth()) {
            throw new Exception("An element with such index doesn't exist");
        }

        matrix[i][j] = value;

    }

    public void sortByRow() {
        for (int[] item : matrix) {
            Arrays.sort(item);
        }
    }

    public void sortByColumn() {
        int[] tempArray = new int[getHeight()];
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getHeight(); j++) {
                tempArray[j] = matrix[j][i];
            }
            Arrays.sort(tempArray);
            for (int j = 0; j < getHeight(); j++) {
                matrix[j][i] = tempArray[j];
            }
        }
    }

    public void sortAll() {
        int[] tempArray = new int[getWidth() * getHeight()];
        int k = 0;
        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                tempArray[k++] = matrix[i][j];
            }
        }
        Arrays.sort(tempArray);
        k = 0;
        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                matrix[i][j] = tempArray[k++];
            }
        }

    }

    public double middle(){
        double middle = 0.0;
        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                middle += matrix[i][j];
            }
        }
        return middle/(getHeight()* getWidth());
    }

    public int getHeight() {
        return matrix.length;
    }

    public int getWidth() {
        return matrix[0].length;
    }


    public String toString() {
        String matrixString = "";
        for (int i = 0; i < getHeight(); i++) {
            matrixString += Arrays.toString(matrix[i]) + "\n";
        }
        return matrixString;
    }

}
