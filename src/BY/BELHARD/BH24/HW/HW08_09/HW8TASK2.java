package BY.BELHARD.BH24.HW.HW08_09;
/*принять с консоли число. Это число будет являться количеством следующих строк,
 которые нужно считать с консоли. Каждая строка должна содержать название товара, цену за штуку
 (вещественное число), количество штук, разделенные пробелом.
 После ввода последнего товара вывести на консоль общую стоимость всех введенных товаров.*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HW8TASK2 {

    public static void main(String[] args) throws Exception {

        double totalAmount = 0.0;
        int quantity;
        double price;
        List<String> listofGoods = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int itr = Integer.parseInt(reader.readLine());
        System.out.println("Введите список покупок в формате <String> <double> <int>");


        for (int i = 0; i < itr; i++){
            String zz = reader.readLine();
            listofGoods.add(zz);

        }

        for (String s: listofGoods){
            String [] subStrings = s.split(" ");
            price = Double.parseDouble(subStrings[1]);
            quantity = Integer.parseInt(subStrings [2]);
            totalAmount += price*quantity; }


        System.out.println("Общая стоимость всех покупок:" + totalAmount);

        }



    }

