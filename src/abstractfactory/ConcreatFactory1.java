package abstractfactory;

/**
 * 由子类去创建对象家族
 */
public class ConcreatFactory1 extends AbsFactory {
    @Override
    AbsProductA creatProductA() {
        System.out.println("1111");
        return new ProductA1();
    }

    @Override
    AbsProductA creatProductA2() {
        return new ProductA2();
    }

    @Override
    AbsProductB createProductB() {
        System.out.println("2222");
        return new ProductB1();
    }
}
