package ru.gb.rrbagautdinov.patterns.command;

public class Database {

    public void select(){
        System.out.println("Selecting row: ");
    }

    public void insert(){
        System.out.println("Inserting row: ");
    }

    public void update(){
        System.out.println("Updating row: ");
    }

    public void delete(){
        System.out.println("Deleting row: ");
    }
}
