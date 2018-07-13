package abstractfactory;

public class ProductA2 implements AbsProductA {
    @Override
    public int a(int a) {
        return a++;
    }
}
