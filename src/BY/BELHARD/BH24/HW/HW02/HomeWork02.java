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

        System.out.println(bt = (byte) (bt * 2));
        System.out.println(s = (short) (bt + s));
        System.out.println(i = i % 2);
        System.out.println(i = (int) Math.sqrt(l));
        System.out.println("я была буквой " + c + " а стала буквой " + (c = (char) (c - 20)));
        System.out.println(d = d * f);

        // задание 2

        int r = 5;
        final double Pi = 3.1415926536;
        if (r > 0) {
            double lenght = 2 * Pi * r;
            System.out.println("Длина окружности при радиусе " + r + " см, равна " + lenght + " см.");
            double sqr = Pi * r * r;
            System.out.println("Площадь круга равна " + sqr + " квадратных сантиметров.");
        } else
            System.out.println("ERROR, RADIUS IS NOT APPLIED");


        // задание 3

        int t = 12;

        if (t > 30)
            System.out.println("Ничего не одевай, иди как есть");
        else if (t >= 21)
            System.out.println("Одевайка дружище хотя бы майку");
        else if (t >= 16)
            System.out.println("Время для свитера уже пришло");
        else if (t >= 10)
            System.out.println("Ветровочка не будет лишней");
        else
            System.out.println("Куртка решает");

        // задание 4

        int salary1 = 1200;
        int salary2 = 1000;
        int salary3 = 5000;

        int salMax, salMin, diff;
        if ((salary1 > salary2) & (salary1 > salary3))
            salMax = salary1;
        else if ((salary2 > salary1) & (salary2 > salary3))
            salMax = salary2;
        else
            salMax = salary3;

        if ((salary1 < salary2) & (salary1 < salary3))
            salMin = salary1;
        else if ((salary2 < salary1) & (salary2 < salary3))
            salMin = salary2;
        else
            salMin = salary3;

        diff = salMax - salMin;
        System.out.println();
        System.out.println("Разница между максимальной и минимальной зарплатой " + diff);


        // задание 5. Даны 2 числа, a – целое, n – целое положительное.
        // Используя цикл, найти результат возведения a в степень n.

        int aDigit = 5;
        int pwr = 12;
        System.out.println(aDigit + " в степени " + pwr + " равно " + power(aDigit,pwr));

        //ЗАДАНИЕ 6
        // Банк предлагает вклад под процент. Дано: начальная сумма вклада startSum,
        // процент годовых proc, количество лет years, на которые совершается вклад.
        // Сумма индексируется каждый год (это значит, что после каждого года процент начисляется не на изначальную сумму, а на текущую).
        // Вывести, сколько денег будет на счету после years лет.
        //*доп. Каждый год банк вычитает из суммы вклада налог в размере 1% от изначального вклада.

        double startSum = 10000.0;
        double proc = 6.5;
        int years = 3;


        double descrise = startSum*0.01;

        for(int j = 0; j < years; j++) {
            startSum = startSum + startSum*(double)(proc/100) - descrise;
        }

        System.out.println("Через " + years + " года, на счету будет " + startSum);


    }

        public static int power(int a, int b){
            int result = 1;
            for (int i=1; i<=b; i++){
                result = result*a;
            }
            return result;
        }














}
