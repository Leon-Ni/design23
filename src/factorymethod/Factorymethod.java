package factorymethod;

/**
 * 抽象的工厂方法,由子类去实现并创建对象
 */
public abstract class Factorymethod {
    abstract Product createProduct();
}
