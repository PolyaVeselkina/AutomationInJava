public abstract class Product {

    //класс абстактный => нельзя создать объект класса, но можно создать 
    //наследника, а у него уже можем создавать объект класса наследника
    
    
//констурктор
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
   
//Блок Переменных
    private String name; //private т.к будут гетерры и сеттеры
    private int price;
 //Блок Переменных

//Блок Гетеров/Сеттеров
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
 //Блок Гетеров/Сеттеров

    @Override
    public String toString() {
        return "Product{" + 
                "name ='" + name + '\'' +
                ", price=" + price + 
                '}';
    }

}
