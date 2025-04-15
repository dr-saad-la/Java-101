/*****************************************************************************
 * PROJECT:    Java-101 Comprehensive Programming Course
 * MODULE:     Arrays and Strings
 * LESSON:     6.2 - Array Operations and Manipulation
 *
 * AUTHOR:     Dr. Saad Laouadi, Ph.D.
 * CREATED:    April 2025
 *
 * Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
 * See LICENSE file for complete terms.
 *****************************************************************************/

import java.util.Arrays;

public class ArrayOperationsAndManipulation {
    public static void main(String[] args) {
        displayBanner('*', 72);
        System.out.println("ARRAY OPERATIONS AND MANIPULATION");
        System.out.println("================================");

        // 1. Copying arrays
        System.out.println("\n1. Copying Arrays");

        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("   Original array: " + Arrays.toString(originalArray));

        // a) Using loop
        System.out.println("\n   a) Copying using a loop:");
        int[] copyUsingLoop = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            copyUsingLoop[i] = originalArray[i];
        }

        System.out.println("      Copy result: " + Arrays.toString(copyUsingLoop));

        // b) Using arraycopy method
        System.out.println("\n   b) Copying using System.arraycopy():");
        int[] copyUsingArrayCopy = new int[originalArray.length];

        System.arraycopy(originalArray, 0, copyUsingArrayCopy, 0, originalArray.length);

        System.out.println("      Copy result: " + Arrays.toString(copyUsingArrayCopy));

        // c) Using Arrays.copyOf method
        System.out.println("\n   c) Copying using Arrays.copyOf():");
        int[] copyUsingCopyOf = Arrays.copyOf(originalArray, originalArray.length);

        System.out.println("      Copy result: " + Arrays.toString(copyUsingCopyOf));

        // d) Using clone method
        System.out.println("\n   d) Copying using clone():");
        int[] copyUsingClone = originalArray.clone();

        System.out.println("      Copy result: " + Arrays.toString(copyUsingClone));

        // 2. Copying partial arrays
        System.out.println("\n2. Copying Partial Arrays");

        // a) Using arraycopy for partial copy
        System.out.println("   a) Partial copy using System.arraycopy():");
        int[] partialCopy1 = new int[3];

        System.arraycopy(originalArray, 1, partialCopy1, 0, 3);

        System.out.println("      Original array: " + Arrays.toString(originalArray));
        System.out.println("      Partial copy (elements 1-3): " + Arrays.toString(partialCopy1));

        // b) Using Arrays.copyOfRange
        System.out.println("\n   b) Partial copy using Arrays.copyOfRange():");
        int[] partialCopy2 = Arrays.copyOfRange(originalArray, 2, 5);

        System.out.println("      Original array: " + Arrays.toString(originalArray));
        System.out.println("      Partial copy (elements 2-4): " + Arrays.toString(partialCopy2));

        // 3. Resizing arrays
        System.out.println("\n3. Resizing Arrays");
        System.out.println("   (Arrays in Java have fixed size, but we can simulate resizing)");

        // a) Creating a larger array
        System.out.println("   a) Creating a larger array:");
        int[] expandedArray = Arrays.copyOf(originalArray, originalArray.length + 3);

        System.out.println("      Original array: " + Arrays.toString(originalArray));
        System.out.println("      Expanded array: " + Arrays.toString(expandedArray));

        // b) Creating a smaller array
        System.out.println("\n   b) Creating a smaller array:");
        int[] shrunkArray = Arrays.copyOf(originalArray, originalArray.length - 2);

        System.out.println("      Original array: " + Arrays.toString(originalArray));
        System.out.println("      Shrunk array: " + Arrays.toString(shrunkArray));

        // 4. Filling arrays
        System.out.println("\n4. Filling Arrays");

        // a) Using loop to fill
        System.out.println("   a) Filling using a loop:");
        int[] filledWithLoop = new int[5];

        for (int i = 0; i < filledWithLoop.length; i++) {
            filledWithLoop[i] = 10;
        }

        System.out.println("      Result: " + Arrays.toString(filledWithLoop));

        // b) Using Arrays.fill
        System.out.println("\n   b) Filling using Arrays.fill():");
        int[] filledWithFill = new int[5];
        Arrays.fill(filledWithFill, 20);

        System.out.println("      Result: " + Arrays.toString(filledWithFill));

        // c) Filling part of an array
        System.out.println("\n   c) Filling part of an array:");
        int[] partialFill = new int[5];
        Arrays.fill(partialFill, 1, 4, 30);

        System.out.println("      Result: " + Arrays.toString(partialFill));

        // 5. Comparing arrays
        System.out.println("\n5. Comparing Arrays");

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 5, 4};

        // a) Using loop
        System.out.println("   a) Comparing using a loop:");
        boolean areEqual = true;

        if (array1.length != array2.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    areEqual = false;
                    break;
                }
            }
        }

        System.out.println("      array1 equals array2? " + areEqual);

        // b) Using Arrays.equals
        System.out.println("\n   b) Comparing using Arrays.equals():");
        boolean equalsResult1 = Arrays.equals(array1, array2);
        boolean equalsResult2 = Arrays.equals(array1, array3);

        System.out.println("      array1 equals array2? " + equalsResult1);
        System.out.println("      array1 equals array3? " + equalsResult2);

        // 6. Searching arrays
        System.out.println("\n6. Searching in Arrays");

        int[] searchArray = {10, 20, 30, 40, 50};
        int target = 30;

        // a) Linear search using loop
        System.out.println("   a) Linear search using a loop:");
        int linearSearchIndex = -1;

        for (int i = 0; i < searchArray.length; i++) {
            if (searchArray[i] == target) {
                linearSearchIndex = i;
                break;
            }
        }

        System.out.println("      Array: " + Arrays.toString(searchArray));
        System.out.println("      Searching for: " + target);

        if (linearSearchIndex != -1) {
            System.out.println("      Found at index: " + linearSearchIndex);
        } else {
            System.out.println("      Not found in array");
        }

        // b) Binary search (works on sorted arrays)
        System.out.println("\n   b) Binary search using Arrays.binarySearch():");
        int binarySearchIndex = Arrays.binarySearch(searchArray, target);

        System.out.println("      Array: " + Arrays.toString(searchArray));
        System.out.println("      Searching for: " + target);

        if (binarySearchIndex >= 0) {
            System.out.println("      Found at index: " + binarySearchIndex);
        } else {
            System.out.println("      Not found in array");
        }

        // 7. Sorting arrays
        System.out.println("\n7. Sorting Arrays");

        int[] unsortedArray = {5, 2, 9, 1, 7, 6, 3};
        System.out.println("   Unsorted array: " + Arrays.toString(unsortedArray));

        // a) Using bubble sort (manual implementation)
        System.out.println("\n   a) Bubble sort implementation:");
        int[] bubbleSortArray = unsortedArray.clone();

        for (int i = 0; i < bubbleSortArray.length - 1; i++) {
            for (int j = 0; j < bubbleSortArray.length - i - 1; j++) {
                if (bubbleSortArray[j] > bubbleSortArray[j + 1]) {
                    // Swap elements
                    int temp = bubbleSortArray[j];
                    bubbleSortArray[j] = bubbleSortArray[j + 1];
                    bubbleSortArray[j + 1] = temp;
                }
            }
        }

        System.out.println("      After bubble sort: " + Arrays.toString(bubbleSortArray));

        // b) Using Arrays.sort
        System.out.println("\n   b) Sorting using Arrays.sort():");
        int[] sortedArray = unsortedArray.clone();
        Arrays.sort(sortedArray);

        System.out.println("      After Arrays.sort(): " + Arrays.toString(sortedArray));

        // c) Sorting part of an array
        System.out.println("\n   c) Sorting part of an array:");
        int[] partialSortArray = unsortedArray.clone();
        Arrays.sort(partialSortArray, 1, 5);

        System.out.println("      Original array: " + Arrays.toString(unsortedArray));
        System.out.println("      After sorting elements 1-4: " + Arrays.toString(partialSortArray));

        // 8. Reversing arrays
        System.out.println("\n8. Reversing Arrays");

        int[] arrayToReverse = {1, 2, 3, 4, 5};
        System.out.println("   Original array: " + Arrays.toString(arrayToReverse));

        // Using loop to reverse
        for (int i = 0; i < arrayToReverse.length / 2; i++) {
            int temp = arrayToReverse[i];
            arrayToReverse[i] = arrayToReverse[arrayToReverse.length - 1 - i];
            arrayToReverse[arrayToReverse.length - 1 - i] = temp;
        }

        System.out.println("   Reversed array: " + Arrays.toString(arrayToReverse));

        // 9. Common array algorithms
        System.out.println("\n9. Common Array Algorithms");

        // a) Removing duplicates
        System.out.println("   a) Removing duplicates:");
        int[] duplicateArray = {1, 2, 3, 2, 4, 5, 3, 6};
        System.out.println("      Original array: " + Arrays.toString(duplicateArray));

        // Count unique elements
        int uniqueCount = 0;
        boolean[] seen = new boolean[duplicateArray.length];

        for (int i = 0; i < duplicateArray.length; i++) {
            if (!seen[i]) {
                int current = duplicateArray[i];

                for (int j = i + 1; j < duplicateArray.length; j++) {
                    if (duplicateArray[j] == current) {
                        seen[j] = true;
                    }
                }

                uniqueCount++;
            }
        }

        // Create new array without duplicates
        int[] uniqueArray = new int[uniqueCount];
        int index = 0;

        for (int i = 0; i < duplicateArray.length; i++) {
            if (!seen[i]) {
                uniqueArray[index++] = duplicateArray[i];
            }
        }

        System.out.println("      After removing duplicates: " + Arrays.toString(uniqueArray));

        // b) Finding the second largest element
        System.out.println("\n   b) Finding the second largest element:");
        int[] numbers = {10, 5, 20, 15, 25, 30, 15};
        System.out.println("      Array: " + Arrays.toString(numbers));

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        System.out.println("      Second largest element: " + secondLargest);

        // 10. Using the Arrays utility class
        System.out.println("\n10. Using the Arrays Utility Class");
        System.out.println("    The java.util.Arrays class provides useful methods for array manipulation:");

        // a) Arrays.toString
        System.out.println("    a) Arrays.toString() - for string representation:");
        int[] sampleArray = {1, 2, 3, 4, 5};
        String arrayString = Arrays.toString(sampleArray);

        System.out.println("       " + arrayString);

        // b) Arrays.asList
        System.out.println("\n    b) Arrays.asList() - converting array to List:");
        String[] fruits = {"Apple", "Banana", "Orange"};
        System.out.println("       Original array: " + Arrays.toString(fruits));
        System.out.println("       As list: " + Arrays.asList(fruits));

        // c) Arrays.deepToString
        System.out.println("\n    c) Arrays.deepToString() - for multidimensional arrays:");
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String matrixString = Arrays.deepToString(matrix);

        System.out.println("       " + matrixString);

        // d) Arrays.stream
        System.out.println("\n    d) Arrays.stream() - for creating streams:");
        System.out.println("       Sum of elements using stream: " +
                          Arrays.stream(sampleArray).sum());

        displayBanner('*', 72);
    }

    // Helper method for formatting output
    static void displayBanner(char c, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}
