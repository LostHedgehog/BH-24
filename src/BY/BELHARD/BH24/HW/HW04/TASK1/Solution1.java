package BY.BELHARD.BH24.HW.HW04.TASK1;



/* 1.   Создать массив целых чисел, записать в него 10 значений.
        Посчитать и вывести сумму всех значений и среднее значение.
   2.   Посчитать и вывести медиану.*/


public class Solution1 {

    public static void main(String[] args) {

        int [] cells = new int[10];
        int sum = 0;
        double med = 0.0;
        double aver = 0.0;

        for (int i = 0; i < 10; i++){
            cells[i] = i+5+i*i;

        }

        for (int i = 0; i<cells.length;i++){
            sum = sum+cells[i];  // сумма всех элементов массива
        }

        for (int z : cells){
            System.out.println(z); // проверка заполненного массива
        }

        aver = (double) sum/cells.length; // среднее арифметическое
        med  = (double) (cells[4]+cells[5]) / 2.0; //медиана
        System.out.println("Сумма всех значений:" + sum + ", среднее значение: " + aver);
        System.out.println("Медиана равна " + med);

    }


}
