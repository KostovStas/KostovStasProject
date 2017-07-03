package oop.week_1.homeTaskOopWeek_1;

import java.util.Arrays;
/*
5. Написать класс массив.
        - нахождение минимального +
        - нахождение максимального +
        - заполнение случайными числами в диапазоне +
        - красивый вывод на экран {2 4 5 6} +
        -* увеличить размер ---------
        -* сделать сортировку массива
        -* метод для сравнения с другим массивом*/


public class Array {

    private int[] array;


    public Array(int size) {

        array = new int[size];


    }


    public int findingMinElement() {

        int min = 0;

        for (int i = 0; i < this.array.length; i++) {

            if (this.array[i] < min) {

                min = this.array[i];
            }
        }
        System.out.println("Min element in this array is " + min);

        return min;

    }


    public int findingMaxElement() {

        int max = 0;

        for (int i = 0; i < this.array.length; i++) {

            if (this.array[i] > max) {

                max = this.array[i];
            }
        }
        System.out.println("Max element in this array is " + max);

        return max;

    }


    public void fillWithRandomNumbers(int start, int finish) {

        for (int i = 0; i < this.array.length; i++) {

            this.array[i] = (int) (Math.random() * (start - finish) + finish);

        }

    }

    public void printArray() {

        System.out.print("[");
        for (int i = 0; i < this.array.length; i++) {
            System.out.print(this.array[i]);

            if (i < this.array.length - 1) {
                System.out.print(" ");

            }
        }
        System.out.println("]");
    }


    public void arrayExpantion() {

        int[] tmp = new int[this.array.length * 2];

        for (int i = 0; i < this.array.length; i++) {

            tmp[i] = this.array[i];
        }
        this.array = tmp;

    }


    public void arraySort() {

        Arrays.sort(this.array);

    }


    @Override
    public boolean equals(Object otherArray) {

        if (this == otherArray)
            return true;

        if (otherArray == null || getClass() != otherArray.getClass())
            return false;

        Array array1 = (Array) otherArray;

        return Arrays.equals(array, array1.array);
    }


}
