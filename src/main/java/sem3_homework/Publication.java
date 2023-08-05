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
+> Приватное поле "каталог" (catalog) типа ArrayList<Book> для хранения списка книг в библиотеке.
+> Публичный метод "добавить книгу" (addBook), который принимает объект типа Book и добавляет его в каталог библиотеки.
+> Публичный метод "удалить книгу" (removeBook), который принимает объект типа Book и удаляет его из каталога библиотеки.
+> Публичный метод "показать доступные книги" (displayAvailableBooks), который выводит на консоль информацию о доступных
книгах в библиотеке.
+> Публичный метод "поиск книги по автору" (searchByAuthor), который принимает имя автора в качестве параметра и выводит
на консоль информацию о книгах данного автора, находящихся в каталоге библиотеки.
*/

package sem3_homework;

public abstract class Publication implements IBasePublication {
	private String title;
	private MediumType type;
	private boolean availability;

	public enum MediumType { // тип носителя
		PRINTED,
		PAPERLESS
	}

	public Publication(String title, MediumType type, boolean availability) {
		this.title = title;
		this.type = type;
		this.availability = availability;
	}

	public String getTitle() {
		return title;
	}


	@Override
	public String getType() {
		return switch (type) {
			case PRINTED -> "Печатное издание";
			case PAPERLESS -> "Электронное издание";
		};
	}

	public boolean getAvailability() {
		return availability;
	}

	public void setAvailabilityON() {
		this.availability = true;
		System.out.println("-".repeat(40) + "\nИзменение статуса: \n" + this.getInfo());
	}

	public void setAvailabilityOFF() {
		this.availability = false;
		System.out.println("-".repeat(40) + "\nИзменение статуса: \n" + this.getInfo());
	}

	abstract String getInfo();

}
