package Семинар_2;



public class Main {

    public static void main(String[] args) {

        Human h1 = new Human("Петя"); //Проверяли вывод имени и слово final
        Human h2 = new Human("Вася");
        Human h3 = new Human("Федя");
      //  System.out.println(h1); //Проверка статуса заказа


        // h1.setMakeOrder(true); //Проверка создания заказа
 
        // System.out.println(h1.isMakeOrder()); //Проверка статуса заказа

        // ДЗ начало

        Market myMarket = new Market();

        myMarket.acceptToMarket(h1); // Тест добавили людей в очередь
        myMarket.acceptToMarket(h2);
        myMarket.acceptToMarket(h3);

      //  System.out.println(h1.isMakeOrder); // проверяем статус Заказа до устанвоки

      //  myMarket.takeOrder(); // проверка у кого не установлен статус заказа тру

      //  System.out.println(h1.isMakeOrder); // проверяем статус Заказа после устанвоки

        // System.out.println(h1.isTakeOrder +" -"+ h1 + " еще не забрал заказ");

        // myMarket.giveOrders();

        // System.out.println(h1.isTakeOrder +" -"+ h1 + " на выходе");

        // myMarket.releaseFromQueue();

        myMarket.update();

        
      


        

       
    }
    
}
