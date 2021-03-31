package one.microstream.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import one.microstream.domain.Author;


@Controller("/books")
public class BookController
{
	@Get("/create")
	@Produces(MediaType.TEXT_PLAIN)
	public void createBooks()
	{
		Author author = new Author();
		
	}
}
