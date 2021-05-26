package restaurent;

import java.util.Date;

public class Restaurant {
    public static void main(String[] args){
        Menu menu = new Menu();

        MenuItem menu1 = new MenuItem();
        menu1.setIsnew(true);
        menu1.setLastupdated(new Date());
        menu1.setPrice(6.20);
        menu1.setDescription("Chicken Burger");
        menu1.setCategory("Main course");

        MenuItem menuItem2 = new MenuItem();
        menuItem2.setIsnew(true);
        menuItem2.setLastupdated(new Date());
        menuItem2.setPrice(2.30);
        menuItem2.setDescription("French fries");
        menuItem2.setCategory("Appetizer");

        MenuItem menuItem3 = new MenuItem();
        menuItem3.setIsnew(true);
        menuItem3.setLastupdated(new Date());
        menuItem3.setPrice(2.50);
        menuItem3.setDescription("Cookies");
        menuItem3.setCategory("Dessert");

        menu.addMenu(new MenuItem(menu1));
        menu.addMenu(menuItem2);
        menu.addMenu(menuItem3);
        //menu.displayMenuItems();
        menu.displayMenu("Cookies");
        //menu.remove("French fries");
        menu.displayMenuItems();


    }

}
