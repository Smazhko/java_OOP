package TradeAutomaton;

public class HotDrink extends Product {
	private Integer temperature;
	static double volume = 0.2;

	public HotDrink(String name, Integer temperature, int price) {
		super(name, price);
		this.temperature = temperature;
	}

	public HotDrink(String name, int price) {
		this(name, price, 60);
	}

	public HotDrink() {
		super();
	}

	@Override
	public String toString() {
		return String.format("горячий %-18s Ц: ₽%3d", this.getName() + " (" + temperature + "°C)", this.getPrice());

	}

	public Integer getTemperature() {
		return temperature;
	}
}
