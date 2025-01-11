import java.util.Scanner;

public class ArrayCopy{

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //Taking rows and columns as user input
        System.out.print("Enter the number of rows: ");
        int rows = kb.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = kb.nextInt();

        // Creating 2d array and inserting values inside it
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = kb.nextInt();
            }
        }

        // Creating a 1D array to copy elements of 2D array 
        int[] array = new int[rows * columns];
        int index = 0;

        // Copying elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Displaying the 1D array
        System.out.println("The 1D array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        kb.close();
    }
}
