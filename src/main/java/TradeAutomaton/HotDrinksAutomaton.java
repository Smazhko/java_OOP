package TradeAutomaton;

import java.util.*;

public final class HotDrinksAutomaton implements ITradeAutomaton {
	static int id = 0;
	private String type;
	private String location;
	private LinkedList<HotDrink> hotDrinkList;
	private int money;


	public HotDrinksAutomaton(String type, String location) {
		id++;
		this.type = type;
		this.location = location;
		this.hotDrinkList = new LinkedList<>();
		money = 0;
	}

	public HotDrinksAutomaton() {
		this("Автомат c кофе", "Сервис автоматов");
	}


	@Override
	public String toString() {
		return String.format(
				"%n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=%n" +
						"%s (#%03d), расположение: %s, Выручка: %d" +
						"%n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=", type, id, location, money);
	}


	public void addProduct(Product newProduct) {
		if (newProduct instanceof HotDrink) {
			hotDrinkList.add((HotDrink) newProduct);
		}
	}


	public void addProductList(List<? extends Product> newList) {
		hotDrinkList.addAll((List<HotDrink>) newList);
	}

	public void printProducts() {
		System.out.printf("Наполнение торгового автомата #%03d:%n", id);
		for (int i = 0; i < hotDrinkList.size(); i++) {
			System.out.printf("id%2s: %s %n", i, hotDrinkList.get(i));
		}
		System.out.println("-".repeat(50));
	}


	public void buy(int drinkID) {
		if (drinkID > 0 && drinkID < hotDrinkList.size()) {
			HotDrink selectedDrink = hotDrinkList.get(drinkID);
			selectedDrink.decreaseCount();
			money += selectedDrink.getPrice();
			System.out.printf("Заберите Ваш %s. Приходите ешё!%n-----------%n", selectedDrink);
		}
		else {
			System.out.println("Продукта с таким индексом не существует.");
		}
	}


	public void buy(String drinkName, Integer temperature) {
		LinkedList<HotDrink> drinks = this.hotDrinkList;
		Integer index = null;

		for (int i = 0; i < drinks.size(); i++) {
			if (drinks.get(i).getName().equals(drinkName) && drinks.get(i).getTemperature() == temperature) {
				index = i;
				break;
			}
		}

		if (index == null) {
			System.out.printf("К сожалению, напиток %s (%d°C) я готовить не умею.%n-----------%n", drinkName, temperature);
		}
		else {
			this.buy(index);
		}
	}


	public void buy(String drinkName) {
		LinkedList<HotDrink> drinks = this.hotDrinkList;
		Integer index = null;

		for (int i = 0; i < drinks.size(); i++) {
			if (drinks.get(i).getName().equals(drinkName)) {
				index = i;
				break;
			}
		}

		if (index == null) {
			System.out.printf("К сожалению, напиток %s я готовить не умею.%n-----------%n", drinkName);
		}
		else {
			this.buy(index);
		}
	}
}
