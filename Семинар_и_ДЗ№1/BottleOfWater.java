public class BottleOfWater extends Product{

//Это наследник класса продукт
    private int volume;

//констуртор 1
    public BottleOfWater(String name, int price) {
    super(name, price);
    }
//констуртор 2
    public BottleOfWater(String name, int price, int volume) {
        super(name, price);
        this.volume = volume;
    }
    
//Геттеры/сеттеры
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
//Геттеры/сеттеры

    @Override
    public String toString() {
        return "BottleOfWater {" +
                "volume =" + volume + ", name=" + getName() +
                '}';
    }
    
}
