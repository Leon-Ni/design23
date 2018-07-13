package abstractfactory;

public class ProductB1 implements AbsProductB {
    @Override
    public int b(int b) {
        return b++;
    }
}
