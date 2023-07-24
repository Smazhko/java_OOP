/*
Задача 3 - по желанию, для тех кто уже проходил ООП, чтобы было не скучно.:
Реализуйте систему управления библиотекой. Создайте классы "Книга" (Book) и "Библиотека" (Library) со следующими свойствами и методами:

>>>> Класс "Книга" (Book):
+> Приватные поля "название" (title) и "автор" (author) типа String для хранения названия и автора книги соответственно.
+> Приватное поле "доступность" (available) типа boolean для указания доступности книги.
+> Публичные методы доступа (геттеры и сеттеры) для полей "название" и "автор".
+> Публичные методы доступа (геттеры и сеттеры) для поля "доступность".
+> Публичный метод "показать информацию" (displayInfo), который выводит на консоль информацию о книге (название, автор,
доступность).

>>>> Класс "Библиотека" (Library):
> Приватное поле "каталог" (catalog) типа ArrayList<Book> для хранения списка книг в библиотеке.
> Публичный метод "добавить книгу" (addBook), который принимает объект типа Book и добавляет его в каталог библиотеки.
> Публичный метод "удалить книгу" (removeBook), который принимает объект типа Book и удаляет его из каталога библиотеки.
> Публичный метод "показать доступные книги" (displayAvailableBooks), который выводит на консоль информацию о доступных
книгах в библиотеке.
> Публичный метод "поиск книги по автору" (searchByAuthor), который принимает имя автора в качестве параметра и выводит
на консоль информацию о книгах данного автора, находящихся в каталоге библиотеки.
*/
package sem1_homework;

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
