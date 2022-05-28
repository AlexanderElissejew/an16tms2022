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

public class FuelTank {
    private static int levelOfFuel;
    private static int tankCapacity = 80;

    public FuelTank(int levelOfFuel, int tankCapacity) {
        FuelTank.levelOfFuel = levelOfFuel;
        FuelTank.tankCapacity = tankCapacity;
    }

    public static int getLevelOfFuel() {
        return levelOfFuel;
    }

    public void setLevelOfFuel(int levelOfFuel) {
        FuelTank.levelOfFuel = levelOfFuel;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    //    public static void checkFuelTank() {
//            for (int fuel = 10; fuel > 0; fuel--){
//                System.out.println("It's remained " + fuel + " liters of fuel");
//            }
//        if (fuel == 0){
//            System.out.println("Out of gas");
//        }
//        }
//    }
}
