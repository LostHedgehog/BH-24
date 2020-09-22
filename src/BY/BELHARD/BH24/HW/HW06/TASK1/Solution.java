package BY.BELHARD.BH24.HW.HW06.TASK1;

        /*Создать класс Person с полем String name.
        В другом классе создать поле List<Person> persons.
        Записать в список 5 экземпляров класса Person.
        Создать метод, который будет принимать параметр String name и возвращать из списка объект Person с таким именем
        (либо null, если человека с таким именем нет в списке).
        После этого вызвать у получившегося объекта метод toString().
*/


import java.util.ArrayList;
import java.util.List;

public class Solution extends Person{

    static List<Person> persons = new ArrayList<>();


    public static void main(String[] args) {


        persons.add(new Person("John"));
        persons.add(new Person("Sarah"));
        persons.add(new Person("Ivan"));
        persons.add(new Person("Alex"));
        persons.add(new Person("Dulcinea"));


        System.out.println(findThePerson("Alex"));
        System.out.println(findThePerson("Irina"));



    }

    public static Person findThePerson(String name){
        Person fPerson = null;
        for (Person person: persons){
            if (name.equals(person.getName())){
                fPerson = person;}}

        return fPerson;

    }
    }


