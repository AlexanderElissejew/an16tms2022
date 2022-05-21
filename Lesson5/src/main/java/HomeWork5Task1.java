//  /**
//     *
//     * 1) Создать класс User для хранения о обработки данных о пользователе.
//     * Создать поля для хранения имени и фамилии, возраста и пола. Создать методы для:
//     *  - Возврата имени и фамилии полностью
//     *  - Увеличения возраста
//     *  - Вывода общей информации о пользователе
//     *  В Main классе в методе main создайте экземпляр класса User и вызовите все созданные методы, передав им необходимые параметры.
//     * 2) Создать в классе User несколько конструкторов. Создать объект этого класса, использовав один из них.
//     * В этом конструкторе сделать вызов другого конструктора этого же класса.
//     * Отметьте один из методов как @Deprecated. Попробуйте на экземпляре класса вызвать этот метод.
//     */

public class HomeWork5Task1 {
    public static void main(String[] args) {
        User1 user1 = new User1(24, "Alex", "Yeliseyeu", "male");
        user1.getAge();
        user1.getBackNameAndSurname();
        user1.getBasicInformation();

    }
}

class User1 {
    public int age;
    public String name;
    public String surname;
    public String sex;

    public User1(int age) {
        this(18, "Iwan", "Iwanow", "male");
    }

    public User1(int age, String name, String surname, String sex) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.sex = sex;
    }

    String getBackNameAndSurname() {
        return name + surname;
    }

    int getAge() {
        age++;
        return age;
    }

    @Deprecated
    void getBasicInformation() {
        System.out.println(name + " " + surname + " " + age + " " + sex);
    }


}