public class Start {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("Large",500, "Good Pizza");
      //  p1.name= "Good PIZZA";
      //  p1.price = 500;
      //  p1.size = "Large";
        p1.showDetails();

        Burger b1 = new Burger();
        b1.name = "Good Burger";
        b1.numberOfPatties=2;
        b1.price = 500.00;
        b1.showDetails();
    }
    
}