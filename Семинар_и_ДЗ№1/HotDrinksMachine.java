//Задаие №2 ДЗ Создали класс имплемента Вендинг Машин

import java.util.List;

public class HotDrinksMachine implements VendingMachine {

 //Переменные
    private final List<Product> productList;
  //  private int money;
//Переменные


//Констурктор
    public HotDrinksMachine(List<Product> productList) {
        this.productList = productList;
    }
//Констурктор

////////////
    @Override
    public String toString() {
        
        return "Вы создали автомат горячих напитков ";
    }
////////////

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
               // money += product.getPrice();
                return product;
            }
        }
        return null;
    }

    //2ая реализация метода гетПродукт - перегрузка метода тоже    - Задание № 2 из ДЗ
    public HotDrink getProduct(String name,  int temperature,int volume) {
        for (Product product: productList) {
            if (product instanceof HotDrink) {
                if (product.getName().equals(name) && ((HotDrink) product).getVolume() == volume && ((HotDrink) product).getTemperature() == temperature) {
                    System.out.println("Вы выбрали напиток - " + name); // Вывод в консоль (на экран) выбранный напиток
                    return (HotDrink) product;
                }
            }
        }
        System.out.println("Выбирете другой напиток"); // Вывод в консоль (на экран)  если параметры не верны
        return null;
    }
    
}
