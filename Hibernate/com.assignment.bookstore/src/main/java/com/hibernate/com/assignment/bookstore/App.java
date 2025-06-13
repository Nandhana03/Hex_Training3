package com.hibernate.com.assignment.bookstore;

import service.BookService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BookService service=new BookService();
//        service.addBook();
//        service.updateBookPrice();
//        service.deleteBookId();
//        service.searchByBookTitle();
//        service.searchBookById();
          service.generateBookBill();
        
    }
}
