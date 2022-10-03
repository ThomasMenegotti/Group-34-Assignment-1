public class FactoryProducer {
    public static AbstractFactory getFactory(boolean Price) {
        if (Price) {
            return new ProductPriceFactory();
        } else {
            return new GroceryProductFactory();
        }
    }
}