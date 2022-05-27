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


package by.tms.service;

import by.tms.model.Address;
import by.tms.model.MilitaryOffice;
import by.tms.model.Person;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        {
            Person person = new Person("Konstantin", 24, "MALE", new Address("Minsk", "Belarus"));
            people[0] = person;
        }
        {
            Person person = new Person("Alexander", 25, "MALE", new Address("Mogilew", "Belarus"));
            people[1] = person;
        }
        {
            Person person = new Person("Vika", 22, "FEMALE", new Address("Vilnus", "Litwa"));
            people[2] = person;
        }
        MilitaryOffice militaryOffice = new MilitaryOffice(people);
        MilitaryOffice.getRecruits();
        militaryOffice.findPersonByName("Alexander");
        militaryOffice.findPersonForCity("Minsk");
        militaryOffice.findPersonByAge();
    }
}
