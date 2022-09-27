public class AbstractFactoryPatternDemo {
   public static void main(String[] args) {
      // get Product factory
      ProductFactory ProductFactory = FactoryProducer.getFactory(false);
      ProductFactory ProductFactory1 = FactoryProducer.getFactory(true);
      Product Product1 = ProductFactory.getProduct("BANANAS");
      Product1.create();
      Product Product3 = ProductFactory1.getProduct("BANANAS");
      Product3.create();
      Product Product2 = ProductFactory.getProduct("APPLES");
      Product2.create();
      Product Product4 = ProductFactory1.getProduct("APPLES");
      Product4.create();

   }
}