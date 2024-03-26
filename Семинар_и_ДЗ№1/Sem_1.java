//Задача 1 - Абстракция

//Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, 
//содержащий в себе методы initProducts (List <Product>) сохраняющий в себе 
//список исходных продуктов и getProduct(String name)

//Задача 2 - Инкапсуляция

//Реализуйте конструкторы, get/set методы, постройте логику 
//ТорговогоАвтомата на основе кода сделанного в предыдущем задании.

//Задача 3 - Наследование

//Сделайте класс Товар абстрактным, создайте нескольких наследников 
//(к примеру: БутылкаВоды), сделайте интерфейсом ТорговыйАвтомат и реализуйте 
//класс какого-то одного типа ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат)

//Задача 4 - Полиморфизм

//1. Переопределите метод toString для Товара, запустите программу, 
//после этого переопределите для наследника этот метод, после запуска 
//обратите внимание на изменение поведения.
//2. Создайте перегруженный метод выдачи товара ТорговымАвтоматом 
//дополнив дополнительным входным параметром (пример: getProduct(String name) 
//выдающий товар по имени, создайте метод возвращающий товар по имени и 
//какому-либо параметру товара getProduct(String name, int volume)

import java.util.ArrayList;
import java.util.List;

public class Sem_1 {
    public static void main(String[] args) {

      HotDrink tea = new HotDrink("Nasty", 100, 50, 1); //Задание № 3 ДЗ
      HotDrink coffe = new HotDrink("Чиба", 250, 90, 1); //Задание № 3 ДЗ
      HotDrink teaSecond = new HotDrink("Золотая ЧАША", 50, 100, 10); //Задание № 3 ДЗ

      // System.out.println(tea);
      // System.out.println(teaTwo);  // смотрим как отрабатывает метод toString

      //Создали список напитков
      List<Product> productsOfHotDrinks = new ArrayList<>();
      
      productsOfHotDrinks.add(tea);
      productsOfHotDrinks.add(teaSecond);
      productsOfHotDrinks.add(coffe);

      //System.out.println(productsOfHotDrinks); // смотрим как выводится список 

      HotDrinksMachine MachineFirst = new HotDrinksMachine(productsOfHotDrinks); // создали ХотДринксМашин и передали в него список напитков горячих ; Задание № 3

      //System.out.println(MachineFirst); // смотрим как выводится автомат 

      MachineFirst.getProduct("Чиба",90,1); // ПРоверка рабоы метода getProduct ; Задание № 3

      MachineFirst.getProduct("Чиба",90,2);






    }
}
