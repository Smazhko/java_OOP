/*
Задача 2:
Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height).
Класс должен обладать следующими методами:

Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).
*/

package sem1_homework;

public class Rectangle
{
	private int width;
	private int height;

	public Rectangle(int width, int height)
	{
		setWidth(width);
		setHeight(height);
	}

	public Rectangle(int width)
	{
		this(width, width);
	}

	public Rectangle()
	{
		this(4,6);
	}

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int height)
	{
		if (height > 0) {this.height = height;}
		else {this.height = 1;}
	}

	public int getWidth()
	{
		return width;
	}

	public void setWidth(int width)
	{
		if (width > 0) {this.width = width;}
		else {this.width = 1;}
	}

	public int calculateArea()
	{
		return width * height;
	}

	public int calculatePerimeter()
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
}

