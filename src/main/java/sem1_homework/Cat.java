/*
Задача 1:
Создайте класс "Кот" (Cat) со следующими свойствами:

Приватное поле "имя" (name) типа String для хранения имени кота.
Приватное поле "возраст" (age) типа int для хранения возраста кота.
Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида
"Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".
Дополнительное задание:
Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. Добавьте соответствующее поле в классе "Кот"
и методы доступа для него.
Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида
"Мяу! Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя владельца>.".
*/

package sem1_homework;

public class Cat
{
	private String name;
	private int age;
	private CatOwner owner;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}


	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public CatOwner getOwner()
	{
		return owner;
	}

	public void setOwner(CatOwner owner)
	{
		this.owner = owner;
	}

	public void greet()
	{
		String years = "лет";
		if (age == 1 || (age - 20) % 10 == 1) {years = "год";}
		if ((age >= 2 && age <= 4) || ((age - 20) % 10 >= 2 && (age - 20) % 10 <= 4)) {years = "года";}

		System.out.printf("Мяу, привет! Меняу зовут %s, мнеу %d %s (^˵◕ω◕˵^).%n", name, age, years);
		if (owner != null)
		{
			System.out.printf("Мяуего человека зовут %s!%n%n", owner);
		}
		else
		{
			System.out.println("Я гордый и гуляю сам по себе =(ⓛωⓛ)=\n");
		}
	}

	public Cat(String name, int age, CatOwner owner)
	{
		this.name = name;
		this.age = age;
		this.owner = owner;
	}

	public Cat(String name, int age)
	{
		this(name, age, null);
	}

	public Cat()
	{
		this("Дворняжка Кот", 5, null);
	}
}
