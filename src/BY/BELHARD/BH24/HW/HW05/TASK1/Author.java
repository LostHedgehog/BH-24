package BY.BELHARD.BH24.HW.HW05.TASK1;

public class Author {

private String name;
private String surname;
private int age;

    public Author(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        if (age <=2)
            age = 2;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       this.age = age;
    }
}
