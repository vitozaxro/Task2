import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    //4.15
    public static int numeralAlfa(int number, int count, int length) {
        return (int) (number / (length / Math.pow(10, count)));
    }

    public static boolean checkNumber(int number) {
        int size = (int) Math.log10(number);

        int length = (int) (Math.pow(10, (int) Math.log10(number)));

        int numeral1;
        int numeral2;

        for (int i = 0; i < size; i++) {
            numeral1 = numeralAlfa(number, i, length);
            number -= numeral1 * length / Math.pow(10, i);
            numeral2 = numeralAlfa(number, i + 1, length);

            if (numeral2 - numeral1 <= 0) {
                return false;
            }
        }

        return true;
    }
    //4.14
    public static boolean findNumber(int number) {
        return (numeralsSum(number) == number);
    }

    public static int numeral1(int number, int count, int length) {
        return (int) (number / (length / Math.pow(10, count)));
    }

    public static int numeralsSum(int number) {
        int size = (int) Math.log10(number);

        int length = (int) (Math.pow(10, (int) Math.log10(number)));

        int sum = 0;
        for (int i = 0; i <= size; i++) {
            sum += Math.pow(numeral1(number, i, length), size + 1);
            number -= numeral1(number, i, length) * length / Math.pow(10, i);
        }

        return sum;
    }
    //4.13
    public static void findTwins(int number, int size) {
        for (int i = size; i <= size * 2; i++) {
            if ((i - number == 2) && checkCondition(number) && checkCondition(i)) {
                System.out.print(number + " - " + i + "\n");
            }
        }
    }

    public static boolean checkCondition(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    //4.12
    public static int arrayElement(int number) {
        return (number + 9);
    }
    //4.11
    public static int numeralsAmount(int number) {
        return (int) (Math.log10(number));
    }
    //4.10
    public static int numeral(int number, int count, int length) {
        return (int) (number / (length / Math.pow(10, count)));
    }

    //4.9
    public static double findSquare1(double x, double y, double z, double t) {
        double square1 = x * y / 2;

        double p = (z + t + (Math.sqrt(x * x + y * y))) / 2;

        double square2 = Math.sqrt(p * (p - Math.sqrt(x * x + y * y)) * (p - z) * (p - t)); // формула Герона.

        return square1 + square2;
    }
    //4.8
    public static void Sum(int[] array, int k, int m) {
        System.out.print("\nsum: " + array[k - 1] + ", " + array[k] + ", " + array[m - 1] + " = " + plus(array, k));
        System.out.println();
    }


    public static int plus(int[] array, int i) {
        return (array[i - 1] + array[i] + array[i + 1]);
    }
    //4.6
    public static boolean checkCondition(double number1, double number2, double number3) {
        return ((number1 % number2 != 0 && number1 % number3 != 0) && (number2 % number1 != 0 && number2 % number3 != 0) && (number3 % number1 != 0 && number3 % number2 != 0));
    }
    //4.5
    public static int maxElement(int[] array, int size, int i) {
        int maxElement = array[i];
        int maxElementIndex = i;

        for (int j = i; j < size; j++) {
            if (array[j] > maxElement) {
                maxElement = array[j];
                maxElementIndex = j;
            }
        }
        return maxElementIndex;
    }
    //4.4
    public static double length(double x1, double y1, double x2, double y2) {
        return (Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }

    public static void findMaxLength(double[] arrayX, double[] arrayY, int size) {
        double maxLength = 0;

        int maxIndex1 = 0;
        int maxIndex2 = 0;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (length(arrayX[i], arrayY[i], arrayX[j], arrayY[j]) > maxLength) {
                    maxLength = length(arrayX[i], arrayY[i], arrayX[j], arrayY[j]);
                    maxIndex1 = i;
                    maxIndex2 = j;
                }
            }
        }

        char l1 = 65;
        char l2 = 65;

        l1 += maxIndex1;
        l2 += maxIndex2;

        System.out.println("\n\nMax length  " + l1 + l2 + ".\n= " + maxLength);
    }
    //4.3
    public static double findSquare(double a) {
        return (Math.sqrt(3) * a * a / 4);
    }
    //4.2
    public static int isDivider1(int a, int b, int c, int d) {
        int maxDivider = 1;

        for (int i = 1; i <= (Math.min(Math.min(a, b), Math.min(c, d))); i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
                maxDivider = i;
            }
        }

        return maxDivider;
    }
    //4.1

    public static boolean isDivider(int a, int b, int number) {
        return (a % number == 0 && b % number == 0);
    }

    public static int findMinDividend(int a, int b, int nod) {
        return (a * b / nod);
    }
    //3.6
    public static void sort1(int[] array, int size) {
        int temp;

        for (int i = 0; i < size - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;

                if (i > 0) {
                    i -= 2;
                }
            }
        }
    }
    //3.5
    public static void swap(int[] array, int begin, int end, int arrayElement) {
        for (int i = end; i > begin; i--) {
            array[i] = array[i - 1];
        }
        array[begin] = arrayElement;
    }
    //3.3
    public static void sort(int[] array, int size) {
        int temp;
        int maxElement;
        int maxElementIndex;
        for (int i = 0; i < size; i++) {
            maxElement = array[i];
            maxElementIndex = i;
            for (int j = i; j < size; j++) {
                if (array[j] > maxElement) {
                    maxElement = array[j];
                    maxElementIndex = j;
                }
            }
            temp = array[i];
            array[i] = array[maxElementIndex];
            array[maxElementIndex] = temp;
        }
    }
    //3.1
    public static void viewArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
//2.16
    public static int[][] createMagicSquareForOddOddSize(int size) {
        int[][] magicSquare = new int[size][size];
        int count1 = size / 4;
        int number1 = 1;
        int number2 = (int) Math.pow(size, 2);
        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare[i].length; j++) {
                if (((i < count1 || i > magicSquare.length - count1 - 1) && (j < count1 || j > magicSquare.length - 1 - count1))
                        || (i >= count1 && i <= magicSquare.length - count1 - 1) && (j >= count1 && j < magicSquare.length - count1)) {
                    magicSquare[i][j] = number1++;
                    number2--;
                } else {
                    magicSquare[i][j] = number2--;
                    number1++;
                }
            }
        }
        return magicSquare;
    }

    public static void removeMagicSquareElementsForOddEvenSize(int[][] matrix2) {
        int k = (matrix2.length - 2) / 4;
        for (int i = 0; i < matrix2.length / 2; i++) {
            if (i != matrix2.length / 2 / 2) {
                for (int j = 0; j < k; j++) {
                    int temp = matrix2[i][j];
                    matrix2[i][j] = matrix2[matrix2.length / 2 + i][j];
                    matrix2[matrix2.length / 2 + i][j] = temp;
                }
            } else {
                for (int j = matrix2.length / 2 / 2; j >= matrix2.length / 2 / 2 - (k - 1); j--) {
                    int temp = matrix2[i][j];
                    matrix2[i][j] = matrix2[matrix2.length - (i + 1)][j];
                    matrix2[matrix2.length - (i + 1)][j] = temp;
                }
            }
        }
        for (int i = 0; i < matrix2.length / 2; i++) {
            for (int j = matrix2.length - 1; j >= matrix2.length - (k - 1); j--) {
                int temp = matrix2[i][j];
                matrix2[i][j] = matrix2[matrix2.length / 2 + i][j];
                matrix2[matrix2.length / 2 + i][j] = temp;
            }
        }
    }

    public static int[][] createMagicSquareForOddEvenSize(int size) {
        int[][] magicSquare = new int[size][size];
        fillMagicSquareForOddEvenSize(0, 0, size / 2, size / 2, createMagicSquareForEvenSize(size, 1), magicSquare);
        fillMagicSquareForOddEvenSize(0, size / 2, size / 2, size, createMagicSquareForEvenSize(size, (int) Math.pow(size, 2) / 2 + 1), magicSquare);
        fillMagicSquareForOddEvenSize(size / 2, 0, size, size / 2, createMagicSquareForEvenSize(size, 1 + (int) Math.pow(size, 2) - (int) Math.pow(size, 2) / 4), magicSquare);
        fillMagicSquareForOddEvenSize(size / 2, size / 2, size, size, createMagicSquareForEvenSize(size, (int) Math.pow(size, 2) / 4 + 1), magicSquare);
        removeMagicSquareElementsForOddEvenSize(magicSquare);
        return magicSquare;
    }

    public static void fillMagicSquareForOddEvenSize(int startI, int startJ, int endI, int endJ, int[][] magicSquare,
                                                     int[][] firstMatrix) {
        int countI = 0;
        int countJ;
        for (int i = startI; i < endI; i++, countI++) {
            countJ = 0;
            for (int j = startJ; j < endJ; j++, countJ++) {
                firstMatrix[i][j] = magicSquare[countI][countJ];
            }
        }
    }
    public static int[][] createMagicSquareForEvenSize(int size, int number) {
        size /= 2;
        int[][] magicSquare = new int[size][size];
        int rightPlaceI = 0;
        int rightPlaceJ = size / 2;
        int previousPlaceI;
        int previousPlaceJ;
        int count = 1;
        magicSquare[0][size / 2] = number++;
        while (count < (int) Math.pow(size, 2)) {
            previousPlaceI = rightPlaceI;
            previousPlaceJ = rightPlaceJ;
            rightPlaceI--;
            rightPlaceJ++;
            if (rightPlaceI < 0) {
                rightPlaceI = size - 1;
            }
            if (rightPlaceJ >= size) {
                rightPlaceJ = 0;
            }
            if (magicSquare[rightPlaceI][rightPlaceJ] != 0) {
                rightPlaceI = ++previousPlaceI;
                rightPlaceJ = previousPlaceJ;
            }
            magicSquare[rightPlaceI][rightPlaceJ] = number++;
            count++;
        }
        return magicSquare;
    }

    public static boolean checkMagicSquare(int[][] matrix, int size) {
        int sum1;
        int sum2;
        int magicConst = size * (size * size + 1) / 2;
        for (int i = 0; i < size; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < size; j++) {
                sum1 += matrix[i][j];
                sum2 += matrix[j][i];
            }
            if (sum1 != magicConst || sum2 != magicConst) {
                return false;
            }
        }

        int sum3 = 0;
        int sum4 = 0;
        for (int i = 0; i < size; i++) {
            sum3 += matrix[i][i];
            sum4 += matrix[i][size - i - 1];
        }
        if (sum3 != magicConst && sum4 != magicConst) {
            return false;
        }

        return true;
    }

    //2.7
    public static double matrixElement(double i, double j, double size) {
        return round((Math.sin((i * i - j * j) / size)), 3);
    }

    public static double round(double number, int numeralsAmount) {
        double a = Math.pow(10, numeralsAmount);
        return Math.round(number * a) / a;
    }
  // 1.6
    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        int temp;

        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;

    }
//1.10
    public static int[] solve(int[] arr) {

        int pivot = (arr.length + 1) / 2;


        for (int i = 1; i < pivot; i++) {
            arr[i] = arr[2 * i];
        }


        TrimHelper start = new TrimHelper();
        TrimHelper cur = start;
        for (int i = 0; i < pivot; i++) {
            cur.value = arr[i];
            cur = cur.next = new TrimHelper();
        }

        arr = new int[pivot];
        cur = start;
        for (int i = 0; i < pivot; i++) {
            arr[i] = cur.value;
            cur = cur.next;
        }

        return arr;
    }

    public static class TrimHelper {
        int value;
        TrimHelper next;
        TrimHelper(){};
    }
//3.7
    private static List<Integer> gimmeIndexes(List<Integer> in, List<Integer> from) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < from.size(); i++) {
            int dex = Collections.binarySearch(in, from.get(i));
            if (dex < 0) result.add(-(dex + 1) + i);
            else result.add(dex + i);
        }
        return result;
    }
//3.8
    private static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }
    //4.16

    private static int findSumOfOddNumbers(int n) {
        int startNumber = (int) Math.pow(10, n - 1);
        int sumOfOddNumbers = 0;

        for (int number = startNumber; number < startNumber * 10; number++) {
            int tmp = number;
            int numberLength = findNumberLength(number);

            while (tmp != 0) {
                if ((tmp % 10) % 2 != 0) {
                    numberLength--;
                }
                tmp /= 10;
            }

            if (numberLength == 0) {
                sumOfOddNumbers += number;
            }
        }
        return sumOfOddNumbers;
    }

    private static int findNumberLength(int number) {
        int numberLength = 0;

        while (number != 0) {
            numberLength++;
            number /= 10;
        }
        return numberLength;
    }

    private static int findEvenDigitsCount(int number) {
        int evenDigitsCount = 0;

        int numberLength = findNumberLength(number);

        for (int i = 1; i <= numberLength; i++) {
            int digit = (int) (number / Math.pow(10, i - 1)) % 10;

            if (digit % 2 == 0) {
                evenDigitsCount++;
            }
        }

        return evenDigitsCount;
    }

    //4.17

    private static int findEventCount(int number) {
        int eventCounter = 0;

        while (number > 0) {
            int digitsSum = findDigitsSum(number);
            number -= digitsSum;
            eventCounter++;
        }

        return eventCounter;
    }

    private static int findDigitsSum(int number) {
        int digitsSum = 0;
        int[] digits = getNumberDigits(number);

        for (int i = 0; i < digits.length; i++) {
            digitsSum += digits[i];
        }

        return digitsSum;
    }

    private static int findNumberLength1(int number) {
        int numberLength = 0;

        while (number != 0) {
            numberLength++;
            number /= 10;
        }
        return numberLength;
    }

    private static int[] getNumberDigits(int number) {
        int numberLength = findNumberLength1(number);
        int[] numberDigits = new int[numberLength];

        for (int i = 1; i <= numberLength; i++) {
            int digit = (int) (number / Math.pow(10, i - 1)) % 10;
            numberDigits[numberLength - i] = digit;
        }

        return numberDigits;
    }

    public static void main(String[] args) {
        //1.1 В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
   /*     Scanner in = new Scanner(System.in);
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int k, sum = 0;
        System.out.println("Enter k");
        k = in.nextInt();
        System.out.println("a=");
        for (int i = 0; i < 8; i++) {
            if (a[i] % k == 0)
                sum = sum + a[i];
            System.out.print(a[i] + " ");
        }
        System.out.println("sum= " + sum);


    */

        //1.2 Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
        //числом. Подсчитать количество замен.
/*
        double array[] = {1, 2, 3, 4, 5, 6, 7, 8};
        double z = 4;
        int countChange = 0;
        if (array.length == 0)
            throw new IllegalArgumentException("length is Null");
        for (double value : array) {
            if (value < z) {
                value = z;
                countChange++;
            }
        }
        System.out.println(countChange);



 */
        //1.3 Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
        //положительных и нулевых элементов.
        /*
        int[] a = {-10, 0, 5, 0, 2, 8, 3, -1};
        int counter1 = 0, counter2 = 0, counter3 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 && a[i] != 0) {
                counter1 = counter1 + 1;
            } else if (a[i] < 0) {
                counter2 = counter2 + 1;
            } else {
                counter3 = counter3 + 1;
            }

        }
        System.out.println(counter1+" "+counter2+" "+counter3);

         */
//1.4 Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы
        /*
        double[] array = {4, 1.6, 1, 0, -1, 5, 9, 7, 8, 2};

        System.out.println("Array=" + Arrays.toString(array));

        double min;
        int minN;
        minN = 0;
        min = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < min) {
                min = array[i];
                minN = i;
            }
        }
        double max;
        int maxN;
        maxN = 0;
        max = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > max) {
                max = array[i];
                maxN = i;
            }
        }
        double revers;
        revers = array[maxN];
        array[maxN] = array[minN];
        array[minN] = revers;
        System.out.println("new Array=" + Arrays.toString(array));

 */
//1.5 Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

       /* int a[]={-21,2,23,-434,57,56,7,23,13,10};
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] >= i)
            {
                System.out.println(a[i]+" ");
            }
        }

        */

//1.6 Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.
       /* double arr[] = {-21, 2, 23, -434, 57, 56, 7, 23, 13, 10};
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(i)) {
                sum += arr[i];
            }
        }
        System.out.println("sum= " + sum);

        */
        //1.7 Даны действительные числа n a ,a , ,a 1 2  . Найти max
/*
        int array[]={1,421,2,34,1,2,45,6};

        int maxSum = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length / 2; i++) {
            if ((array[i] + array[array.length - i - 1]) > maxSum) {
                maxSum = array[i] + array[array.length - i - 1];
            }

        }
        System.out.println(maxSum);


 */

        //1.8 Дана последовательность целых чисел n a ,a , ,a 1 2  . Образовать новую последовательность, выбросив из
        //исходной те члены, которые равны min(

        /*
        int array[]={1,421,2,34,1,2,45,6};

        if (array.length == 0) {
            throw new IllegalArgumentException("array is Null");
        }

        int minCount = 0;
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];

            }
        }

        for (int value : array) {
            if (value == min) {
                minCount++;
            }
        }

        int[] result = new int[array.length - minCount];

        int indexResult = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                result[indexResult] = array[i];
                indexResult++;
            }
        }
        for (int i = 0; i <result.length ; i++) {
            System.out.print(result[i]+" ");
        }
*/

        // 1.9 В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
        //чисел несколько, то определить наименьшее из них.
     /*   int array[]={1,421,2,34,1,2,45,6};

        int popular[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    popular[i]++;
                }
            }
        }

        int valResult = array[0];
        int popResult = popular[0];
        for (int i = 0; i < popular.length; i++) {
            if (popular[i] > popResult) {
                popResult = popular[i];
                valResult = array[i];
            }
            if ((popResult == popular[i]) && (array[i] < valResult)) {
                valResult = array[i];
            }
        }
        System.out.println(valResult);

      */
//1.10 Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать
      //  System.out.println(Arrays.toString(solve(new int[]{1,421,2,34,1,2,45,6})));
//2.1 Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
    /*   
     int[][] Arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matrix High: ");
        int m = scanner.nextInt();
        System.out.println("Matrix Row: ");
        int n = scanner.nextInt();
        Arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println((i + 1) + "Matrix high: ");
            for (int j = 0; j < n; j++) {
                Arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println();

        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j += 2) {
                if (Arr[0][j] > Arr[m - 1][j]) {
                    System.out.print(Arr[i][j] + "\t");
                }
            }
            System.out.println();
        }*/
    //2.2  Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
      /*  int[][] Arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matrix High: ");
        int n = scanner.nextInt();
        Arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "Matrix high: ");
            for (int j = 0; j < n; j++) {
                Arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            if(i==j){
                System.out.print(Arr[i][j] + "\t");
            }

            }
            }

            */

        //2.3
        /*
        Scanner in = new Scanner(System.in);

        System.out.print("rows, cols: ");
        int rows = in.nextInt();
        int cols = in.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 21) - 10;
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println();
        }

        System.out.println("cols");
        int k = in.nextInt() - 1;

        for (int j = 0; j < cols; j++) {
            System.out.print(matrix[k][j] + "\t\t");
        }

        System.out.println("\nrows");
        int p = in.nextInt() - 1;

        for (int i = 0; i < rows; i++) {
            System.out.println(matrix[i][p]);
        }

         */
    //2.4 Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
        /*
        Scanner in = new Scanner(System.in);

        System.out.print("size: ");
        int size = in.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;
                } else {
                    matrix[i][j] = size - j;
                }
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println();
        }

         */

        //2.5
        /*
          Scanner in = new Scanner(System.in);

        System.out.print("size: ");
        int size = in.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j < size - i) {
                    matrix[i][j] = i + 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println();
        }
         */

        //2.6
        /*
          Scanner in = new Scanner(System.in);

        System.out.print("size: ");
        int size = in.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = 1;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i < size / 2) {
                    if (j < i || j > size - i - 1) {
                        matrix[i][j] = 0;
                    }
                } else {
                    if (j < size - i - 1 || j > i) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println();
        }
         */
        //2.7 Сформировать квадратную матрицу порядка N по правилу:
        /*
        Scanner in = new Scanner(System.in);

        System.out.print("size: ");
        int size = in.nextInt();

        double[][] matrix = new double[size][size];

        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = matrixElement(i, j, size);
                if (matrix[i][j] > 0) {
                    count++;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println();
        }

        System.out.println("\nNumber of Positive element is: " + count);

         */
        //2.8 В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
        //на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
        //пользователь с клавиатуры.
        /*
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("size: ");
        int size = in.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(31) - 15;
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println();
        }

        System.out.print("\nВведите номера двух столбцов для перестановки: ");
        int n1 = in.nextInt() - 1;
        int n2 = in.nextInt() - 1;
        int temp;

        for (int i = 0; i < size; i++) {
            temp = matrix[i][n1];
            matrix[i][n1] = matrix[i][n2];
            matrix[i][n2] = temp;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println();
        }

         */
        //2.9  Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
        //      столбец содержит максимальную сумму
        /*
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("size: ");
        int size = in.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(16);
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println();
        }

        int sum;
        int maxSum = 0;
        int maxIndex = 0;
        for (int j = 0; j < size; j++) {
            sum = 0;
            for (int i = 0; i < size; i++) {
                sum += matrix[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxIndex = j + 1;
            }
        }

        System.out.println("\nRow Index " + maxIndex + " Max sum = " + maxSum);


         */
       //2.10

        /*
        int[][] Arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matrix High: ");
        int n = scanner.nextInt();
        Arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "Matrix high: ");
            for (int j = 0; j < n; j++) {
                Arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j&&Arr[i][j]>0){
                    System.out.print(Arr[i][j] + "\t");
                }

            }
        }

*/
        //2.11  Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
        //   которых число 5 встречается три и более раз.
        /*
        Random random = new Random();

        int[][] matrix = new int[10][20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                matrix[i][j] = random.nextInt(16);
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println();
        }

        System.out.println();

        int count;
        boolean flag = false;

        for (int i = 0; i < 10; i++) {
            count = 0;
            for (int j = 0; j < 20; j++) {
                if (matrix[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                flag = true;
                System.out.print((i + 1) + "\t");
            }
        }
        if (flag) {
            System.out.println(" - номера строк, в которых число 5 встречается три и более раз.");
        } else {
            System.out.println("Нет cтрок, в которых число 5 встречается три и более раз.");
        }

         */
        //2.12 Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
        /*
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("size: ");
        int size = in.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(29) + 1;
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.println();

        int temp;
        for (int count = 0; count < size - 1; count++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size - 1; j++) {
                    if (matrix[i][j] > matrix[i][j + 1]) {
                        temp = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Сортировка строк матрицы по возрастанию значений элементов: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int count = 0; count < size - 1; count++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size - 1; j++) {
                    if (matrix[i][j] < matrix[i][j + 1]) {
                        temp = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Сортировка строк матрицы по убыванию значений элементов: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.println();
         */
        //2.13 Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
        /*
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("size: ");
        int size = in.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(29) + 1;
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.println();

        int temp;
        for (int count = 0; count < size - 1; count++) {
            for (int j = 0; j < size; j++) {
                for (int i = 0; i < size - 1; i++) {
                    if (matrix[i][j] > matrix[i + 1][j]) {
                        temp = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = temp;
                    }
                }
            }
        }

        System.out.println("Сортировка столбцов матрицы по возрастанию значений элементов: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int count = 0; count < size - 1; count++) {
            for (int j = 0; j < size; j++) {
                for (int i = 0; i < size - 1; i++) {
                    if (matrix[i][j] < matrix[i + 1][j]) {
                        temp = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = temp;
                    }
                }
            }
        }

        System.out.println("Сортировка столбцов матрицы по убыванию значений элементов: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.println();

         */

        //2.14 Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
        //единиц равно номеру столбца.
/*
        int [][] matrix;
        Random random =new Random();
        final int N =abs(random.nextInt()%10)+1;
        final int M = abs(random.nextInt()%10)+1;
        matrix = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (i <= j) {
                    matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
 */
        //2.15 Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
        /*
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("size rows, cols: ");
        int rows = in.nextInt();
        int cols = in.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(21) - 10;
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println();
        }

        int maxElement = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }
        System.out.println("\nMax element = " + maxElement);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = maxElement;
                }
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println();
        }

         */
        //2.16 Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
        //   ..., n ^ 2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
        //собой. Построить такой квадрат. Пример магического квадрата порядка
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Input size:");
        int size = in.nextInt();

        int[][] magicSquare = new int[size][size];
        if (size % 2 !=0 ) {
            magicSquare = createMagicSquareForEvenSize(size * 2, 1);
        } else {
            if (size % 4 != 0) {
                magicSquare = createMagicSquareForOddEvenSize(size);
            } else {
                magicSquare = createMagicSquareForOddOddSize(size);
            }
        }

        System.out.println("Is magic square: " + checkMagicSquare(magicSquare, size));
        for (int[] i : magicSquare) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }

         */
      //3.1  Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
        //      один  массив,  включив  второй  массив  между  k-м  и  (k+1)  -  м  элементами  первого,  при  этом  не  используя
        //      дополнительный массив.
        /*
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Размер первого и второго массива: ");
        int size1 = in.nextInt();
        int size2 = in.nextInt();
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];

        for (int i = 0; i < Math.max(size1, size2); i++) {
            if (i < size1) {
                array1[i] = random.nextInt(21) - 10;
            }
            if (i < size2) {
                array2[i] = random.nextInt(21) - 10;
            }
        }

        System.out.print("Первый массив: ");
        viewArray(array1, size1);
        System.out.print("Второй массив: ");
        viewArray(array2, size2);

        System.out.print("Введите k, где k < " + size1 + " и k > 0" + " = ");
        int k = in.nextInt();

        int size = size1 + size2;
        int[] array = new int[size];

        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < size; i++) {
            if (i < k || i2 >= size2) {
                array[i] = array1[i1];
                i1++;
            } else {
                if (i == k || i2 < size2) {
                    array[i] = array2[i2];
                    i2++;
                }
            }
        }
        viewArray(array, size);

         */
        //3.2 Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Образовать из них новую последовательность
        //   чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
      /*  Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("size1, size2: ");
        int size1 = in.nextInt();
        int size2 = in.nextInt();

        int[] array1 = new int[size1];
        int[] array2 = new int[size2];

        array1[0] = random.nextInt(11);
        array2[0] = random.nextInt(11);

        for (int i = 1; i < Math.max(size1, size2); i++) {
            if (i < size1) {
                array1[i] = random.nextInt(11) + array1[i - 1];
            }
            if (i < size2) {
                array2[i] = random.nextInt(11) + array2[i - 1];
            }
        }

        System.out.print("Первая последовательность: ");
        viewArray(array1, size1);

        System.out.print("Вторая последовательность: ");
        viewArray(array2, size2);

        int size = size1 + size2;
        int[] array = new int[size];

        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < size; i++) {
            if (i1 < size1 && i2 < size2) {
                if (array1[i1] > array2[i2]) {
                    array[i] = array2[i2];
                    i2++;
                } else {
                    array[i] = array1[i1];
                    i1++;
                }
            } else {
                if (i1 < size1 && i2 >= size2) {
                    array[i] = array1[i1];
                    i1++;
                } else {
                    if (i1 >= size1 && i2 < size2) {
                        array[i] = array2[i2];
                        i2++;
                    }
                }
            }
        }

        System.out.println();
        viewArray(array, size);

       */
        //3.3 Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an. Требуется переставить элементы так,
        //чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
        //элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
        //повторяется. Написать алгоритм сортировки выбором.
        /*
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("size: ");
        int size = in.nextInt();

        int[] array = new int[size];

        array[0] = random.nextInt(11);

        for (int i = 1; i < size; i++) {
            array[i] = random.nextInt(11) + array[i - 1];
        }

        int temp;
        for (int count = 0; count < size - 1; count++) {
            for (int i = 0; i < size - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }

        sort(array, size);

        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }

         */

        //3.4 Сортировка  обменами.  Дана  последовательность  чисел a1 <= a2 <= ... <= an. Требуется  переставить  числа  в
        //       порядке  убывания.  Для  этого  сравниваются  два  соседних  числа a(i) и a(i + 1). Если a(i) > a(i + 1), то делается
        //       перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
        //       Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
/*
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("size: ");
        int size = in.nextInt();

        int[] array = new int[size];

        array[0] = random.nextInt(11);

        System.out.print(array[0] + "\t");

        for (int i = 1; i < size; i++) {
            array[i] = random.nextInt(11) + array[i - 1];
            System.out.print(array[i] + "\t");
        }

        int temp;
        int count = 0;
        boolean flag = true;

        while (flag) {
            flag = false;
            for (int i = 0; i < size - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                    flag = true;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\nКоличество перестановок: " + count);


 */
        //3.5 Сортировка вставками. Дана последовательность чисел a1, a2, ..., an. Требуется переставить числа в порядке возрастания. Делается это
        //      следующим образом. Пусть a1, a2, ..., ai - упорядоченная последовательность, т.е. a1 <= a2 <= ... <= an. Берется следующее число a(i + 1)
        //      и вставляется в последовательность так, чтобы новая последовательность была тоже возрастающей. Процесс производится до тех пор, пока все
        //      элементы от i + 1 до n не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью
        //      двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
      /*
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("size: ");
        int size = in.nextInt();

        int[] array = new int[size];

        System.out.println("Массив: ");
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(21) - 10;
            System.out.print(array[i] + "\t");
        }

        int index;

        for (int i = 1; i < size; i++) {
            index = binarySearch(array, array[i], i - 1);
            swap(array, index, i, array[i]);
        }

        System.out.println("\nОтсортированный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static int binarySearch(int[] array, int key, int end) {
        int begin = 0;
        int middle = 0;

        while (begin <= end) {
            middle = (begin + end) / 2;

            if (key > array[middle]) {
                begin = middle + 1;
            } else {
                if (key < array[middle]) {
                    end = middle - 1;
                } else {
                    if (key == array[middle]) {
                        return middle + 1;
                    }
                }
            }
        }

        return (key >= array[middle] ? middle + 1 : middle);



       */
        //3.6 ортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. Делается это
        //   следующим образом: сравниваются два соседних элемента ai и a(i + 1). Если ai <= a(i + 1), то продвигаются на один
        //   элемент вперед. Если ai > a(i + 1), то производится перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.
      /*
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("size: ");
        int size = in.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(21) - 10;
            System.out.print(array[i] + "\t");
        }

        sort1(array, size);
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();

       */

//3.7 Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
//   Требуется указать те места, на которые нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm в первую последовательность
//   так, чтобы новая последовательность оставалась возрастающей.
           /*
                List<Integer> in = new ArrayList<Integer>() {
                    {add(-10); add(2); add(2); add(5); add(10); add(88);}
                };

                List<Integer> from = new ArrayList<Integer>() {
                    {add(-1); add(3); add(4); add(7); add(99);}
                };

                List<Integer> indexes = gimmeIndexes(in, from);
                System.out.println("Enter " + indexes);

                for (int i = 0; i < indexes.size(); i++)  in.add(indexes.get(i), from.get(i));
                System.out.println("After "+ in);

            */
//3.8 Даны дроби p(1) / q(1), p(2) / q(2), ..., p(n) / q(n) (p(i), q(i) - натуральные). Составить программу, которая
//   приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
    /*
        List<Fraction> fs = new ArrayList<>(Arrays.asList(new Fraction(9, 12), new Fraction(1, 2),
                new Fraction(3, 4), new Fraction(6, 7), new Fraction(1, 5), new Fraction(7, 8),
                new Fraction(9, 10), new Fraction(1, 2), new Fraction(5, 12), new Fraction(3, 8)));


        long start = System.currentTimeMillis();

        long lcd = fs.stream().mapToLong(f -> f.d).reduce(1, (d1, d2) -> d1 * d2 / gcd(d1, d2));
        fs.stream().map(f -> f.setLCD(lcd)).sorted(Fraction::sort).forEach(System.out::println);

    }

    static long gcd(long a, long b) {
        long tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    static class Fraction {
        long n, d; // numerator, denominator

        public Fraction(long n, long d) {
            this.n = n;
            this.d = d;
        }

        public Fraction setLCD(long lcd) {
            n *= (lcd / d);
            d = lcd;
            return this;
        }

        @Override
        public String toString() {
            return String.format("%d/%d", n, d);
        }

        public static int sort(Fraction f1, Fraction f2) {
            return Long.compare(f1.n, f2.n);
        }
     */
        //4.1 Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
        //   натуральных чисел: ( НОК(A, B) = (A * B) / НОД(A, B) ) .
        /*
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number: ");

        int a = in.nextInt();
        int b = in.nextInt();

        int nod = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (isDivider(a, b, i)) {
                nod = i;
            }
        }

        int nok = findMinDividend(a, b, nod);

        System.out.println("Number: " + a + ", " + b + "\nНОД = " + nod + "\nНОК = " + nok);
        */
        //4.2 Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
        /*
        Scanner in = new Scanner(System.in);

        System.out.print("Введите четыре числа: ");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int maxDivider = isDivider1(a, b, c, d);

        System.out.println("Числа: " + a + ", " + b + ", " + c + ", " + d + "\nНОД = " + maxDivider);\
        
         */

        //4.3 Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        double a = sc.nextDouble();

        double square = findSquare(a) * 6;

        System.out.println("\nSquare = " + square);

         */

        //4.4  На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
        //   из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.


        /*
        Scanner in = new Scanner(System.in);

        System.out.print("Number of points: ");
        int size = in.nextInt();

        double[] arrayX = new double[size];
        double[] arrayY = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.print("enter x" + (i + 1) + " enter y" + (i + 1) + ": ");
            arrayX[i] = in.nextDouble();
            arrayY[i] = in.nextDouble();
        }

        System.out.println("\nPoints: ");

        char l = 'A';
        for (int i = 0; i < size; i++) {
            System.out.print(l + "(" + arrayX[i] + "; " + arrayY[i] + ")\t\t");
            l++;
        }

        findMaxLength(arrayX, arrayY, size);

         */

         //4.5 Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
        //   которое меньше максимального элемента массива, но больше всех других элементов)
     /*   Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Размер массива: ");
        int size = in.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(21) - 10;
            System.out.print(array[i] + "\t");
        }

        int maxElementIndex = maxElement(array, size, 0);

        int temp;

        temp = array[0];
        array[0] = array[maxElementIndex];
        array[maxElementIndex] = temp;

        System.out.println("\n\nMaxElement = " + array[0]);

        maxElementIndex = maxElement(array, size, 1);

        System.out.println("\nElement before MaxElement = " + array[maxElementIndex]);

      */
        //4.6Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
        /*
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 3 Number: ");

        double number1 = in.nextDouble();
        double number2 = in.nextDouble();
        double number3 = in.nextDouble();

        System.out.print(checkCondition(number1, number2, number3));


         */
        //4.7 Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
        /*
        int sum = 0;
        int fact = 1;

        for (int i = 1; i < 10; i++) {
            fact *= i;
            if (i % 2 != 0) {
                sum += fact;
            }
        }
        System.out.println(sum);
        //4.8 Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
      //Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Array size: ");
        int size = in.nextInt();

        int[] array = new int[size];

        System.out.println("Array: ");
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(21) - 10;
            System.out.print(array[i] + "\t");
        }

        System.out.print("\nEnter k, m: ");
        int k = in.nextInt();
        int m = in.nextInt();

        Sum(array, k, m);


         */
        //4.9 Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
    /*    Scanner sc = new Scanner(System.in);

        System.out.print("X, Y, Z, T: ");

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double t = sc.nextDouble();

        System.out.println("\nS = " + findSquare1(x, y, z, t));

     */
        //4.10 Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
       /*
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println("\n" + number);

        int length = 1;
        int size = 0;

        while (length <= number) {
            length *= 10;
            size++;
        }

        length /= 10;

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = numeral(number, i, length);
            number -= array[i] * length / Math.pow(10, i);

            System.out.print(array[i] + "\t");
        }

        System.out.println();

        */
        //4.11 Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.println("number: " + number1 + "\t" + number2);

        if (numeralsAmount(number1) > numeralsAmount(number2)) {
            System.out.println("more digits have: " + number1);
        } else {
            if (numeralsAmount(number1) < numeralsAmount(number2)) {
                System.out.println("more digits have: " + number2);
            } else {
                System.out.println("number of digits same.");
            }
        }



         */
        //4.12 Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
   /*
        Scanner in = new Scanner(System.in);

        System.out.print("K, N: ");

        int k = in.nextInt();
        int n = in.nextInt();

        int size = (n - k) / 9 + 1;

        int[] array = new int[size];

        array[0] = k;
        System.out.print(array[0] + "\t");

        for (int i = 1; i < size; i++) {
            array[i] = arrayElement(array[i - 1]);
            System.out.print(array[i] + "\t");
        }

    */
        //4.13 Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
     /*
        Scanner sc = new Scanner(System.in);

        System.out.print("Array size: ");
        int size = sc.nextInt();

        System.out.println("Number: ");
        for (int i = size; i <= size * 2; i++) {
            System.out.print(i + "\t");
        }

        System.out.println("\n\nTwins: ");
        for (int i = size; i <= size * 2; i++) {
            findTwins(i, size);
        }


      */
        //4.14 Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
/*
       Scanner sc = new Scanner(System.in);

        System.out.print("k: ");
        int k = sc.nextInt();

        System.out.println("Числа Армстронга: ");
        for (int i = 1; i < k; i++) {
            if (findNumber(i)) {
                System.out.print(i + "\n");
            }
        }

 */
        //4.15 Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
      /*  Scanner in = new Scanner(System.in);

        System.out.print("n: ");
        int n = in.nextInt();

        for (int i = (int) Math.pow(10, n); i < (int) Math.pow(10, n + 1); i++) {
            if (checkNumber(i)) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();

       */
        //4.16 Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

        /*
        int sum = findSumOfOddNumbers(7);
        System.out.println("sum = " + sum);

        int evenDigitsCount = findEvenDigitsCount(sum);

        System.out.println("sum of 4 numbers = " + evenDigitsCount);



         */
        //4.17 Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

      //   System.out.println(findEventCount(123));

            }


        }