package PrevWork.SummerCourse;

public class SummerCourse1 {


    public static void main(String[] args) {

        //loops
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int n = 10;
        do{
            System.out.println(n);
            n++;
        } while(n < 10);

        int k = 10;
        while(k < 10) {
            System.out.println(k);
            k++;
        }

        //find sum up to a given number
        int total = sum_numbers(15);
        System.out.println(total);
        int even_total = sum_even_numbers(15);
        System.out.println(even_total);

        //if, else if, else chain
        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

        //String class
        String name = "Umut";
        String surname = "Besikci";
        String nameSurname = name + " " + surname;
        System.out.println(nameSurname);

        //Function definitions
        int a = f_function(5);
        System.out.println("f(5) = " + a);
        int b = g_function(2);
        System.out.println("g(2) = " + b);
        int c = f_function(g_function(5));

        //One dimensional array definitions
        int[] array_1 = new int[5];
        for(int i = 0; i < array_1.length; i++) {
            array_1[i] = i * i;
        }

        //Find sum of values in an integer array
        int total_array = sum_array(array_1);
        System.out.println(total_array);


        int[] array_2 = {1,4,5,2,12,1,5,6,12,3,2,12};

        //Find index of given numbers
        int index_1 = findIndex(6, array_2);
        int index_2 = findIndex(15, array_2);


        int[] array1 = {1,2,3,4,5,9};
        int[] array2 = {2,4,6,7,9,10};

        //Some array statistics
        findSumAndAverage(array_2);
        findMaxAndFreq(array_2);

        //Find intersection of arrays
        int[] intersection = findIntersection(array1, array2);
        printArray(array1);
        printArray(array2);
        printArray(intersection);

        //Selection sort
        selectionSort(array_2);

        //Two dimensional arrays
        int[][] two_dim_array = new int[5][];
        int[][] two_dim_array_2 = new int[5][];
        for(int i = 0; i < two_dim_array.length; i++) {
            two_dim_array[i] = new int[i + 1];
            two_dim_array_2[i] = new int[i + 1];
            for(int j = 0; j < two_dim_array[i].length; j++) {
                two_dim_array[i][j] = (i + 1) * (j + 1);
                two_dim_array_2[i][j] = (i + 2) * (j + 2);
            }
        }
        printArray(two_dim_array);
        int[] result_2 = sumRows(two_dim_array);
        printArray(result_2);
        printArray(two_dim_array_2);
        int[][] result = addMatrix(two_dim_array, two_dim_array_2);
        if(result != null) {
            printArray(result);
        }

    }

    public static void selectionSort(int[] array) {

        // [0 1 2 4 5] / array

        // 2 / i

        // 1 / currentMin
        // 2 / minIndex


        for(int i = 0; i < array.length; i++) {
            int currentMin = array[i];
            int minIndex = i;
            for(int j = i; j < array.length; j++) {
                if(currentMin > array[j]) {
                    currentMin = array[j];
                    minIndex = j;
                }
            }
            array[minIndex] = array[i];
            array[i] = currentMin;
        }
    }

    // f(x) = 3x + 2
    // f(4) = 3*4 + 2 = 14
    // g(y) = y + 2
    // f(g(3)) = 3*(3 + 2) + 2 = 17

    public static int f_function(int x) {
        return 3*x + 2;
    }

    public static int g_function(int x) {
        return x + 2;
    }

    //calculate sum of numbers
    public static int sum_numbers(int limit) {
        int total = 0;
        for(int i = 0; i <= limit; i++) {
            total = i + total;
        }
        return total;
    }

    public static int sum_even_numbers(int limit) {
        int total = 0;
        int i = 0;
        while(i <= limit) {
            if(i % 2 == 0) {
                total += i;
            }
            i++;
        }
        return total;
    }

    public static int sum_array(int[] array) {
        int total = 0;
        for(int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

    public static int findIndex(int a, int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(a == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void findMaxAndFreq(int[] array) {
        int currentMax = array[0];
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > currentMax) {
                currentMax = array[i];
                count = 1;
            }
            else if(array[i] == currentMax) {
                count++;
            }
        }
        System.out.println("count: " + count);
    }

    public static void findSumAndAverage(int[] array) {
        int total = 0;
        double average = 0;
        int i = 0;
        while(i < array.length) {
            total += array[i];
            i++;
        }
        average = (double)total / array.length;
        System.out.println("Total: " + total);
        System.out.println("Avg: " + average);
    }

    public static int[] findIntersection(int[] array_1, int[] array_2) {

        // [1 3 2 7] / array 1

        // [2 5 3 7] / array 2

        // [3 2 7] // result

        // 3 /i
        // 3 /j


        int[] result = new int[0];
        for(int i = 0; i < array_1.length; i++) {

            for(int j = 0; j < array_2.length; j++) {

                if(array_1[i] == array_2[j]) {
                    result = addItem(array_1[i], result);
                }
            }

        }
        return result;
    }

    public static int[] addItem(int a, int[] array) {
        // 351 / a
        // [1 3 51 3] / array

        // [1 3 51 3 351] / result

        int[] result = new int[array.length + 1];

        for(int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        result[array.length] = a;
        return result;
    }

    public static void printArray(int[] array) {

        // [0 3 1] / array

        // 2 / i


        // CONSOLE: 2,5,1
        //          0,3,1

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i < array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("");
    }


    public static void printArray(int[][] array) {

        // [
        //    [2 5 1]
        //    [0 3 1]
        // ]

        // 2 / i
        for(int i = 0; i < array.length; i++) {
            printArray(array[i]);
        }
    }

    //
    public static int[][] addMatrix(int[][] array_1, int[][] array_2) {

        
        // [1 3 2]
        // [2 5 1]
        // [0 4 2] // array 1

        // [2 5 0]
        // [0 2 1]
        // [2 4 1] // array 2

        // [3 8 2]
        // [2 7 0]
        // [0 0 0] // result

        // 1 / i
        // 1 / j

        int[][] result = new int[array_1.length][array_1[0].length];
        for(int i = 0; i < array_1.length; i++) {
            for(int j = 0; j < array_1[i].length; j++) {

                result[i][j] = array_1[i][j] + array_2[i][j];

            }
        }
        return result;
    }

    
    public static int[] sumRows(int[][] array) {

        // [2 5 3]
        // [4 1 5]
        // [9 8 1] / array

        // 10 10 18 / result

        // 3 / i
        // 3 / j
        // 18 / Total

        int[] result = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            int total = 0;
            for(int j = 0; j < array[i].length; j++) {
                total += array[i][j];
            }
            result[i] = total;
        }
        return result;
    }

}
