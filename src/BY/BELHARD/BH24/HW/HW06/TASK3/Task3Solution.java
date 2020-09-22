package BY.BELHARD.BH24.HW.HW06.TASK3;


/*Создать множество целых чисел (HashSet<Integer>). Записать в него 10 случайных чисел.
Создать переменную int border и присвоить ей случайное значение.
Удалить из множества все числа меньше чем border, и вывести содержимое множества на консоль.*/


import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Task3Solution {



    public static void main(String[] args) {

        HashSet<Integer> tst = new HashSet<>();
        HashSet<Integer> fnz;

        for (int z = 0; z < 10; z++) {
            Random random = new Random();
            tst.add(random.nextInt(100));
        }

        for (Integer z : tst) {
            System.out.println(z);
        }

        Random randomBorder = new Random();
        int border = randomBorder.nextInt(100);
        System.out.println("Граница отсечения:" + border);



        fnz = removeAllOverBorder(tst, border);
        for (Integer z : fnz) {
            System.out.println(z);
    }}

        public static HashSet<Integer> removeAllOverBorder (HashSet<Integer> set, int border)
        {
            set.removeIf(number -> number > border);
            return set;
        }







}
