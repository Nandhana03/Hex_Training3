package service;

import java.util.Scanner;

import dao.BookDao;
import model.Book;
import dao.BookDaoI;


public class BookService {
	
	 Book b;
	 BookDao dao;
	 Scanner sc;
	 
//		bookId (int, primary key)
//		title (String)
//		author (String)
//		price (double)
//		quantity (int)

	    public BookService(){
	        b=new Book();
	        sc=new Scanner(System.in);
	        dao=new BookDaoI();
	    }
	
	public void addBook()
	{
		System.out.println("Enter bookId:");
	    b.setBookId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter title:");
		b.setTitle(sc.nextLine());
		System.out.println("Enter author:");
		b.setAuthor(sc.nextLine());
		System.out.println("Enter price:");
		b.setPrice(sc.nextDouble());
		System.out.println("Enter the quantity:");
		b.setQuantity(sc.nextInt());
		
		dao.saveData(b);
		
	}
	
	public void updateBookPrice()
	{
		System.out.println("Enter the Book ID:");
		int bookid=sc.nextInt();
		System.out.println("Enter the new price:");
		double price=sc.nextDouble();
		dao.updatePrice(bookid,price);
	}
    
	public void deleteBookId()
	{
		System.out.println("Enter the Book ID:");
		int bookid=sc.nextInt();
		dao.deleteBook(bookid);
	}
	
	public void searchByBookTitle()
	{
		System.out.println("Enter book name:");
		String bookName=sc.nextLine();
		dao.searhByTitle(bookName);
	}
	
    public void searchBookById() 
    {	
        System.out.println("Enter your Id:");
        int bookId =sc.nextInt();
	     dao.searchById(bookId);     
    }
	
	public void generateBookBill()
	{
		System.out.println("Enter the Book ID:");
		int bookId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter quantity:");
		int quantity=sc.nextInt();
		dao.generateBill(bookId,quantity);
	}

}
