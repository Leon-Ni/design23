package abstractfactory;

/**
 * 抽象接口,用于创建相关对象 家族
 */
public abstract class AbsFactory {
    abstract AbsProductA creatProductA();
    abstract AbsProductA creatProductA2();
    abstract AbsProductB createProductB();
}
