package TradeAutomaton;

public class ColdDrink extends Product
{

	private double volume;

	@Override
	public String toString()
	{
		return String.format("%-20s (%.2f л, кат.: %-14s) Ц: ₽%3d, в наличии %d ед.", this.getName(), volume,
				this.getCategory(), this.getPrice(), this.getCount());
	}

	public ColdDrink(String name, String category, double volume, int price, int count)
	{
		super(name, category, price, count);
		this.volume = volume;
	}

	public double getVolume()
	{
		return volume;
	}



}
