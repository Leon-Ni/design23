package factorymethod;

/**
 * 工厂方法
 * 定义了一个创建对象的接口，但由子类决定要实例化哪个类。工厂方法把实例化推迟到子类
 * 在简单工厂中，创建对象的是另一个类，而在工厂方法中，是由子类来创建对象。
 */
public class test {
    public static void main(String[] args) {
        ConcreatProduct concreatProduct = new ConcreatProduct();
        Product product = concreatProduct.createProduct();
        Client client = (Client) product;
        System.out.println(client.a());
    }
}
