package Семинар_2;


//описываем логику магазина  - приход / уход покупатеоей
//обновление состояния магазина

import java.util.List;

public interface MarketBehaviour { 
    void acceptToMarket(Actor actor); // принять посетителя
    void releaseFromMarket (List<Actor> actorList);// кто выходит из магазина
    void update();// бновление магазина
     
}
