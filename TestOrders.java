import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) throws Exception {
        //menu items
        //macha
        Item item1 = new Item();
        //instantiate
        item1.name = "macha";
        item1.price = 5.00;

        //latte
        Item item2 = new Item();
        //instantiate
        item2.name = "latte";
        item2.price = 4.50;

        //drip coffee
        Item item3 = new Item();
        //instantiate
        item3.name = "drip coffee";
        item3.price = 2.75;

        //capuccino
        Item item4 = new Item();
        //instantiate
        item4.name = "capuccino";
        item4.price = 4.25;

        //order variables:
        Order order1 = new Order();
        //instantiate
        order1.name = "Jimmy";
        order1.total += item1.price;
        order1.ready = false;
        order1.items.add(item1.name);

        Order order2 = new Order();
        //instantiate
        order2.name = "Cindhuri";
        order2.total += item2.price;
        order2.ready = true;
        order2.items.add(item2.name);

        Order order3 = new Order();
        //instantiate
        order3.name = "Noah";
        order3.total += item3.price;
        order3.ready = false;
        order3.items.add(item3.name);

        Order order4 = new Order();
        //instantiate
        order3.name = "Lyla";
        order3.total += item2.price;
        order3.ready = true;
        order3.items.add(item3.name);

        // Application Simulations
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);


    }
}