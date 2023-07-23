/*Задача 1 - Абстракция +
Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы
*/

/*Задача 2 - Инкапсуляция +
Реализуйте конструкторы, get/set методы, постройте логику торгового автомата на основе кода,
сделанного в предыдущем задании
*/

/*Задача 3 - Наследование +
Сделайте класс Товар абстрактным, создайте нескольких наследников (к примеру: БутылкаВоды),
сделайте интерфейсом ТорговыйАвтомат и реализуйте класс какого-то одного типа
ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат)
*/

/*Задача 4 - Полиморфизм
* Переопределите метод toString для Товара, запустите программу, после этого переопределите для
наследника этот метод, после запуска обратите внимание на изменение поведения.
* Создайте перегруженный метод выдачи товара ТорговымАвтоматом дополнив дополнительным
входным параметром (пример: getProduct(String name) выдающий товар по имени, создайте метод
возвращающий товар по имени и какому-либо параметру товара getProduct(String name, int volume)
*/

/*Домашнее задание
* Создать наследника класса Продукта - ГорячийНапиток с дополнительным полем int температура.
* Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт
соответствующий имени, объему и температуре
* В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
воспроизвести логику заложенную в программе
* Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
*/

package TradeAutomaton;

import java.util.Arrays;
import java.util.List;

public class program
{
	public static void main(String[] args)
	{
		ColdDrink water1 = new ColdDrink("Святой источник", "газ мин вода", 0.33, 50, 20);
		List<ColdDrink> coldDrinksPriceList = Arrays.asList(
				new ColdDrink("BonAqua", "негаз вода", 0.33, 55, 15),
				new ColdDrink("BonAqua", "негаз вода", 0.5, 80, 15),
				new ColdDrink("Сандорик Яблоко", "сок", 0.25, 80, 25),
				new ColdDrink("Longer", "негаз слабоалк", 0.3, 125, 25),
				new ColdDrink("Fanta", "газ сладк вода", 0.5, 100, 25));

		List<HotDrink> hotDrinksPriceList = Arrays.asList(
				new HotDrink("Латте", 60, 100),
				new HotDrink("Эспрессо", 70, 60),
				new HotDrink("Американо", 70, 80),
				new HotDrink("Чай чёрный", 80, 60),
				new HotDrink("Чай зеленый", 80, 60));

		ColdDrinksAutomaton automat000 = new ColdDrinksAutomaton();
		System.out.println(automat000);

		ColdDrinksAutomaton automat001 = new ColdDrinksAutomaton("Автомат с напитками", "Университет");
		System.out.println(automat001);
		automat001.addProduct(water1);
		automat001.addProductList(coldDrinksPriceList);

		automat001.printProducts();
		automat001.buy(0);
		automat001.buy(2);
		automat001.buy(0);
		automat001.buy(1);
		automat001.buy(4);
		automat001.buy("BonAqua");
		automat001.buy("Coca Cola");
		automat001.buy("BonAqua", 0.33);
		automat001.buy("BonAqua", 0.5);
		automat001.buy("BonAqua", 1.0);


		System.out.println(">>>>> КОНЕЦ СМЕНЫ >>>>>>");
		System.out.println(automat001);
		automat001.printProducts();

		HotDrinksAutomaton automat010 = new HotDrinksAutomaton("Кофемат", "Офисы на Семи Холмах");
		System.out.println(automat010);
		automat010.addProductList(hotDrinksPriceList);

		automat010.printProducts();
		automat010.buy(0);
		automat010.buy(2);
		automat010.buy("Латте");
		automat010.buy("Чай чёрный");
		automat010.buy("Американо" , 55);
		automat010.buy("Американо" , 70);
		automat010.buy("ЭКспрессо");
		automat010.buy("Латте");

		System.out.println(">>>>> КОНЕЦ СМЕНЫ >>>>>>");
		System.out.println(automat010);
	}
}

/*
=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Автомат со снеками (#001), расположение: Сервис автоматов, Выручка: 0
=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Автомат с напитками (#002), расположение: Университет, Выручка: 0
=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Наполнение торгового автомата #002:
id 0: Святой источник      (0,33 л, кат.: газ мин вода  ) Ц: ₽ 50, в наличии 20 ед.
id 1: BonAqua              (0,33 л, кат.: негаз вода    ) Ц: ₽ 55, в наличии 15 ед.
id 2: BonAqua              (0,50 л, кат.: негаз вода    ) Ц: ₽ 80, в наличии 15 ед.
id 3: Сандорик Яблоко      (0,25 л, кат.: сок           ) Ц: ₽ 80, в наличии 25 ед.
id 4: Longer               (0,30 л, кат.: негаз слабоалк) Ц: ₽125, в наличии 25 ед.
id 5: Fanta                (0,50 л, кат.: газ сладк вода) Ц: ₽100, в наличии 25 ед.
--------------------------------------------------
Покупка: Святой источник (0,33). Приходите ешё!
-----------
Покупка: BonAqua (0,50). Приходите ешё!
-----------
Покупка: Святой источник (0,33). Приходите ешё!
-----------
Покупка: BonAqua (0,33). Приходите ешё!
-----------
Покупка: Longer (0,30). Приходите ешё!
-----------
Покупка: BonAqua (0,33). Приходите ешё!
-----------
К сожалению, напитка Coca Cola нет в наличии.
-----------
Покупка: BonAqua (0,33). Приходите ешё!
-----------
Покупка: BonAqua (0,50). Приходите ешё!
-----------
К сожалению, напитка BonAqua (1,00 л) нет в наличии.
-----------
>>>>> КОНЕЦ СМЕНЫ >>>>>>

=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Автомат с напитками (#002), расположение: Университет, Выручка: 550
=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Наполнение торгового автомата #002:
id 0: Святой источник      (0,33 л, кат.: газ мин вода  ) Ц: ₽ 50, в наличии 18 ед.
id 1: BonAqua              (0,33 л, кат.: негаз вода    ) Ц: ₽ 55, в наличии 12 ед.
id 2: BonAqua              (0,50 л, кат.: негаз вода    ) Ц: ₽ 80, в наличии 13 ед.
id 3: Сандорик Яблоко      (0,25 л, кат.: сок           ) Ц: ₽ 80, в наличии 25 ед.
id 4: Longer               (0,30 л, кат.: негаз слабоалк) Ц: ₽125, в наличии 24 ед.
id 5: Fanta                (0,50 л, кат.: газ сладк вода) Ц: ₽100, в наличии 25 ед.
--------------------------------------------------

=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Кофемат (#001), расположение: Офисы на Семи Холмах, Выручка: 0
=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Наполнение торгового автомата #001:
id 0: горячий Латте (60°C)       Ц: ₽100
id 1: горячий Эспрессо (70°C)    Ц: ₽ 60
id 2: горячий Американо (70°C)   Ц: ₽ 80
id 3: горячий Чай чёрный (80°C)  Ц: ₽ 60
id 4: горячий Чай зеленый (80°C) Ц: ₽ 60
--------------------------------------------------
Заберите Ваш горячий Латте (60°C)       Ц: ₽100. Приходите ешё!
-----------
Заберите Ваш горячий Американо (70°C)   Ц: ₽ 80. Приходите ешё!
-----------
Заберите Ваш горячий Латте (60°C)       Ц: ₽100. Приходите ешё!
-----------
Заберите Ваш горячий Чай чёрный (80°C)  Ц: ₽ 60. Приходите ешё!
-----------
К сожалению, напиток Американо (55°C) я готовить не умею.
-----------
Заберите Ваш горячий Американо (70°C)   Ц: ₽ 80. Приходите ешё!
-----------
К сожалению, напиток ЭКспрессо я готовить не умею.
-----------
Заберите Ваш горячий Латте (60°C)       Ц: ₽100. Приходите ешё!
-----------
>>>>> КОНЕЦ СМЕНЫ >>>>>>

=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Кофемат (#001), расположение: Офисы на Семи Холмах, Выручка: 520
=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

 */