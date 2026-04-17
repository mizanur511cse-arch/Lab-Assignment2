public class FoodItem {
    
    double price;
    String name;
    FoodItem(){
        System.out.println("--------FoodItem for Eat------");
    }
    FoodItem(double price, String name){
        this.price= price;
        this.name = name;

    }
    void showDetails(){
        System.out.println("Name="+name);
        System.out.println("Price="+price);
    }
}
    

