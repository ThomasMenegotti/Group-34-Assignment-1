public class testDriver {
   public static void main(String[] args) {
      // get Product factory
      AbstractFactory ProductFactory = FactoryProducer.getFactory(false);
      AbstractFactory PriceFactory = FactoryProducer.getFactory(true);
      GroceryProductFactory Product1 = ProductFactory.getProduct("BANANAS");
      Product1.getProduct();
      GroceryProductFactory Product3 = PriceFactory.getProduct("BANANAS");
      Product3.getProduct();
      GroceryProductFactory Product2 = ProductFactory.getProduct("APPLES");
      Product2.getProduct();
      GroceryProductFactory Product4 = PriceFactory.getProduct("APPLES");
      Product4.getProduct();

   }
}