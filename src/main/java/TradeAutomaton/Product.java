package TradeAutomaton;

public abstract class Product
{
	protected String name;
	protected String category;
	protected int price;
	protected int count;


	public Product(String name, String category, int price, int count)
	{
		this.name = name;
		this.category = category;
		this.price = price;
		this.count = count;
	}

	public Product(String name, String category, int price)
	{
		this.name = name;
		this.category = category;
		this.price = price;
		this.count = 1000;
	}

	public Product(String name, int price)
	{
		this.name = name;
		this.category = "";
		this.price = price;
		this.count = 1000;
	}

	public String getName()
	{
		return name;
	}

	public String getCategory()
	{
		return category;
	}

	public int getPrice()
	{
		return price;
	}

	public void decreseCount()
	{
		this.count--;
	}

	@Override
	public String toString()
	{
		return "Product{" +
				"name='" + name + '\'' +
				", category='" + category + '\'' +
				", price=" + price +
				", count=" + count +
				'}';
	}

//    public boolean equals(Product prod) {
//        if (!(prod instanceof Product)) {
//            return false;
//        }
//        Product other = (Product) prod;
//        if (name == null) {
//            if (other.name != null) {
//                return false;
//            }
//        } else if (!name.equals(other.name)) {
//            return false;
//        }
//        return true;
//    }

}