package BY.BELHARD.BH24.HW.HW02;

public class HomeWork02 {

    public static void main(String[] args) {
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



    }

}
