package day4;

public class Driver {
    public static void main(String[] args){
        //Creates 2 products
        Product laptop = new Product("laptop", 999.99, 5);
        Product headphones = new Product("headphones", 199.99, 10);

        //Makes a customer
        Customer alice = new Customer("Alice", 1200.00);

        //Adds items to cart
        alice.addToCart(laptop);
        alice.addToCart(headphones);

        //Print whats in cart
        String CartContents = alice.getCart();
        System.out.println(CartContents);

        //Print total cost of cart
        double totalCost = laptop.getPrice()+headphones.getPrice();
        System.out.println(totalCost);

        //Creates + Confirms Laptop Order
        Order orderForLaptop = new Order(alice, laptop);
        String orderConfirmation = orderForLaptop.confirmOrder();
        System.out.println(orderConfirmation);
    }
}
