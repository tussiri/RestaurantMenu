package restaurant;

public class Restaurant {

        public static void main(String[] args) {
            MenuItem item1 = new MenuItem(" Bison Burger", "Two perfectly grilled ethically sourced bison patties, served on a bed of arugula, and bacon, peach chutney." ,16.99 ,"Main Course" );
            MenuItem item2= new MenuItem("Mozzarella Sticks", "A classic mozzarella sticks, hand-breaded, and deep fried." , 7.99 ,"Appetizer" );
            MenuItem item3 = new MenuItem("Pink Champaign Cake","A light and delicate ending to a perfect meal" , 7.49 , "Dessert" );
            MenuItem item4 = new MenuItem("Ceasar Salad", "A classic Caesar salad served with your choice of in house salad dressings" , 13.99, "Main Course" );


        Menu menu = new Menu();

        menu.addMenuItem(item1);
        menu.addMenuItem(item2);
        menu.addMenuItem(item3);
        menu.addMenuItem(item4);

        menu.printMenu();

        }
}