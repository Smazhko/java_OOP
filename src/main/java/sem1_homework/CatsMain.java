package sem1_homework;

public class CatsMain
{
	public static void main(String[] args)
	{
		Cat cat01 = new Cat();
		Cat cat02 = new Cat("Кот в Сапогах", 3);

		CatOwner ownerA= new CatOwner("Дядя Фёдор");
		Cat cat03 = new Cat("Матроскин", 6, ownerA);
		ownerA.setCat(cat03);

		cat01.greet();
		cat02.greet();
		cat03.greet();

		ownerA.greet();


	}
}

/*
Мяу, привет! Меняу зовут Дворняжка Кот, мнеу 5 лет (^˵◕ω◕˵^).
Я гордый и гуляю сам по себе =(ⓛωⓛ)=

Мяу, привет! Меняу зовут Кот в Сапогах, мнеу 3 года (^˵◕ω◕˵^).
Я гордый и гуляю сам по себе =(ⓛωⓛ)=

Мяу, привет! Меняу зовут Матроскин, мнеу 6 лет (^˵◕ω◕˵^).
Мяуего человека зовут Дядя Фёдор!

Привет! Меня зовут Дядя Фёдор (^_^). У меня есть кот Матроскин =(ⓛωⓛ)=

 */