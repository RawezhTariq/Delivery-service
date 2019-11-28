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
        s = new Scanner(System.in);
        System.out.println("Enter your location:");
        String clientLocation = s.nextLine();
        
        System.out.println("Have a nice day "+ clientName);
        PrintShoppingCategories();          
        System.out.print("Pick your shopping category: ");
      
        int input = -1;
        input = s.nextInt();
        String category = Shop.Categories[input];
        int inputs = 0;
        for (int i = 0; i < shops.length; i++) {
            if(shops[i].category == category){
                System.out.println(inputs + " " + shops[i].name);                
                inputs ++;
            }
        }
        System.out.print("Pick a shop: ");
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
        ShowShopData(shop);
        System.out.print("Pick an item to buy: ");
        input = s.nextInt();
        
        
    }
    static void PrintShoppingCategories(){
        for(int i = 0; i < Shop.Categories.length; i++){
            System.out.println(i + " "+ Shop.Categories[i]);
        }
    }
    static void ShowShopData (Shop sh){
        System.out.println("ناوی دوکان :" + sh.name + " بوارەکەی :" + sh.category);
        for(Item i :sh.items){
            System.out.println(i.name + " : "+ i.price);
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
