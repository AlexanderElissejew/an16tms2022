package by.tms.service;

import by.tms.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("prozessor", "operatiwka", "zestkiy");
        computer.description();
        computer.on();

    }
}
