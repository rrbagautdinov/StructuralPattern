package ru.gb.rrbagautdinov.patterns.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new DataBaseAdapter();

        database.select();
        database.update();
        database.insert();
        database.delete();

    }
}
