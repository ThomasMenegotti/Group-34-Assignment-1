public class Bananas implements GroceryProductFactory {
    @Override
    public void getProduct() {
        System.out.println("Banana Product has been created in Database");
    }

}