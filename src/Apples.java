public class Apples implements GroceryProductFactory {
    @Override
    public void getProduct() {
        System.out.println("Apple Product has been created in Database");
    }
}