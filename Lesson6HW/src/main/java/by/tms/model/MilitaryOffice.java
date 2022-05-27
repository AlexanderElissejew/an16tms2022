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

import java.util.Objects;

public class MilitaryOffice {
    private static Person[] personRegistry;

    public MilitaryOffice(Person[] personRegistry) {
        MilitaryOffice.personRegistry = personRegistry;
    }

    public static Person[] getRecruits() {
        for (Person person : personRegistry) {
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getSex().equals("MALE")) {
                System.out.println("Fit recruit: " + person.getName());
            }
        }
        return new Person[0];
    }

    public void findPersonByName(String name) {
        int count = 0;
        for (Person person : personRegistry) {
            if (person.getName().equals(name)) {
                count++;
            }
        }
        System.out.println("Count of people with the name Alexander: " + count);
    }

    public void findPersonForCity(String nameOfCity) {
        int count = 0;
        for (Person person : personRegistry) {
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getAddress().getCity().equals(nameOfCity) && Objects.equals(person.getSex(), "MALE")) {
                count++;
            }
        }
        System.out.println("Count of people from Minsk " + count);
    }

    public void findPersonByAge() {
        int count = 0;
        for (Person person : personRegistry) {
            if (person.getAge() >= 25 && person.getAge() <= 27 && Objects.equals(person.getSex(), "MALE")) {
                count++;
            }
        }
        System.out.println("The number of fit recruits from 25 to 27 years old: " + count);
    }

}
