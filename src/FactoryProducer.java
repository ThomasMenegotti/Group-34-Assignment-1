public class FactoryProducer {
    public static ProductFactory getFactory(boolean Price) {
        if (Price) {
            return new ProductPriceFactory();
        } else {
            return new ProductFactory();
        }
    }
}