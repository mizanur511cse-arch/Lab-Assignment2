public class Pizza extends FoodItem{
    String size;
    Pizza(){
        System.out.println("-----My Favorite------");
    }
    Pizza(String size, double price, String name){
        super(price, name);
        this.size = size;
    }

    void showDetails(){
        super.showDetails();
        System.out.println("Size="+size);
    }
}