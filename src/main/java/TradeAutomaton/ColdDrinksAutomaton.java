package TradeAutomaton;

import java.util.LinkedList;
import java.util.List;

public final class ColdDrinksAutomaton implements TradeAutomaton
{
	static int id = 0;
	private String type;
	private String location;
	private LinkedList<ColdDrink> coldDrinkList;
	private int money;

	public ColdDrinksAutomaton(String type, String location)
	{
		id++;
		this.type = type;
		this.location = location;
		this.coldDrinkList = new LinkedList<>();
		money = 0;
	}

	public ColdDrinksAutomaton()
	{
		this("Автомат со снеками", "Сервис автоматов");
	}


	@Override
	public String toString()
	{
		return String.format(
				"%n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=%n" +
				"%s (#%03d), расположение: %s, Выручка: %d" +
				"%n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=", type, id, location, money);
	}


	public void addProduct(ColdDrink newProduct)
	{
		coldDrinkList.add(newProduct);
	}

	public void addProductList(List<ColdDrink> newList)
	{
		coldDrinkList.addAll(newList);
	}

	public void printProducts()
	{
		System.out.printf("Наполнение торгового автомата #%03d:%n", id);
		for (int i = 0; i < coldDrinkList.size(); i++)
		{
			System.out.printf("id%2s: %s %n", i, coldDrinkList.get(i));
		}
		System.out.println("-".repeat(50));
	}

	public void buy(int drinkID)
	{
		ColdDrink cldDrnk = coldDrinkList.get(drinkID);
		cldDrnk.decreseCount();
		money += cldDrnk.getPrice();
		System.out.printf("Покупка: %s (%.2f). Приходите ешё!%n-----------%n", cldDrnk.getName(), cldDrnk.getVolume());
	}

	public void buy(String drinkName, double drinkVolume)
	{
		LinkedList<ColdDrink> drinks = this.coldDrinkList;
		Integer index = null;

		for (int i = 0; i < drinks.size(); i++)
		{
			if (drinks.get(i).getName().equals(drinkName) && drinks.get(i).getVolume() == drinkVolume)
			{
				index = i;
				break;
			}
		}

		if (index == null)
		{
			System.out.printf("К сожалению, напитка %s (%.2f л) нет в наличии.%n-----------%n", drinkName, drinkVolume);
		}
		else
		{
			this.buy(index);
		}
	}


	public void buy(String drinkName)
	{
		LinkedList<ColdDrink> drinks = this.coldDrinkList;
		Integer index = null;

		for (int i = 0; i < drinks.size(); i++)
		{
			if (drinks.get(i).getName().equals(drinkName))
			{
				index = i;
				break;
			}
		}

		if (index == null)
		{
			System.out.printf("К сожалению, напитка %s нет в наличии.%n-----------%n", drinkName);
		}
		else
		{
			this.buy(index);
		}
	}
}
