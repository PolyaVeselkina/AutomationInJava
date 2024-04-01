package Семинар_2;



//Лошика очереди 
//поместить/освободить из очереди ; принять/отдать заказ

public interface QueueBehaviour {  //ЗАДАНИЕ №2 семинар

    void takeInQueue(Actor actor); //забрать из очереди
    void takeOrder(); //забрать заказ
    void giveOrders();// отдать заказ
    void releaseFromQueue();// выйти из очереди 
    
}
