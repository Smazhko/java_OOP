/*
Добавить пять интерфейсов к классам из ДЗ 1, включающих все концепции, упомянутые на семинаре. включающих:
- интерфейсы,
- константы,
- default методы,
- перегрузки и переопределения методов.Вы можете выбрать любой класс из ДЗ 1 и добавить к нему интерфейсы.
Вам также предоставляется возможность добавить новые методы или использовать уже существующие методы в классе.
 */

package sem2_homework;

public class _FigureMain
{
	public static void main(String[] args)
	{
		Rectangle rect01 = new Rectangle();
		Rectangle rect02 = new Rectangle(10);
		Rectangle rect03 = new Rectangle(8,12);


		System.out.println(rect01);
		System.out.printf(rect01.showCalcs());

		System.out.println(rect02);
		System.out.printf(rect02.showCalcs());

		System.out.println(rect03);
		System.out.printf(rect03.showCalcs());

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