package templatemethod;

/**
 * 子类可以重新定义算法的某些步骤，而不用改变算法的结构。
 */
public class Tea extends AbstractClass {
    @Override
    void put() {
        System.out.println("放入茶叶");
    }

    @Override
    void addOther() {
        System.out.println("加入柠檬");
    }
}
