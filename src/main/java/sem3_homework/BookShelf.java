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

import java.util.Collections;
import java.util.List;

public class BookShelf<E extends Book> extends Shelf<E> {

	private final List<E> bookStorage = getCatalog();


	@Override
	public void displayAvailable() {
		System.out.println("-".repeat(40) + "\nКниги хранилища, доступные на данный момент:");
		Collections.sort(this.bookStorage);
		for (E book: bookStorage) {
			if (book.getAvailability()){
				System.out.println(">" + book.getInfo());
			}
		}
	}

	@Override
	public void displayAll(){
		System.out.println("-".repeat(40) + "\nВсе книги хранилища (сортировка по умолчанию):");
		Collections.sort(bookStorage);
		for(E book: bookStorage){
			System.out.println("> " + book.getInfo());
		}
	}

	@Override
	public void search(String searchPhrase){
		System.out.println("-".repeat(40) + "\nПоиск издания по фразе '"+ searchPhrase + "':");
		Collections.sort(bookStorage);
		for (E book: bookStorage) {
			if (book.getInfo().toLowerCase().contains(searchPhrase.toLowerCase())){
				System.out.println("> " + book.getInfo());
			}
		}
	}

}
