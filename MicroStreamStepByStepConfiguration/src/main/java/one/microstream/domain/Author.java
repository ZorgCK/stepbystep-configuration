package one.microstream.domain;

public class Author
{
	private String	mail;
	private String	firsrname;
	private String	lastname;
	
	public Author(String mail, String firsrname, String lastname)
	{
		super();
		this.mail = mail;
		this.firsrname = firsrname;
		this.lastname = lastname;
	}
	
	public String getMail()
	{
		return mail;
	}
	
	public void setMail(String mail)
	{
		this.mail = mail;
	}
	
	public String getFirsrname()
	{
		return firsrname;
	}
	
	public void setFirsrname(String firsrname)
	{
		this.firsrname = firsrname;
	}
	
	public String getLastname()
	{
		return lastname;
	}
	
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}
	
}
