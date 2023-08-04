/*
>>>> Класс "Библиотека" (Library):
+> Приватное поле "каталог" (catalog) типа ArrayList<Book> для хранения списка книг в библиотеке.
+> Публичный метод "добавить книгу" (addBook), который принимает объект типа Book и добавляет его в каталог библиотеки.
+> Публичный метод "удалить книгу" (removeBook), который принимает объект типа Book и удаляет его из каталога библиотеки.
+ > Публичный метод "показать доступные книги" (displayAvailableBooks), который выводит на консоль информацию о доступных
книгах в библиотеке.
> Публичный метод "поиск книги по автору" (searchByAuthor), который принимает имя автора в качестве параметра и выводит
на консоль информацию о книгах данного автора, находящихся в каталоге библиотеки.
 */
package sem3_homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Bookcase implements Iterator<Publication> {
	private ArrayList<Publication> catalog = new ArrayList<>();

	public void add(Publication newBook) {
		catalog.add(newBook);
	}

	public void remove(Publication bookToRemove) {
		System.out.print("-".repeat(40) + "\nУдаление книги \"" + bookToRemove.getTitle() + "\": ");
		if (catalog.contains(bookToRemove)) {
			catalog.remove(bookToRemove);
			System.out.println("успешно!");
		}
		else {
			System.out.println("каталог не содержит данной книги. Удалять нечего!");
		}
	}

	public void displayAvailableBooks() {
		System.out.println("-".repeat(40) + "\nКниги библиотеки, доступные на данный момент:");
		Collections.sort(catalog);
		for (int i = 0; i < catalog.size(); i++) {
			if (catalog.get(i).getAvailability()){
				System.out.printf("> %-35s (%-20s) %n", "\"" + catalog.get(i).getTitle() + "\"", catalog.get(i).getAuthor());
			}
		}
	}
	
	public void displayAllBooks(){
		System.out.println("-".repeat(40) + "\nВсе книги библиотеки (сортировка по заглавию книги):");
		Collections.sort(catalog);
		for(Publication book: catalog){
			System.out.println("> " + book.getInfo());
		}
	}

	public void search(String searchPhrase){
		System.out.println("-".repeat(40) + "\nПоиск книг по фразе '"+ searchPhrase + "':");
		Collections.sort(catalog);
		for (int i = 0; i < catalog.size(); i++) {
			if (catalog.get(i).getTitle().toLowerCase().contains(searchPhrase.toLowerCase())){
				System.out.println("> " + catalog.get(i).getInfo());
			}
		}
	}

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Publication next() {
		return null;
	}
}
