package ru.gb.rrbagautdinov.patterns.adapter;

public interface Database {
    void select();
    void insert();
    void update();
    void delete();
}
