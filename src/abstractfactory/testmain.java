package abstractfactory;

/**
 * 抽象工厂
 */
public class testmain {
    public static void main(String[] args) {
        AbsFactory absFactory = new ConcreatFactory1();
        absFactory.createProductB();
        ProductA1 productA1 = (ProductA1)absFactory.creatProductA();
        System.out.println(productA1.a(1));
    }
}
