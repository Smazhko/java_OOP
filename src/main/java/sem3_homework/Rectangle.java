package sem3_homework;

public class Rectangle implements IFigure2D
{
	private double width;
	private double height;

	public Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}

	public Rectangle(double width)
	{
		this(width, width);
	}

	public Rectangle()
	{
		this(4,6);
	}

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		if (height > 0) {this.height = height;}
		else {this.height = 1;}
	}

	public double getWidth()
	{
		return width;
	}

	public void setWidth(int width)
	{
		if (width > 0) {this.width = width;}
		else {this.width = 1;}
	}

	public double calcArea()
	{
		return width * height;
	}

	public double calcPerimeter()
	{
		return 2 * (width + height);
	}

	@Override
	public String toString()
	{
		return "Создан прямоугольник: " +
				"ширина = " + width +
				", высота = " + height;
	}

	@Override
	public String showCalcs() {
		return String.format("Доп параметры: периметр = %.1f, площадь = %.1f.%n",
				calcPerimeter(), calcArea());
	}

}

