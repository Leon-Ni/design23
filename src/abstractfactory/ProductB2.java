package abstractfactory;

public class ProductB2 implements AbsProductB {
    @Override
    public int b(int b) {
        return b++;
    }
}
