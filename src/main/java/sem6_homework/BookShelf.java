package sem6_homework;

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
				System.out.println(">" + IGetBookInfo.info(book));
			}
		}
	}

	@Override
	public void displayAll(){
		System.out.println("-".repeat(40) + "\nВсе книги хранилища (сортировка: титул + автор):");
		Collections.sort(bookStorage);
		for(E book: bookStorage){
			System.out.println("> " + IGetBookInfo.info(book));
		}
	}

	@Override
	public void search(String searchPhrase){
		System.out.println("-".repeat(40) + "\nПоиск издания по фразе '"+ searchPhrase + "':");
		Collections.sort(bookStorage);
		for (E book: bookStorage) {
			if (IGetBookInfo.info(book).toLowerCase().contains(searchPhrase.toLowerCase())){
				System.out.println("> " + IGetBookInfo.info(book));
			}
		}
	}

}
