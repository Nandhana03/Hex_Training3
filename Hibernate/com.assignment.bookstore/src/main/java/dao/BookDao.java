package dao;

import model.Book;

public interface BookDao {

	void saveData(Book b);

	void updatePrice(int bookid, double price);

	void deleteBook(int bookid);

	void searhByTitle(String title);

	void generateBill(int bookId, int quantity);

	void searchById(int bookId);

}
