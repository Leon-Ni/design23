package templatemethod;

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
