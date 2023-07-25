/*
Добавить пять интерфейсов к классам из ДЗ 1, включающих все концепции, упомянутые на семинаре. включающих:
- интерфейсы,
- константы,
- default методы,
- перегрузки и переопределения методов.Вы можете выбрать любой класс из ДЗ 1 и добавить к нему интерфейсы.
Вам также предоставляется возможность добавить новые методы или использовать уже существующие методы в классе.
*/
package sem2_homework;

public class Book
{
	private String title;
	private String author;
	private boolean available;

	public Book(String title, String author, boolean available) {
		this.title = title;
		this.author = author;
		this.available = available;
	}

	public Book(String title, String author) {
		this(title, author, false);
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public boolean isAvailable()
	{
		return available;
	}

	public void setAvailable(boolean available)
	{
		this.available = available;
	}

	public String getInfo()
	{
		String availability = "доступна";
		if (available == false)
		{
			availability = "недоступна";
		}
		return String.format("%-35s (%-18s). Статус: %s", "\"" + title + "\"", author, availability);
	}
}
