package ru.gb.rrbagautdinov.patterns.adapter;

public class DataBaseAdapter extends App implements Database{
    @Override
    public void select() {
        selectItem();
    }

    @Override
    public void insert() {
        saveItem();
    }

    @Override
    public void update() {
        updateItem();
    }

    @Override
    public void delete() {
        deleteItem();
    }
}
