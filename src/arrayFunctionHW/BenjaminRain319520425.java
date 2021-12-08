package homeworkHW2;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class BenjaminRain319520425 {

    public static void arraySum(int[] array1, int num) {

        int sum = 0;
        for (int i = 0; i <= 7; i++) {
            sum = array1[i] + array1[i + 1];
            array1[i + 2] = sum;
        }
    }

    public static void arrayChar(char[] array2, char ch) {


        boolean capitalize = false;

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] >= 'A' && array2[i] <= 'Z') {
                capitalize = !capitalize; // [TRUE]
            }
            if (capitalize) { //if its true
                array2[i] = Character.toUpperCase(array2[i]);
            }
        }
    }

    public static void arrayNum(int[] arr1, int[] arr2, int[] arr3) {

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr3[i] += arr1[i];
                }
            }
        }
    }

    public static void arrayAsterisk(int[] arr4) {

        int maxValue = 0;
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] > maxValue) {
                maxValue = arr4[i];
            }
        }

        for (int i = 0; i < maxValue; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (arr4[j] >= maxValue - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void randMatrix(int[][] firstMatrix, int maxCols, int maxRows) {

        int value = 1;
        for (int i = (maxCols - 1); i >= 0; i--) { // check cols from max col-1 all the way to 0.
            if ((maxCols % 2 == 0 && i % 2 != 0) || (maxCols % 2 != 0 && i % 2 == 0)) { //if maxCols is even & i isn't or vice versa
                for (int j = 0; j < maxRows; j++) { //as long as maxRows  is bigger than j
                    firstMatrix[j][i] = value++;
                }
            } else {
                for (int j = (maxRows - 1); j >= 0; j--) { //random rows num minus 1, check rows essentially.
                    firstMatrix[j][i] = value++;
                }
            }
        }
    }

    public static int sumOfNumbers(int numSummary) {

        int digit = 0, newNumber = 0;

        while (numSummary != 0) {
            digit = numSummary % 10;
            numSummary /= 10;
            newNumber += digit;
        }

        return newNumber;
    }

    /*
    public static void arrayValuesFunc(int[] arrayValues, int[] sumOfArrDigits) {

        int digit = 0;

        for (int i = 0; i < arrayValues.length; i++) {
            while (arrayValues[i] != 0) {
                digit = arrayValues[i] % 10;
                arrayValues[i] /= 10;
                sumOfArrDigits[i] += digit;
            }
        }
    }

     */

    public static boolean evenSumMatrix(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] sumOfRows = new int[matrix.length];
        int[] sumOfCols = new int[matrix[0].length];

        for (int i = 0; i < rows; i++) {
            int rowsSum = 0;
            int colsSum = 0;
            for (int j = 0; j < cols; j++) {
                rowsSum += matrix[i][j];
                colsSum += matrix[j][i];
                sumOfRows[j] += rowsSum;
                sumOfCols[j] += colsSum;
            }
        }

        boolean evenMatrix = true;
        for (int i = 0; i < matrix.length; i++) {
            evenMatrix &= sumOfRows[i] == sumOfCols[i];
        }

        return evenMatrix;

    }

    public static boolean mirrored(int[][] mirrorMatrix, int rows) {

        for (int i = 0; i < mirrorMatrix.length; i++) {
            for (int j = 0; j < mirrorMatrix.length; j++) {
                System.out.print(mirrorMatrix[i][j] + " ");
            }
            System.out.println();
        }

        boolean isMirrored = true;
        for (int i = 0; i < mirrorMatrix.length; i++) {
            for (int j = 0; j < mirrorMatrix.length; j++) {
                isMirrored &= mirrorMatrix[i][j] == mirrorMatrix[i][mirrorMatrix.length - 1 - j];
            }
        }
        return isMirrored;
    }


    public static int[] addArray(int thirdNum, int thirdLength, int[] thirdArray) {

        for (int i = 0; i < thirdLength; i++) {
            thirdArray[thirdLength-1-i] = thirdNum % 10;
            thirdNum /= 10;
        }

        return thirdArray;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {

            System.out.println("Choose one of the following exercises:");

            System.out.println("Chapter 5, Arrays:");
            System.out.println("1 - Exercise #3");
            System.out.println("2 - Exercise #6");
            System.out.println("3 - Exercise #7");
            System.out.println("4 - Exercise #11");
            System.out.println("5 - Exercise #13");

            System.out.println("Chapter 6, Functions:");
            System.out.println("6 - Exercise #4");
            System.out.println("7 - Exercise #6");
            System.out.println("8 - Exercise #7");
            System.out.println("9 - Exercise #8");

            System.out.println("Type 11 to Exit.");

            System.out.println("Please enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:

                    int[] array1 = new int[10];
                    int num = array1.length;

                    System.out.println("Please enter your first two numbers: ");
                    for (int i = 0; i < 2; i++) {
                        array1[i] = input.nextInt();
                        System.out.println("Number is: " + array1[i]);
                    }

                    arraySum(array1, num);

                    for (int i = 0; i < array1.length; i++) {
                        System.out.printf("%d ", array1[i]);
                    }

                    break;

                case 2:

                    char[] array2 = new char[10];
                    char ch = (char) array2.length;

                    System.out.print("Please enter 8 lower case chars and 2 upper case chars, with spaces in between (Ex - a b c D e f G h j k): ");
                    for (int i = 0; i < array2.length; i++) {
                        array2[i] = input.next().charAt(0);
                    }

                    arrayChar(array2, ch);

                    for (int j = 0; j < array2.length; j++) {
                        System.out.print(array2[j]);
                    }

                    break;

                case 3:

                    int[] arr1 = new int[5];
                    int[] arr2 = new int[5];
                    int[] arr3 = new int[5];

                    int arrayCount = 0;
                    //int num2 = arr1.length;

                    System.out.println("Please enter 5 numbers in numerical order (Ex - 1 2 3 4 5 ): ");
                    for (int i = 0; i < arr1.length; i++) {
                        arr1[i] = input.nextInt();
                    }

                    System.out.println("Please enter 5 different numbers (Ex - 2 3 4 5 6): ");
                    for (int i = 0; i < arr2.length; i++) {
                        arr2[i] = input.nextInt();
                    }

                    arrayNum(arr1, arr2, arr3);

                    for (int j = 0; j < arr3.length; j++) {
                        if (arr3[j] != 0) {
                            arrayCount++;
                        }
                        System.out.print(arr3[j] + ", ");
                    }
                    System.out.printf("\nYou have %d of the same number.", arrayCount);

                    break;


                case 4:

                    int[] arr4 = new int[4];
                    int arr4Length = arr4.length;

                    System.out.println("Enter 4 numbers: ");
                    for (int i = 0; i < arr4.length; i++) {
                        arr4[i] = input.nextInt();
                        while (arr4[i] < 1 && arr4[i] > 9) {
                            System.out.print("Needs a number between 0 and 9: ");
                            arr4[i] = input.nextInt();
                        }
                    }

                    arrayAsterisk(arr4);

                    System.out.print("-------\n");
                    for (int i = 0; i < arr4.length; i++) {
                        System.out.print(arr4[i] + " ");
                    }

                    break;

                case 5:

                    final int RANGE = 4;
                    int fixedNum = 5;
                    Random rand = new Random();
                    int maxRows = (int) ((Math.random() * RANGE) + fixedNum);
                    int maxCols = (int) ((Math.random() * RANGE) + fixedNum);
                    int[][] firstMatrix = new int[maxRows][maxCols];

                    randMatrix(firstMatrix, maxCols, maxRows);

                    for (int i = 0; i < maxRows; i++) {
                        for (int j = 0; j < maxCols; j++) {
                            System.out.printf("%4d", firstMatrix[i][j]);
                        }
                        System.out.println();
                    }

                    break;

                case 6:

                    int numSummary = 0;
                    int sortingDigit = 0;
                    int counter = 0;

                    System.out.println("Please enter your number: ");
                    numSummary = input.nextInt();
                    System.out.println("Your new number is: " + sumOfNumbers(numSummary));

                    int arrayLength = 0;
                    System.out.println("Please enter your array length: ");
                    arrayLength = input.nextInt();
                    System.out.println("Please enter the array values: ");
                    int[] arrayValues = new int[arrayLength];
                    int[] sumOfArrDigits = new int[arrayLength];
                    for (int i = 0; i < arrayLength; i++) {
                        arrayValues[i] = input.nextInt();
                    }

                    System.out.println("Please enter your summary digit: ");
                    sortingDigit = input.nextInt();
                    for (int i = 0; i < arrayValues.length; i++) {
                        int summary = sumOfNumbers(arrayValues[i]);
                        if (summary == sortingDigit) {
                            counter++;
                        }
                    }

                    System.out.println("Your digit repeats: " + counter + " times as a sum in the array.");

                    /*
                    System.out.println("Please enter your summary digit: ");
                    sortingDigit = input.nextInt();

                    arrayValuesFunc(arrayValues, sumOfArrDigits);

                    for (int i = 0; i < arrayLength; i++) {
                        if (sumOfArrDigits[i] == sortingDigit) {
                            counter++;
                        }
                    }
                    System.out.println("Your digit repeats: " + counter + " times as a sum in the array.");
                    */

                    break;

                case 7:

                    // int[][] matrix = {{2, 1, 6}, {6, 7, 3}, {0, 8, 0}};
                    System.out.println("Please enter the array length: ");
                    int matrixLength = input.nextInt();
                    int[][] matrix = new int[matrixLength][matrixLength];
                    System.out.println("Please enter the Matrix Values: ");
                    for (int i = 0; i < matrixLength; i++) {
                        System.out.printf("Enter row number %d values: ", (i+1));
                        for (int j = 0; j < matrixLength; j++) {
                            matrix[i][j] = input.nextInt();
                        }
                    }

                    System.out.println("\n" + evenSumMatrix(matrix));

                    break;

                case 8:

                    System.out.println("Please enter number of rows in the matrix: ");
                    int rows = input.nextInt();

                    System.out.println("Please enter number of columns in the matrix: ");
                    int cols = input.nextInt();

                    int[][] mirrorMatrix = new int[rows][cols];

                    for (int i = 0; i < rows; i++) {
                        System.out.println("Enter the numbers in row: " + i);
                        for (int j = 0; j < cols; j++) {
                            mirrorMatrix[i][j] = input.nextInt();
                        }
                        System.out.println();
                    }

                    System.out.println(mirrored(mirrorMatrix, rows));

                    break;

                case 9:

                   System.out.println("Please enter your first number: ");
                   int firstNum = input.nextInt();
                   System.out.println("Please enter your second number: ");
                   int secondNum = input.nextInt();

                    int firstHold = firstNum, firstLength = 0;
                    int secondHold = secondNum, secondLength = 0;
                    int thirdNum = (firstNum+secondNum), thirdLength = 0;

                    while (firstHold > 0) {
                        firstHold /= 10;
                        firstLength++;
                    }
                    while (secondHold > 0) {
                        secondHold /= 10;
                        secondLength++;
                    }

                    if (firstLength > secondLength) {
                        thirdLength = firstLength+1;
                    }
                    else {
                        thirdLength = secondLength+1;
                    }

                    int[] firstArray = new int[firstLength];
                    int[] secondArray = new int[secondLength];
                    int[] thirdArray = new int[thirdLength];

                    addArray(thirdNum, thirdLength, thirdArray);

                    for (int i = 0; i < thirdLength; i++) {
                        System.out.print(thirdArray[i] + " ");
                    }

                    break;

                case 11:

                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option, please choose again.");
            }
            System.out.println("\nDo you want to go back to the main menu? (y/n)");
            char resume = input.next().charAt(0);
            if (resume == 'y' || resume == 'Y') {
            } else {
                System.out.println("Exiting program...");
                System.exit(0);
            }

        } while (choice != 11);
        System.out.println("Exiting program...Thank you!");
        input.close();

    }
}
