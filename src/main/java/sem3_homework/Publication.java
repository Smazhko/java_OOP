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

public abstract class Publication implements IBasePublication, Comparable<Publication> {
	private String title;
	private String author;
	private PublicationType type;
	private boolean availability;

	public enum PublicationType {
		PRINTED,
		DIGITAL,
		AUDIO
	}

	public Publication(String title, String author, PublicationType pubType, boolean available) {
		this.title = title;
		this.author = author;
		this.type = pubType;
		this.availability = available;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String getType() {
		return switch (type) {
			case PRINTED -> "Печатное издание";
			case DIGITAL -> "Электронное издание";
			case AUDIO -> "Аудио-книга (подкаст)";
		};
	}

	public boolean getAvailability() {
		return availability;
	}

	public void setAvailabilityON() {
		this.availability = true;
	}

	public void setAvailabilityOFF() {
		this.availability = false;
	}

	public String getInfo() {
		String availString = "доступна";
		if (!availability) {
			availString = "недоступна";
		}
		return String.format("%-35s /%-18s. Статус: %s", "\"" + title + "\"", author, availString);
	}

	@Override
	public int compareTo(Publication o) {
		String thisBookName = this.author + this.title;
		String anotherBookName = o.author + o.title;
		return thisBookName.compareTo(anotherBookName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Publication anotherPub = (Publication) obj;

		return this.getAuthor().equals(anotherPub.getAuthor()) &&
				this.getTitle().equals(anotherPub.getTitle());
	}

}
