package TradeAutomaton;

public abstract class Product
{
	private String name;
	private String category;
	private int price;
	private int count;


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

	public Product(){
		this.name = "Наименование товара";
		this.category = "";
		this.price = 0;
		this.count = 0;
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

	public int getCount()
	{
		return count;
	}

	public void decreaseCount()
	{
		if (count > 0){
			this.count--;
		}
		else {
			System.out.println("Извините, товар закончился.");
		}
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