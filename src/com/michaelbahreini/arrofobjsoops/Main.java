package com.michaelbahreini.arrofobjsoops;

public class Main {

    public static void main(String[] args) {

        Books[] collection = new Books[5];
        collection[0] = new Books("Harry Potter and the Sorcerer's Stone", "J. K. Rowling",
                "Fantasy", 1997);
        collection[1] = new Books("The Hobbit", "J. R. R. Tolkien", "Fantasy",
                1937);
        collection[2] = new Books("The Lord of the Rings", "J. R. R. Tolkien", "Fantasy",
                1954);
        collection[3] = new Books("The Lost Hero", "Rick Riordan", "Fantasy", 2010);
        collection[4] = new Books("The Titan's Curse", "Rick Riordan", "Fantasy",
                2007);


        for(Books i: collection){
            System.out.println(i);
        }
    }
}
