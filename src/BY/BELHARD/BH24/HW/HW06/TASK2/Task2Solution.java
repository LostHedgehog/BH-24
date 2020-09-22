package BY.BELHARD.BH24.HW.HW06.TASK2;


/*Есть список строк (List<String>).
Создать одну строку, состоящую из элементов списка, длина которых менее 5 символов,
через пробел, и вывести ее на консоль.

        Пример: список строк {“aaa”, “bbb”, “qwerty”, “”, “.”,”abcde”,“ccc”} => Вывод: “aaa bbb  . ccc”*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2Solution {

    static List<String> itr = Arrays.asList("aaa", "bbb", "qwerty", "", ".", "abcde", "ccc");

    public static void main(String[] args) {
        for (String s : itr) {
            if (s.length() < 5) {

                System.out.print(s + " ");
            }
        }


    }
}
