package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("book1", 400);
        Book book2 = new Book("Clean code", 600);
        Book book3 = new Book("book3", 550);
        Book book4 = new Book("book4", 450);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println("Book name: " + book.getName() + ", Count: " + book.getCount());
        }
        System.out.println("Shown only book \"Clean code\"");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName() == "Clean code") {
                System.out.println("Book name: " + book.getName() + ", Count: " + book.getCount());
            }
        }
    }
}
