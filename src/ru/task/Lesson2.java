package ru.task;

public class Lesson2 {
    public static void main(String[] args) {

        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] nums = {0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = 1;
            } else nums[i] = 0;
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        //2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] arr = new int[8];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = j;
            j += 3;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 6) {
                mass[i] *= 2;
            }
            System.out.print(mass[i] + " ");
        }
        System.out.println();

        //4. Создать квадратный двумерный целочисленный массив
        // (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] arrSquare = new int[5][5];
        for (int i = 0; i < arrSquare.length; i++) {
            for (int k = 0; k < arrSquare.length; k++) {
                if (k == i || k + i == arrSquare.length - 1) {
                    arrSquare[i][k] = 1;
                } else arrSquare[i][k] = 0;
                System.out.print(arrSquare[i][k] + " ");
            }
            System.out.println();

        }

        //5. ** Задать одномерный массив и найти в нем
        // минимальный и максимальный элементы (без помощи интернета);
        int[] arr1 = {1, 2, 8, 1, 894, 1, 0, 87, 45, 3, 674, 5, 15, 94, 34, -9, 1, -94, 0, 48};
        int min = arr1[0];
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (min > arr1[i]) {
                min = arr1[i];
            }
            if (max < arr1[i]) {
                max = arr1[i];
            }
        }
        System.out.println("min = " + min + " max = " + max);

        //6.
        System.out.println(checkBalance(new int[]{2, 2, 3, 4, 1, 4}));

        //7.
        offset(new int[]{5, 3, 10}, -4);


    }

    //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
    // граница показана символами ||, эти символы в массив не входят.

    public static boolean checkBalance(int[] arr2) {
        int summ = 0;
        int privat = 0;
        for (int i = 0; i < arr2.length; i++) {
            summ += arr2[i];
        }
        if (summ % 2 == 0) {
            summ = summ / 2;
            for (int k = 0; k < arr2.length; k++) {
                privat += arr2[k];
                if (privat == summ) break;
            }
        }
        System.out.println(privat); //для проверки себя
        System.out.println(summ); //для проверки себя
        return privat == summ;
    }

    //7. **** Написать метод, которому на вход подается одномерный массив и число n
    // (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    public static void offset(int[] arr3, int n) {

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int element = arr3[0];
                arr3[0] = arr3[arr3.length - 1];
                for (int j = 1; j < arr3.length - 1; j++) {
                    arr3[arr3.length - j] = arr3[arr3.length - j - 1];
                }
                arr3[1] = element;
            }
            for (int i = 0; i < arr3.length; i++) {
                System.out.println(arr3[i]);
            }

        }
        if (n < 0) {
            for (int i = 0; i > n; i--) {
                int element = arr3[arr3.length - 1];
                arr3[arr3.length - 1] = arr3[0];
                for (int j = 1; j < arr3.length - 1; j++) {
                    arr3[j - 1] = arr3[j];
                }
                arr3[arr3.length - 2] = element;
            }
            for (int i = 0; i < arr3.length; i++) {
                System.out.println(arr3[i]);
            }
        }


    }
}
