package delevery.service;

public class DeleveryService {

    public static void main(String[] args) {
        
        Shop shop = new Shop ();
        
        
        shop.name = "گەنجان";
        shop.category = Category.clothes;
        shop.Items = new Item[5];
        
        shop.Items[0] = new Item();          
        shop.Items[1] = new Item();        
        shop.Items[2] = new Item();        
        shop.Items[3] = new Item();        
        shop.Items[4] = new Item();        
      
        
        shop.Items[0].name = "کراسی سپی";
        shop.Items[0].price = 15.99f;
        shop.Items[1].name = "پانتۆڵ سپی";
        shop.Items[1].price = 11.99f;
        shop.Items[2].name = "چاکەت سپی";
        shop.Items[2].price = 19.99f;
        shop.Items[3].name = "بۆینباخ سپی";
        shop.Items[3].price = 2.99f;
        shop.Items[4].name = "جانتا سپی";
        shop.Items[4].price = 105.99f;
        
        ShowShopData(shop);

    }
    
    static void ShowShopData (Shop sh){
        System.out.println("ناوی دوکان :" + sh.name + " بوارەکەی :" + sh.category.toString());
        for(Item i :sh.Items){
            System.out.println(i.name + " : "+ i.price);
    }
    }
    
}
