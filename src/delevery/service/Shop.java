package delevery.service;


public class Shop {
    static String[] Categories = new String[]{"Shoes","Clothes","Sport","Food","Cosmetic"};
    
    String name;
    String category;
    Item[] items;
    
    Shop(String name , String c , Item[] it){
        this.name = name;
        category = c;
        items = it;
    }
    Shop(String n , String c){
        name = n;
        category = c;
    }
    Shop(){}
}
