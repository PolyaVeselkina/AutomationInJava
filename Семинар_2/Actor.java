package Семинар_2;


public abstract class Actor implements ActorBehaviour {
//Задание 1 Пункт 2
//Состояния Актора
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    protected final String name;

//Констурткор
    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();
      


    
}
