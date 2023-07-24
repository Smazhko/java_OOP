package sem1_homework;

public class CatOwner
{
	private String name;
	private Cat cat;

	public CatOwner(String name)
	{
		this.name = name;
	}


	public void setName(String name)
	{
		this.name = name;
	}


	public String getName()
	{
		return name;
	}


	@Override
	public String toString()
	{
		return name;
	}


	public Cat getCat()
	{
		return cat;
	}


	public void setCat(Cat cat)
	{
		this.cat = cat;
	}

	public void greet()
	{
		System.out.printf("Привет! Меня зовут %s (^_^). У меня есть кот %s =(ⓛωⓛ)=%n", this.name, cat.getName());
	}
}
