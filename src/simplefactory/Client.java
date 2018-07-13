package simplefactory;

public class Client implements Product {
    @Override
    public int a() {
        System.out.println("1234");
        return 0;
    }
}
