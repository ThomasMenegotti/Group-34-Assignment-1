public class BananasPrice implements GroceryProductFactory {
    @Override
    public void getProduct() {
        System.out.println("Banana Price has been set to $101 for one banana.");
    }
}