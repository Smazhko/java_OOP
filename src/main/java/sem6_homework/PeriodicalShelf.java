
package sem6_homework;

import java.util.Collections;
import java.util.List;

public class PeriodicalShelf <E extends Periodical> extends Shelf<E> {

    private final List<E> periodStorage = getCatalog();


    @Override
    public void displayAvailable() {
        System.out.println("-".repeat(40) + "\nМассМедиа хранилища, доступные на данный момент:");
        Collections.sort(this.periodStorage);
        for (E journal: periodStorage) {
            if (journal.getAvailability()){
                System.out.println(">" + IGetPeriodicalInfo.info(journal));
            }
        }
    }

    @Override
    public void displayAll(){
        System.out.println("-".repeat(40) + "\nВсе МассМедиа хранилища (сортировка: наименование + дата релиза):");
        Collections.sort(periodStorage);
        for(E journal: periodStorage){
            System.out.println("> " + IGetPeriodicalInfo.info(journal));
        }
    }

    @Override
    public void search(String searchPhrase){
        System.out.println("-".repeat(40) + "\nПоиск издания по фразе '"+ searchPhrase + "':");
        Collections.sort(periodStorage);
        for (E journal: periodStorage) {
            if (IGetPeriodicalInfo.info(journal).toLowerCase().contains(searchPhrase.toLowerCase())){
                System.out.println("> " + IGetPeriodicalInfo.info(journal));
            }
        }
    }
}
