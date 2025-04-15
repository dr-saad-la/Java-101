/*****************************************************************************
 * PROJECT:    Java-101 Comprehensive Programming Course
 * MODULE:     Arrays and Strings
 * LESSON:     6.3 - Multidimensional Arrays
 *
 * AUTHOR:     Dr. Saad Laouadi, Ph.D.
 * CREATED:    April 2025
 *
 * Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
 * See LICENSE file for complete terms.
 *****************************************************************************/

import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        displayBanner('*', 72);
        System.out.println("MULTIDIMENSIONAL ARRAYS");
        System.out.println("=======================");

        // 1. Introduction to multidimensional arrays
        System.out.println("\n1. Introduction to Multidimensional Arrays");
        System.out.println("   - Multidimensional arrays are arrays of arrays");
        System.out.println("   - They allow you to create tables of data with rows and columns");
        System.out.println("   - Java supports any number of dimensions, but 2D and 3D are most common");
        System.out.println("   - Useful for representing matrices, grids, and complex data structures");

        // 2. Declaring and creating 2D arrays
        System.out.println("\n2. Declaring and Creating 2D Arrays");

        // a) Declaration syntax
        System.out.println("   a) Declaration syntax:");
        System.out.println("      dataType[][] arrayName;    // Preferred syntax");
        System.out.println("      dataType arrayName[][];    // Alternative syntax");
        System.out.println("      dataType[] arrayName[];    // Also valid");

        int[][] matrix;              // Preferred syntax
        int scores[][];              // Alternative syntax
        double[] temperatures[];     // Also valid

        // b) Creating 2D arrays
        System.out.println("\n   b) Creating 2D arrays with the new operator:");

        matrix = new int[3][4];      // 3 rows, 4 columns
        System.out.println("      Created matrix with 3 rows and 4 columns");

        scores = new int[2][3];      // 2 rows, 3 columns
        System.out.println("      Created scores array with 2 rows and 3 columns");

        // c) Declaration and creation in one step
        System.out.println("\n   c) Declaration and creation in one step:");

        boolean[][] flags = new boolean[2][2];
        System.out.println("      Created flags array with 2 rows and 2 columns");

        // 3. Initializing 2D arrays
        System.out.println("\n3. Initializing 2D Arrays");

        // a) Using nested loops
        System.out.println("   a) Using nested loops:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i + j;
            }
        }

        System.out.println("      Matrix initialized with values (i + j)");
        printMatrix(matrix);

        // b) Initializing at declaration time
        System.out.println("\n   b) Initializing at declaration time:");

        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("      Grid initialized with values:");
        printMatrix(grid);

        // c) Initializing with different sized rows (jagged arrays)
        System.out.println("\n   c) Initializing with different sized rows (jagged arrays):");

        int[][] jaggedArray = {
            {1, 2, 3, 4},
            {5, 6},
            {7, 8, 9}
        };

        System.out.println("      Jagged array initialized with values:");
        printMatrix(jaggedArray);

        // 4. Accessing elements in 2D arrays
        System.out.println("\n4. Accessing Elements in 2D Arrays");
        System.out.println("   Syntax: arrayName[rowIndex][columnIndex]");

        int value = grid[1][2];  // Gets the element at row 1, column 2 (third column of second row)
        System.out.println("   Value at grid[1][2]: " + value);

        grid[0][0] = 10;         // Sets the element at row 0, column 0 to 10
        System.out.println("   After setting grid[0][0] = 10:");
        printMatrix(grid);

        // 5. Iterating through 2D arrays
        System.out.println("\n5. Iterating Through 2D Arrays");

        // a) Using nested for loops
        System.out.println("   a) Using nested for loops:");

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print("      grid[" + i + "][" + j + "] = " + grid[i][j] + "\t");
            }
            System.out.println();
        }

        // b) Using enhanced for loop
        System.out.println("\n   b) Using enhanced for loop:");

        for (int[] row : grid) {
            for (int element : row) {
                System.out.print("      " + element + "\t");
            }
            System.out.println();
        }

        // 6. Common operations on 2D arrays
        System.out.println("\n6. Common Operations on 2D Arrays");

        // a) Finding the sum of all elements
        System.out.println("   a) Finding the sum of all elements:");

        int sum = 0;
        for (int[] row : grid) {
            for (int element : row) {
                sum += element;
            }
        }

        System.out.println("      Sum of all elements in grid: " + sum);

        // b) Finding the maximum element
        System.out.println("\n   b) Finding the maximum element:");

        int max = grid[0][0];
        for (int[] row : grid) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }

        System.out.println("      Maximum element in grid: " + max);

        // c) Matrix transpose (rows become columns)
        System.out.println("\n   c) Matrix transpose (rows become columns):");

        int[][] original = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int rows = original.length;
        int columns = original[0].length;

        int[][] transposed = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposed[j][i] = original[i][j];
            }
        }

        System.out.println("      Original matrix:");
        printMatrix(original);
        System.out.println("      Transposed matrix:");
        printMatrix(transposed);

        // 7. Creating and working with 3D arrays
        System.out.println("\n7. Creating and Working with 3D Arrays");
        System.out.println("   3D arrays can be thought of as arrays of 2D arrays (layers of matrices)");

        // a) Declaring and creating 3D arrays
        System.out.println("   a) Declaring and creating 3D arrays:");

        int[][][] cube = new int[3][3][3];  // 3 layers, 3 rows, 3 columns
        System.out.println("      Created a 3x3x3 cube array");

        // b) Initializing a 3D array
        System.out.println("\n   b) Initializing a 3D array:");

        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    cube[i][j][k] = (i + 1) * (j + 1) * (k + 1);
                }
            }
        }

        System.out.println("      3D array initialized with values (i+1)*(j+1)*(k+1)");

        // c) Accessing elements in a 3D array
        System.out.println("\n   c) Accessing elements in a 3D array:");
        System.out.println("      cube[1][1][1]: " + cube[1][1][1]);
        System.out.println("      cube[2][0][2]: " + cube[2][0][2]);

        // d) Iterating through a 3D array
        System.out.println("\n   d) Iterating through a 3D array:");
        System.out.println("      First layer of the cube:");

        for (int j = 0; j < cube[0].length; j++) {
            for (int k = 0; k < cube[0][j].length; k++) {
                System.out.print("      " + cube[0][j][k] + "\t");
            }
            System.out.println();
        }

        // 8. Practical applications of multidimensional arrays
        System.out.println("\n8. Practical Applications of Multidimensional Arrays");

        // a) Representing a chess board
        System.out.println("   a) Representing a chess board:");

        char[][] chessBoard = {
            {'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'},
            {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
            {' ', '.', ' ', '.', ' ', '.', ' ', '.'},
            {'.', ' ', '.', ' ', '.', ' ', '.', ' '},
            {' ', '.', ' ', '.', ' ', '.', ' ', '.'},
            {'.', ' ', '.', ' ', '.', ' ', '.', ' '},
            {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
            {'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'}
        };

        System.out.println("      Chess board representation:");
        for (char[] row : chessBoard) {
            System.out.print("      ");
            for (char piece : row) {
                System.out.print(piece + " ");
            }
            System.out.println();
        }

        // b) Storing student grades
        System.out.println("\n   b) Storing student grades:");

        String[] students = {"Alice", "Bob", "Charlie"};
        String[] subjects = {"Math", "Science", "English"};
        int[][] grades = {
            {90, 85, 78},   // Alice's grades
            {75, 92, 89},   // Bob's grades
            {88, 84, 95}    // Charlie's grades
        };

        System.out.println("      Student grade report:");

        // Print header
        System.out.print("      Student  ");
        for (String subject : subjects) {
            System.out.print(subject + "  ");
        }
        System.out.println("Average");

        // Print grades
        for (int i = 0; i < students.length; i++) {
            System.out.print("      " + students[i] + "     ");

            int studentSum = 0;
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(grades[i][j] + "     ");
                studentSum += grades[i][j];
            }

            double average = (double) studentSum / subjects.length;
            System.out.printf("%.1f\n", average);
        }

        // 9. Using Arrays utility class with multidimensional arrays
        System.out.println("\n9. Using Arrays Utility Class with Multidimensional Arrays");

        // a) Arrays.toString vs Arrays.deepToString
        System.out.println("   a) Arrays.toString() vs Arrays.deepToString():");

        int[][] sample = {{1, 2}, {3, 4}};

        System.out.println("      Using Arrays.toString(): " + Arrays.toString(sample));
        System.out.println("      Using Arrays.deepToString(): " + Arrays.deepToString(sample));

        // b) Comparing multidimensional arrays
        System.out.println("\n   b) Comparing multidimensional arrays:");

        int[][] array1 = {{1, 2}, {3, 4}};
        int[][] array2 = {{1, 2}, {3, 4}};
        int[][] array3 = {{1, 2}, {3, 5}};

        System.out.println("      array1 equals array2? " + Arrays.deepEquals(array1, array2));
        System.out.println("      array1 equals array3? " + Arrays.deepEquals(array1, array3));

        // c) Filling a 2D array
        System.out.println("\n   c) Filling rows in a 2D array:");

        int[][] filledArray = new int[3][4];
        Arrays.fill(filledArray[0], 1);  // Fill first row with 1s
        Arrays.fill(filledArray[1], 2);  // Fill second row with 2s
        Arrays.fill(filledArray[2], 3);  // Fill third row with 3s

        System.out.println("      Filled array:");
        printMatrix(filledArray);

        // 10. Best practices and considerations
        System.out.println("\n10. Best Practices and Considerations");

        System.out.println("    a) Memory Considerations:");
        System.out.println("       - Multidimensional arrays can consume significant memory");
        System.out.println("       - Consider using one-dimensional arrays with manual indexing for huge datasets");

        System.out.println("\n    b) Performance Tips:");
        System.out.println("       - Process rows first, then columns (respects memory layout)");
        System.out.println("       - Use local variables to store array lengths in loops");

        System.out.println("\n    c) Jagged Arrays:");
        System.out.println("       - Rows can have different lengths");
        System.out.println("       - Use array.length to get number of rows");
        System.out.println("       - Use array[i].length to get length of row i");

        System.out.println("\n    d) Initialization:");
        System.out.println("       - Initialize large arrays programmatically rather than manually");
        System.out.println("       - Consider using helper methods for complex initialization patterns");

        displayBanner('*', 72);
    }

    // Helper method to print a 2D array/matrix
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.print("      ");
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    // Helper method for formatting output
    static void displayBanner(char c, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}
