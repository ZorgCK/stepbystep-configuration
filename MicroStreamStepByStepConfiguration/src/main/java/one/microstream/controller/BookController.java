package one.microstream.controller;

import java.util.List;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import one.microstream.DB;
import one.microstream.domain.Author;
import one.microstream.domain.Book;


@Controller("/books")
public class BookController
{
	@Get("/create")
	public HttpResponse<?> createBooks()
	{
		Author author1 = new Author("Charlotte", "Link", "c.link@example.com");
		Author author2 = new Author("Dan", "Brown", "d.brown@example.com");
		
		Book book = new Book("9783732542215", "Origin", author2);
		Book book2 = new Book("9783732542215", "Diabolus", author2);
		Book book3 = new Book("978-3-7341-0742-9", "Die Suche", author1);
		Book book4 = new Book("978-3-7341-0522-7", "Die Erscheinung", author1);
		
		DB.root.getBooks().addAll(CollectionUtils.setOf(book, book2, book3, book4));
		DB.storageManager.store(DB.root.getBooks());
		
		return HttpResponse.ok("Books successfully created!");
	}
	
	@Get
	public List<Book> getBook()
	{
		return DB.root.getBooks();
	}
}
