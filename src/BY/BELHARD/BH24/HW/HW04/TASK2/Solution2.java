package BY.BELHARD.BH24.HW.HW04.TASK2;

/* Дано: «треугольный» массив, то есть двумерный массив,
в котором в нулевой ячейке содержится массив с 1 ячейкой,
в первой – с двумя, во второй – с тремя и т.д.
Высота равна n.
Заполнить массив таким образом,
чтобы каждый следующий элемент был в 2 раза больше предыдущего,
и вывести его на консоль. Начинать со значения intStart.
        Пример для n = 3 и intStart = 5:
        5
        10 20
        40 60 80
        *доп. Заполнять не «слева-направо», а «справа-налево»:
        5
        20 10
        80 60 40 -!ОШИБКА В ПРИМЕРЕ !ДОЛЖНО БЫТЬ 160 80 40

*/


import java.util.Arrays;

public class Solution2 {

    public static void main(String[] args) {
        int n = 4;
        int intStart = 5;
        int [][] triangle = new int[n][];

        for (int i = 0; i < n; i++){
            triangle [i] = new int[i+1];
            for (int j = 0; j < triangle[i].length; j++){
                triangle[i][j]=intStart;
                intStart = intStart*2;
            }
        }
        for (int z = 0; z < n; z++){
        System.out.println(Arrays.toString(triangle[z]));
        }
    }
}
