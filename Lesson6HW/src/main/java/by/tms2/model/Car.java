//2) задача!
    /*
 Напишите структуру классов и продемонстрируйте работу
 - Машина имеет двигатель, бензобак (реализуйте класс для каждой сущности).
 - Чтобы поехать, машину необходимо завести, т.е. включить двигатель.
 - Реализуйте методы включения машины, который в свою очередь включает её двигатель.
 - Реализуйте метод езды на машине (например просто печатаем на консоль, что машина поехала)
 - Если машина не заведена, ехать она не может.
 - Машину можно заглушить.
 - После каждой поездки считаем, что машина прошла фиксированное расстояние.
 - Реализовать возможность посмотреть, какое расстояние машина прошла за все время.
 - Чтобы создать машину обязательно нужно иметь двигатель и бензобак.
 - Марка машины, год выпуска, пройденное расстояние - не обязательны при создании машины и могут быть выставлены потом.
 (не обязательно задавать в конструкторе)
 - После создания поменять двигатель машине нельзя.
 - Чтобы машина завелась, у неё должно быть топливо в бензобаке, если топлива нет, машина не может завестись.
 - Машину можно дозаправить, можно проверить сколько топлива осталось.
 - Реализуйте пару полей для двигателя и бензобака, например: тип двигателя, общий объем бензобака,
 сколько бензина сейчас и т.д.
     */


package by.tms2.model;

public class Car {
    private String carModel;
    private int releaseYear;
    private Engine engine;
    private FuelTank fuelTank;
    private int traveledDistance;


    public Car(String carModel, int releaseYear) {
        this.carModel = carModel;
        this.releaseYear = releaseYear;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public void carOn() {
        engine.on();
        System.out.println("The car is started");
    }


    public void carRun() {
        if (!engine.off()) {
            System.out.println("Engine isn`t started");
        } else {
            System.out.println("The car is driving");
        }
    }

    public void carStop() {
        if (engine.isEngine()) {
            engine.off();
            traveledDistance += distance();
            System.out.println("Car is drived: " + distance() + " km");
        }
    }

    public int distance() {
        int min = 0;
        int max = 100;
        int random = (int) (Math.random() * ((max - min) + 1)) + min;
        return random;
    }

    public int getTraveledDistance() {
        return traveledDistance;
    }
}
