public class ProductFactory extends AbstractFactory {
    @Override
    public Product getProduct(String ProductType) {
        if (ProductType.equalsIgnoreCase("BANANAS")) {
            return new Bananas();
        } else if (ProductType.equalsIgnoreCase("APPLES")) {
            return new Apples();
        }
        return null;
    }
}