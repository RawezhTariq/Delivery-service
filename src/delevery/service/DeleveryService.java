package delevery.service;

import java.util.Scanner;

public class DeleveryService {

    static Shop[] shops;

    public static void main(String[] args) {
        
        CreateTempShops();
        
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to Slemani Delivery Service");
        System.out.println("Enter your name:");
        String clientName = s.nextLine();
        System.out.println("Enter your phone number:");
        int clientPhone = s.nextInt();
        System.out.println("Enter your location:");
        String clientLocation = s.next();
        
        System.out.println("_____________________________");
        System.out.println("**** Have a nice day "+ clientName+" ****");
        System.out.println("\nShopping Categories:\n");
        PrintShopCategories();          
        System.out.print("\nPick your shopping category: ");
      
        int input = -1;
        input = s.nextInt();
        System.out.println("_____________________________");
        System.out.println(Shop.Categories[input] + " Shops:\n");
        String category = Shop.Categories[input];
        int inputs = 0;
        for (int i = 0; i < shops.length; i++) {
            if(shops[i].category == category){
                System.out.println(inputs + " " + shops[i].name);                
                inputs ++;
            }
        }
        System.out.print("\nPick a shop:");
        input = s.nextInt();
        inputs = 0;
        Shop shop = null;
        for (int i = 0; i < shops.length; i++) {
            if(shops[i].category == category){
                if(inputs == input){
                    shop = shops[i];
                    break;
                }
                inputs ++;
            }
        }
        System.out.println("_____________________________");
        System.out.println(shop.name + " Items:\n");
        PrintShopData(shop);
        System.out.print("\nPick an item to buy: ");
        input = s.nextInt();
        Item _item = shop.items[input];
        System.out.print("\nAre you sure you want to add "+ _item.name+" to your shopping list?\n0 no\n1 yes");
        input = s.nextInt();
        if(input == 1){
            AddItemToShoppingList(_item);
        }
        s.close();
    }
    static void AddItemToShoppingList(Item item){
        
    }
    static void PrintShopCategories(){
        for(int i = 0; i < Shop.Categories.length; i++){
            System.out.println(i + " "+ Shop.Categories[i]);
        }
    }
    static void PrintShopData (Shop sh){
        //System.out.println("ناوی دوکان :" + sh.name + "\nبوارەکەی :" + sh.category);
        for(int i = 0 ; i< sh.items.length;i++){
            System.out.println(i +" "+ sh.items[i].name + "   "+ sh.items[i].price);
        }
    }
    static void CreateTempShops() {
        shops = new Shop[]{
        new Shop("Rebwar",
                "Clothes",
                new Item[]{
                    new Item("cowboy black",10.99f),
                    new Item("cowboy grey",10.99f),
                    new Item("t-shirt black",5.99f),
                    new Item("t-shirt grey",1.99f),
                    new Item("t-shirt white",10.99f),
                    new Item("shirt red",15.99f),                
                    new Item("shirt blue",15.99f),
                }),
        new Shop("Haji fatah",
                "Clothes",
                new Item[]{new Item("coat black",50f),
                new Item("coat grey",70f),
                new Item("t-shirt black",45f),
                new Item("t-shirt grey",46f),
                new Item("t-shirt white",15f),
                new Item("shirt black",18f),                
                new Item("shirt yello",18f),
                }),
        new Shop("Sardar fast food",
                "Food",
                new Item[]{new Item("pizza small",8f),
                new Item("pizza large",12f),
                new Item("hamburger",8f),
                new Item("cheese burger",6f),
                new Item("finger",3f),
                new Item("shawrma",3f),                
                new Item("shawrma double",5f),
                new Item("kentaki",5f),
                new Item("hotdog",5f),

                }),
        new Shop("FC LOCO",
                "Shoes",
                new Item[]{new Item("boot black",10.99f),
                new Item("boot grey",10.99f),
                new Item("men shoes black",5.99f),
                new Item("t-shirt grey",1.99f),
                new Item("t-shirt white",10.99f),
                new Item("shirt red",15.99f),                
                new Item("shirt blue",15.99f),
                }),
        new Shop("Karzan",
                "Cosmetic",
                new Item[]{new Item("cowboy black",10.99f),
                new Item("cowboy grey",10.99f),
                new Item("t-shirt black",5.99f),
                new Item("t-shirt grey",1.99f),
                new Item("t-shirt white",10.99f),
                new Item("shirt red",15.99f),                
                new Item("shirt blue",15.99f),
                }),
        new Shop("Rabar",
                "Sport",
                new Item[]{new Item("cowboy black",10.99f),
                new Item("cowboy grey",10.99f),
                new Item("t-shirt black",5.99f),
                new Item("t-shirt grey",1.99f),
                new Item("t-shirt white",10.99f),
                new Item("shirt red",15.99f),                
                new Item("shirt blue",15.99f),
                }),
        new Shop("Hamwan",
                "Clothes",
                new Item[]{new Item("cowboy black",10.99f),
                new Item("cowboy grey",10.99f),
                new Item("t-shirt black",5.99f),
                new Item("t-shirt grey",1.99f),
                new Item("t-shirt white",10.99f),
                new Item("shirt red",15.99f),                
                new Item("shirt blue",15.99f),
                }),
        new Shop("Wasta kamaran",
                "Food",
                new Item[]{new Item("cowboy black",10.99f),
                new Item("cowboy grey",10.99f),
                new Item("t-shirt black",5.99f),
                new Item("t-shirt grey",1.99f),
                new Item("t-shirt white",10.99f),
                new Item("shirt red",15.99f),                
                new Item("shirt blue",15.99f),
                }),
        new Shop("Renas",
                "Cosmetic",
                new Item[]{new Item("cowboy black",10.99f),
                new Item("cowboy grey",10.99f),
                new Item("t-shirt black",5.99f),
                new Item("t-shirt grey",1.99f),
                new Item("t-shirt white",10.99f),
                new Item("shirt red",15.99f),                
                new Item("shirt blue",15.99f),
                }),
        new Shop("Sardar",
                "Sport",
                new Item[]{new Item("cowboy black",10.99f),
                new Item("cowboy grey",10.99f),
                new Item("t-shirt black",5.99f),
                new Item("t-shirt grey",1.99f),
                new Item("t-shirt white",10.99f),
                new Item("shirt red",15.99f),                
                new Item("shirt blue",15.99f),
                }),
        new Shop("Shahram",
                "Food",
                new Item[]{new Item("cowboy black",10.99f),
                new Item("cowboy grey",10.99f),
                new Item("t-shirt black",5.99f),
                new Item("t-shirt grey",1.99f),
                new Item("t-shirt white",10.99f),
                new Item("shirt red",15.99f),                
                new Item("shirt blue",15.99f),
                }),};
    }
}
