package one.microstream.domain;

public class Book
{
	private String	isbn;
	private String	name;
	private Author	author;
	
	public Book(String isbn, String name, Author author)
	{
		super();
		this.isbn = isbn;
		this.name = name;
		this.author = author;
	}
	
	public String getIsbn()
	{
		return isbn;
	}
	
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Author getAuthor()
	{
		return author;
	}
	
	public void setAuthor(Author author)
	{
		this.author = author;
	}
	
}
