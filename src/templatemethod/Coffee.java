package templatemethod;

/**
 * 子类可以重新定义算法的某些步骤，而不用改变算法的结构。
 */
public class Coffee extends AbstractClass {
    @Override
    void put() {
        System.out.println("放入咖啡");
    }

    @Override
    void addOther() {
        System.out.println("放入糖");
    }
}
