package TradeAutomaton;

import java.util.LinkedList;
import java.util.List;

public final class HotDrinksAutomaton implements TradeAutomaton
{
	static int id = 0;
	private String type;
	private String location;
	private LinkedList<HotDrink> hotDrinkList;
	private int money;


	public HotDrinksAutomaton(String type, String location)
	{
		id++;
		this.type = type;
		this.location = location;
		this.hotDrinkList = new LinkedList<>();
		money = 0;
	}

	public HotDrinksAutomaton()
	{
		this("Автомат c кофе", "Сервис автоматов");
	}


	@Override
	public String toString()
	{
		return String.format(
				"%n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=%n" +
				"%s (#%03d), расположение: %s, Выручка: %d" +
				"%n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=", type, id, location, money);
	}


	public void addProduct(HotDrink newProduct)
	{
		hotDrinkList.add(newProduct);
	}

	public void addProductList(List<HotDrink> newList)
	{
		hotDrinkList.addAll(newList);
	}

	public void printProducts()
	{
		System.out.printf("Наполнение торгового автомата #%03d:%n", id);
		for (int i = 0; i < hotDrinkList.size(); i++)
		{
			System.out.printf("id%2s: %s %n", i, hotDrinkList.get(i));
		}
		System.out.println("-".repeat(50));
	}


	public void buy(int productID)
	{
		HotDrink selectedDrink = hotDrinkList.get(productID);
		selectedDrink.decreseCount();
		money += selectedDrink.getPrice();
		System.out.printf("Заберите Ваш %s. Приходите ешё!%n-----------%n", selectedDrink);
	}


	public void buy(String drinkName, Integer temperature)
	{
		LinkedList<HotDrink> drinks = this.hotDrinkList;
		Integer index = null;

		for (int i = 0; i < drinks.size(); i++)
		{
			if (drinks.get(i).name.equals(drinkName) && drinks.get(i).temperature == temperature)
			{
				index = i;
				break;
			}
		}

		if (index == null)
		{
			System.out.printf("К сожалению, напиток %s (%d°C) я готовить не умею.%n-----------%n", drinkName, temperature);
		}
		else
		{
			this.buy(index);
		}
	}


	public void buy(String drinkName)
	{
		LinkedList<HotDrink> drinks = this.hotDrinkList;
		Integer index = null;

		for (int i = 0; i < drinks.size(); i++)
		{
			if (drinks.get(i).name.equals(drinkName))
			{
				index = i;
				break;
			}
		}

		if (index == null)
		{
			System.out.printf("К сожалению, напиток %s я готовить не умею.%n-----------%n", drinkName);
		}
		else
		{
			this.buy(index);
		}
	}
}
