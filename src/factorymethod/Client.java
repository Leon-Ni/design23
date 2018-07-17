package factorymethod;

/**
 * 实现接口的 子类
 */
public class Client implements Product {
    @Override
    public int a() {
        return 123;
    }
}
