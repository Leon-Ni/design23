package factorymethod;

/**
 * 继承抽象方法的子类,并由子类去创建接口的子类对象
 */
public class ConcreatProduct extends Factorymethod {
    @Override
    Product createProduct() {
        return new Client();
    }
}
