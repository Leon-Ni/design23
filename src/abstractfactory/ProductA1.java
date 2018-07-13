package abstractfactory;

public class ProductA1 implements AbsProductA {
    @Override
    public int a(int a) {
        return a++;
    }
}
