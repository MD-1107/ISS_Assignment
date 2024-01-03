package Encapsulation;

class Book 
{
	private String author;
	private String title;
	private int pageCount;
	
	public Book(String author, String title, int pageCount)
	{
		this.author=author;
		this.title=title;
		this.pageCount=pageCount;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public int getPageCount()
	{
		return pageCount;
	}
	
	public void setPageCount(int pageCount)
	{
		if(pageCount<=0)
		{
			System.out.println("Page count cannot be negative");
		}
		else 
		{
			this.pageCount=pageCount;
		}
	}
	
	public void displayInformation()
	{
		 System.out.println("Title: " + title);
	     System.out.println("Author: " + author);
	     System.out.println("Page Count: " + pageCount);
	}
}

public class EncapsulationExample 
{
	public static void main(String args[])
	{
		 Book bookObject=new Book("J.K. Rowling", "Harry Potter and the Chamber of Secrets", 860);
		
		 System.out.println("Title: " + bookObject.getTitle());
	     System.out.println("Author: " + bookObject.getAuthor());
	     System.out.println("Page Count: " + bookObject.getPageCount());
	     
	     bookObject.setPageCount(860);
	     
	     bookObject.displayInformation();

	}

}
