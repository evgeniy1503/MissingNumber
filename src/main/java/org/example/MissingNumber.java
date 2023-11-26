package org.example;


/**
 * MissingNumber.
 *
 * @author Evgeniy_Prohorov
 */
public class MissingNumber {

    /**
     * Метод ищет число не достающее в последовательности,
     * если массив пустой или состоит из одного элемента, кидается RuntimeException
     */
    public static int findMissingNumber(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            throw new RuntimeException("Array incorrect");
        }

        int minNumber = arr[0];
        int maxNumber = arr[0];
        for (int j : arr) {
            if (minNumber > j) {
                minNumber = j;
            }
            if (maxNumber < j) {
                maxNumber = j;
            }
        }

        return arithmeticProgressionSum(minNumber, maxNumber) - recursiveSum(arr, arr.length);
    }


    /**
     * Метод рекурсивно считает сумму всех значений в массиве
     * @param arr массив
     * @param n длинна массива
     * @return сумму всех значений массива
     */
    private static int recursiveSum(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        } else {
            return recursiveSum(arr, n - 1) + arr[n - 1];
        }
    }

    /**
     * @param firstTerm первое чисто
     * @param lastTerm последнее число
     * @return сумму между двух чисел
     */
    private static int arithmeticProgressionSum(int firstTerm, int lastTerm) {
        int sum = 0;
        for (int i = firstTerm; i <= lastTerm; i++) {
            sum += i;
        }
        return sum;
    }
}