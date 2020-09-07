package BY.BELHARD.BH24.HW.HW04.TASK6;

/* Опишите любую сущность, какую захотите.
Вот возьмите какой-то предмет или понятие и попробуйте описать его в виде класса.
Подумайте, какими полями мы могли бы описать эту сущность.
Подумайте, какие методы могут быть у этой сущности.
Хотелось бы видеть не менее 4 полей с различными типами, и не менее 3 методов с какой-то логикой.
*/

public class Solution6Car {

    private String tradeMark;
    private String type;
    private String color;
    private int wheelsQuantity;
    private boolean used;
    private int age;
    private String colour;
    private double engineVolume;


    public static void main(String[] args) {

    }

    public String repainting (String newColour){
        this.colour = newColour;
        return colour;
    }

    public void checkUser (int age) {
        if (age > 0) {
            used = true;
        }
    }
    public void testDrive (double engineVolume){
           if (engineVolume < 3.0)
               System.out.println("Никакого удовольствия");
           else
               System.out.println("Отличная тачка, беру");
        }


}
