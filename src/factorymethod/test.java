package factorymethod;

/**
 * 工厂方法
 */
public class test {
    public static void main(String[] args) {
        ConcreatProduct concreatProduct = new ConcreatProduct();
        Product product = concreatProduct.createProduct();
        Client client = (Client) product;
        System.out.println(client.a());
    }
}
