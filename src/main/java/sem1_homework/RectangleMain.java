package sem1_homework;

public class RectangleMain
{
	public static void main(String[] args)
	{
		Rectangle rect01 = new Rectangle();
		Rectangle rect02 = new Rectangle(10);
		Rectangle rect03 = new Rectangle(8,12);


		System.out.println(rect01);
		System.out.printf("Его периметр = %d. площадь = %d.%n", rect01.calculatePerimeter(), rect01.calculateArea());

		System.out.println(rect02);
		System.out.printf("Его периметр = %d. площадь = %d.%n", rect02.calculatePerimeter(), rect02.calculateArea());

		System.out.println(rect03);
		System.out.printf("Его периметр = %d. площадь = %d.%n", rect03.calculatePerimeter(), rect03.calculateArea());

		Rectangle rect04 = new Rectangle(0);
		System.out.println(rect04);

		Rectangle rect05 = new Rectangle(0, 5);
		System.out.println(rect05);

		Rectangle rect06 = new Rectangle(5, 0);
		System.out.println(rect06);
	}
}

/*
Создан прямоугольник: ширина = 4, высота = 6
Его периметр = 20. площадь = 24.
Создан прямоугольник: ширина = 10, высота = 10
Его периметр = 40. площадь = 100.
Создан прямоугольник: ширина = 8, высота = 12
Его периметр = 40. площадь = 96.
Создан прямоугольник: ширина = 1, высота = 1
Создан прямоугольник: ширина = 1, высота = 5
Создан прямоугольник: ширина = 5, высота = 1
 */