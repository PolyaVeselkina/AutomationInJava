package Семинар_2;



public class Human extends Actor{

    public Human(String name) {
        super(name);
    }


//От Родителя
    @Override
    public String getName() {
        return super.name;  // переменная из класса родителя берется по слову super
    }
 //От Родителя 

//От Интерфейса
    @Override
    public void setMakeOrder(boolean makeOrder) { //Устанавливаем статус - сделан заказ TRUE/FALSE
        super.isMakeOrder = makeOrder;
      //  System.out.println("Заказываем");//для проверки
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {//Устанавливаем статус - сделан выдан TRUE/FALSE
        super.isTakeOrder = takeOrder;
      //  System.out.println("Отдаём");//для проверки
    }

    @Override
    public boolean isMakeOrder() { //Метод возвращает статус заказа
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder; 
    }
//От Интерфейса

  

    @Override
    public String toString() {
        return " " + getName();
    }

 
}
