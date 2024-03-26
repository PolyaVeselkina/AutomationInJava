//Задание № 1 из ДЗ
    public class HotDrink extends Product {

//Переменная по Домашнему Заданию в классе наследнике от Product
    private int temperature;
    private int volume;


 //Констуркторы   
    public HotDrink(String name, int price, int temperature, int volume) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    public HotDrink(String name, int price) {
        super(name, price);
    }
//Констуркторы    

//Геттер/сеттеры
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

//Геттер/сеттеры

    @Override
    public String toString() {
        return "HotDrink [name= " + getName() + ";" + " temperature= " + temperature +" degrees" +"]"; // не прописали по объем
    }


}
