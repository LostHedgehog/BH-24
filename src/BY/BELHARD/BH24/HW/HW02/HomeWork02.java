package BY.BELHARD.BH24.HW.HW02;

public class HomeWork02 {

    public static void main(String[] args) {

        // Задание 1

        byte bt = 1;
        short s = 2;
        int i = 3;
        long l = 400_000_000;
        char c = 'z';

        float f = 5.0f;
        double d = 100.0;

        boolean b = true;

        System.out.println(bt = (byte) (bt*2));
        System.out.println(s = (short) (bt+s));
        System.out.println(i = i%2);
        System.out.println(i = (int) Math.sqrt(l));
        System.out.println("я была буквой " + c + " а стала буквой " + (c = (char) (c-20)));
        System.out.println(d=d*f);

       // задание 2

       int r = 5;
       final double Pi = 3.1415926536;
       if (r>0) {
           double lenght = 2 * Pi * r;
           System.out.println("Длина окружности при радиусе " + r + " см, равна " + lenght + " см.");
           double sqr = Pi * r * r;
           System.out.println("Площадь круга равна " + sqr + " квадратных сантиметров.");
       }
       else
           System.out.println("ERROR, RADIUS IS NOT APPLIED");


       // задание 3

        int t = 12;

        if (t > 30)
            System.out.println("Ничего не одевай, иди как есть");
        else if (t>=21)
            System.out.println("Одевайка дружище хотя бы майку");
        else if (t>=16)
            System.out.println("Время для свитера уже пришло");
        else if (t>=10)
            System.out.println("Ветровочка не будет лишней");
        else
            System.out.println("Куртка решает");

        // задание 4

        int salary1 = 500;
        int salary2 = 1000;
        int salary3 = 5000;

        int salMax, salMin, diff;
        if ((salary1 > salary2)&(salary1>salary3))
            salMax=salary1;
        else if ((salary2 >salary1)&(salary2>salary3))
            salMax = salary2;
        else
            salMax = salary3;

        if ((salary1 < salary2)&(salary1 < salary3))
            salMin=salary1;
        else if ((salary2 < salary1)&(salary2 < salary3))
            salMin = salary2;
        else
            salMin = salary3;

        diff = salMax-salMin;
        System.out.println();
        System.out.println("Разница между максимальной и минимальной зарплатой " + diff);

        // задание 5



    }

}
