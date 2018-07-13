package abstractfactory;

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
