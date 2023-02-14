/*
 * Copyright (c) 2023. By.Kevin Alas
 * All rights reserved
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia
 * accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget
 * metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */


package ORACLE_U.duke.choice;


public class ShopApp {
    public static void main(String[] args) {
        System.out.println("::Welcome to ShopApp::");

        double tax = 0.2;
        double total;

        Customer c1 = new Customer();

        c1.setName("Winkle");
        c1.setSize("S");

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};

        item1.setDescription("Blue Shirt");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Red Jeans");
        item2.setPrice(10.5);
        item2.setSize("S");

        items[2].setDescription("Green Shirt");
        items[2].setPrice(5.0);
        items[2].setSize("S");

        items[3].setDescription("T-Shirt Cyan");
        items[3].setPrice(10.5);
        items[3].setSize("S");

/*      System.out.println("Item 1 :" + item1.description + "," + item1.price + "," + item1.size);
        System.out.println("Item 2 :" + item2.description + "," + item2.price + "," + item2.size);
*/

        total = (item1.getPrice() + item2.getPrice() * 2) * (1 + tax);
        System.out.println("Total is: " + total);

        int measurement = 8;

        c1.setSize(measurement);

        System.out.println("Customer name: " + c1.getName() + ", Size: " + c1.getSize());


        for (Clothing item : items) {

            if (c1.getSize().equals(item.getSize())) {
                total = total + item.getPrice();
                System.out.println("Item 1 :" + item.getDescription() + "," + item.getPrice() + "," + item.getSize());
                total = total + total * tax;
                if (total > 15) {
                    break;
                }
            }
        }
        System.out.println("total: " + total);

    }
}
