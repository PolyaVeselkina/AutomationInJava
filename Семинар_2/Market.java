package Семинар_2;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Actor> queue ;
    private List<Actor> queueOut ;// добавили список тех , кто сделал заказ и пошёл на выход

    public Market() {
        this.queue = new ArrayList<>(); // ДЗ - при создании ноового магазина - создается новый список -очередь queue 
        this.queueOut = new ArrayList<>();
    }

    //От Очереди
    @Override
    public void takeInQueue(Actor actor) {  // ДЗ
        //добавить в очреедь в список
      //  System.out.println("Встал в очерель"+ actor);

        queue.add(actor);
       // System.out.println("Список очереди"+ queue); //ТЕСТ проверяем как наполнялась очередь

    }

    @Override
    public void takeOrder() {  //ДЗ
        //проходить по очереди и проверять isMakeOrder() - проверять у кого не сделан заказ
        // и проставлять флаг isMakeOrder с помощью сеттера setMakeOrder()
        for (Actor queueList : queue) {
            if (queueList.isMakeOrder() == false) {
                queueList.setMakeOrder(true);
                System.out.println(queueList + " Сделал заказ"); 
               
            }
        }
       
    }

    @Override
    public void giveOrders() {
        //проверяем список isMakeOrder = true ,то isTakeOrder = true

        for (Actor queueList : queue) {
            if (queueList.isMakeOrder()) {
                queueList.setTakeOrder(true); 
                System.out.println(queueList + " Забрал свой заказ и пошёл к выходу");
               
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        //создаем новый список тех <Actor> - кто готов выйти из магазина
        //isTakeOrder ()
        //releaseFromMarket(List<Actor> actorList) -потом удаляем из списка этим методом
        
        for (Actor queueList : queue) {
            if (queueList.isTakeOrder()) {
                queueOut.add(queueList);
        
                System.out.println(queueList + " Добавлен в список тех кто стоит перед закрытой дверью на выход");
                System.out.println(queueOut);
               
            }
        }
        releaseFromMarket(queueOut);
    }
//От Очереди
///////////////////////////////////////////////
//От Магазина
    @Override
    public void acceptToMarket(Actor actor) {

    //sout() - Actor пришел в магаз
    //добавить в очередб  takeInQueue(Actor)
    System.out.println(actor + " пришёл в магазин");
    takeInQueue(actor);
    System.out.println("Список очереди"+ queue);

    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        //удаляем посетителей из магазина из списка сделанного методом releaseFromQueue()

        Iterator<Actor> actIterator = actorList.iterator();//создаем итератор

        while(actIterator.hasNext()) {            //до тех пор, пока в списке есть элементы

            Actor nextHuman = actIterator.next();
            System.out.println(nextHuman + " следующий");   //получаем следующий элемент
     
           // System.out.println(queueOut);
            actIterator.remove();                  //удаляем human с нужным именем
            System.out.println(nextHuman + " вышел из магазина");
            System.out.println(queueOut);
    
        }


    }

    @Override
    public void update() {
        takeOrder();
        giveOrders();
        releaseFromQueue();
    }
//От Магазина    
}
