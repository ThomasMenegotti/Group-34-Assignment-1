public class ApplesPrice implements GroceryProductFactory {
    @Override
    public void getProduct() {
        System.out.println("Apple Price has been set to $1 for one apple.");
    }
}