//1) задача!
    /*
    Необходимо написать военкомат.
    1) Создаем класс военкомат MilitaryOffice
    2) Создать в классе MilitaryOffice конструктор, который принимает PersonRegistry
    3) PersonRegistry содержит список людей (Person), которые могут быть призваны в армию
    4) Создать класс Person, который будет содержать следующие поля имя, возраст, пол, адрес(страна, город)
    Военкомат должен уметь:
    a) вывести имена всех людей годных к военной службе на текущий момент времени, которые есть в PersonRegistry
    T.е нужно написать метод в классе MilitaryOffice, который будет отфильтровывать годных к службе призывников
    (годными считать мущин от 18 до 27 лет, проверяем пол и возраст)
    б) вывести количество годных призывников в городе Минске.
    в) вывести количество призывников от 25 до 27 лет
    г) вывести количество призывников у которых имя Александр.
    5) Создать класс Main, наполнить PersonRegistry людьми, по желанию можно создавать людей через консоль
    */


package by.tms.model;

public class PersonRegistry {
    private Person[] people;

    public PersonRegistry(Person[] people) {
        this.people = people;
    }

    public Person[] getRecruits() {
        Person[] recruits = new Person[people.length];
        for (int i =0; i < people.length; i++) {
            Person person = people[i];
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getSex().equals("MALE")) {
                recruits[i] = person;
            }
        }
        return recruits;
    }


    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }
}
