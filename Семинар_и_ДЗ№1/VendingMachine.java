import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
// был классом в начале
//Блок переменных
//    private List<Product> productList;
//    private  Integer money;

//констурктор - созддаем с Аппарат с Маней = 0 и 3 продуктами
//     public VendingMachine() {
//     this.productList = initProduct();
//     this.money = 0;
// }


    Product getProduct(String name);

    //Было так в примере Задача 1 примера
    // public Product getProduct(String name) {
    //     for (Product product : productList) {
    //         if (product.getName().equals(name)) {   //тут геттер имени продукат
    //             money += product.getPrice();         //тут геттер цены продукта
    //             return product;
    //         }
    //     }
    //     return null;
    // }

    //Мето инициализации продуктов Задача 1 примера , частично
    // private List<Product> initProduct(){   // тут приват т.к только в констуркторе вызвыается -инкапсуляция(сокрытие)
    //    List<Product> products = new ArrayList<>();
    //    products.add(new Product("Продукт1",10));
    //    products.add(new Product("Продукт2",20));
    //    products.add(new Product("Продукт3",30));
    //    return products;
    // }

}
