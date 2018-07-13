package templatemethod;

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
