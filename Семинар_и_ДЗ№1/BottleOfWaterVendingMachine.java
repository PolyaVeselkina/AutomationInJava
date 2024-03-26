import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {
//Переменные
    private final List<Product> productList;
    private int money;
//Переменные

//Констурктор
    public BottleOfWaterVendingMachine(List<Product> productList) {
        this.productList = productList;
    }
//Констурктор

//Переопределенный метод- который необходимо реалзовать по условиям Интерфейса
    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                money += product.getPrice();
                return product;
            }
        }
        return null;
    }
//Переопределенный метод

//2ая реализация метода гетПродукт - перегрузка метода тоже
    public BottleOfWater getProduct(String name, int volume) {
        for (Product product: productList) {
            if (product instanceof BottleOfWater) {
                if (product.getName().equals(name) && ((BottleOfWater) product).getVolume() == volume) {
                    return (BottleOfWater) product;
                }
            }
        }
        return null;
    }
}
