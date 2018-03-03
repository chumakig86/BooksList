package com.chumak;


import com.chumak.model.Book;
import com.chumak.util.BooksUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String author = "Rand, Ayn";
        String genre = "philosophy";
        String publisher = "Penguin";
        int height = 170;
        BooksUtil booksUtil = new BooksUtil();
        //Returns 211
        System.out.println("Total number of books: " + booksUtil.getTotal());
        //Returns true
        System.out.println("Does the book with " + author + " author exist?: " + booksUtil.getExistByAuthor(author));
        //Returns 4
        System.out.println("Number of books with " + author + " author: " + booksUtil.getBooksCountByAuthor(author));
        //Returns 17
        System.out.println("Number of books with " + genre + " genre: " + booksUtil.getBooksCountByGenre(genre));
        //Returns 25
        System.out.println("Number of authors published by " + publisher + " publisher: " + booksUtil.getAuthorsCountByPublisher(publisher));
        List<Book> books = booksUtil.getBooksByGenreAndHeight(genre, height);
        //Returns "Story of Philosophy, The"
        System.out.print("The title of the book with " + genre + " genre and height " + height + " is: ");
        books.stream().forEach(book -> System.out.println(book.getTitle()));
        //Returns 2
        System.out.println("Number of genres in which the author " + author + " wrote: " + booksUtil.getGenreCountByAuthor(author));
    }

}
