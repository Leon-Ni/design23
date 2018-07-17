package simplefactory;

/**
 * 简单工厂
 * 在创建一个对象时不向客户暴露内部细节，并提供一个创建对象的通用接口。
 */
public class test {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.createProduct(1);
    }
}
