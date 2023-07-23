package TradeAutomaton;

public class HotDrink extends Product
{
	Integer temperature;
	static double volume = 0.2;

	public HotDrink(String name, Integer temperature, int price)
	{
		super(name, price);
		this.temperature = temperature;
	}

	public HotDrink(String name, int price)
	{
		this(name, price, 60);
	}

	@Override
	public String toString()
	{
		return String.format("горячий %-18s Ц: ₽%3d", name + " (" + temperature + "°C)", price);

	}
}
