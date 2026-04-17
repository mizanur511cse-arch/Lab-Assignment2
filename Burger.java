public class Burger extends FoodItem {
     int numberOfPatties;
    Burger(){
        System.out.println("-----Not Interested------");
    }
    Burger(int numberOfPatties, double price, String name){
        super(price, name);
        this.numberOfPatties= numberOfPatties;

    }
    void showDetails(){
        super.showDetails();
        System.out.println("Number of patties="+numberOfPatties);
    }
    
}
