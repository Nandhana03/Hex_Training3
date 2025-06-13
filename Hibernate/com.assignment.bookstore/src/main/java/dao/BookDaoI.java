package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import model.Book;
//import model.Student;
//import model.Student;
//import model.Student;
//import model.Student;
import util.HibernateUtil;

public class BookDaoI implements BookDao{
	
	SessionFactory factory;

	public BookDaoI() {
	
		factory=HibernateUtil.getSessionFactory();
	}
	
//	add a New Book
//	Accept book details from the user and save them to the database.	
	public void saveData(Book b) {
	      Session session=factory.openSession();
	      Transaction txt=session.beginTransaction();
	      session.save(b);
	      txt.commit();
	}	

//	Update Book Price
//	Update the price of a book based on the bookId.
	public void updatePrice(int bookId,double price)
	{
		Session session=factory.openSession();
		Transaction txTransaction=session.beginTransaction();
		Query <Book>Q=session.createQuery("update Book set price=:price where bookId=:bookId");
		Q.setParameter("price",price);
		Q.setParameter("bookId", bookId);
		int r=Q.executeUpdate();
		if(r>0)
		{
			System.out.println("Updated the price");
		}
		else {
				System.out.println("Not Found");
			}
		txTransaction.commit();
}

//	Remove a Book
//	Delete a book from the database using bookId.
public void deleteBook(int bookId)
{
	Session session=factory.openSession();
	Transaction txTransaction=session.beginTransaction();
	Query <Book>Q=session.createQuery(" delete from Book where bookId=:bookId");
	Q.setParameter("bookId", bookId);
	int r=Q.executeUpdate();
	if(r>0)
	{
		System.out.println("Removed the book");
	}
	else 
		{
			System.out.println("Not Found");
		}
	txTransaction.commit();
}

//Generate Bill
//Accept bookId and quantity.
//Display book title, unit price, and total amount (price * quantity).
//If stock is insufficient, show an appropriate message.

public void generateBill(int bookId,int quantity)
{
	Session session=factory.openSession();
	 Query<Book>  query= session.createQuery("from Book where bookId = :bookId and quantity >= :qty", Book.class);
	 query.setParameter("bookId", bookId);
	 query.setParameter("qty",quantity);
	 
	
List<Book> books=	 query.list();

if(books.isEmpty())
{
	System.out.println("Not available");
}
else
{
for(Book b : books)
{
	double totalAmount = b.getPrice() * quantity;
	System.out.println("Book Title:"+b.getTitle());
	System.out.println("Unit price:"+b.getPrice());
	System.out.println("Total amount:"+totalAmount);
}
}
}
//Enquiry About Book
//Search for a book by title or bookId and display details.

@Override
public void searhByTitle(String title) {
	Session session=factory.openSession();
	Query<Book> query = session.createQuery("from Book where title = :title", Book.class);
	query.setParameter("title", "Meluha"); 
	List<Book> books= query.list();
	 
	for(Book b: books)
	{
		System.out.println(b.toString());
		
	}
	
}

public void searchById(int bookId) {
	Session session=factory.openSession();
    Book rs=	session.get(Book.class, bookId);
    if(rs!=null)
    {
    	System.out.println(rs.toString());
    }
    else {
    	System.out.println("Not Found");
	}
	
}


}
