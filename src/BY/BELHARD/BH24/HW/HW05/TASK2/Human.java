package BY.BELHARD.BH24.HW.HW05.TASK2;

/* Написать класс Человек, у которого есть поле "питомец".
Питомцы бывают 3х видов: Котик, Собачка и Рыбка.
Каждый питомец умеет играть, но делают они это по-разному.
Котик мяукает, Собака лает и прыгает, Рыбка плавает по кругу.
        Описать у человека метод, который позволяет играть со своим питомцем,
         и метод, который позволяет играть с любым питомцем.

*/

public class Human {
    private String humanName;
    private int humanAge;
    private Pet pet;

    public Human(String humanName, int humanAge, Pet pet) {
        this.humanName = humanName;
        this.humanAge = humanAge;
        this.pet = pet;

    }

    @Override
    public String toString() {
        return "Human{" +
                "pet=" + pet +
                '}';
    }

    public static void main(String[] args) {
        Pet pet1 = new Dog();
        Human human1 = new Human("Jack", 35, pet1);

        human1.pet.play();//играет со своим питомцем
        //System.out.println(human1.toString());

        human1.playWithpet(pet1);
    }
        public void playWithpet(Pet pet){
        String namePet = pet.getClass().getSimpleName();

        System.out.println("I am playing with my " + namePet);
        }

        ;



}
