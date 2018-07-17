package simplefactory;

/**
 * 实现接口的客户
 */
public class Client implements Product {
    @Override
    public int a() {
        System.out.println("1234");
        return 0;
    }
}
