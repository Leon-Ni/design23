package abstractfactory;

/**
 * 抽象工厂
 * 提供一个接口，用于创建 相关的对象家族
 */
public class testmain {
    public static void main(String[] args) {
        AbsFactory absFactory = new ConcreatFactory1();
        absFactory.createProductB();
        ProductA1 productA1 = (ProductA1)absFactory.creatProductA();
        System.out.println(productA1.a(1));
    }
}
