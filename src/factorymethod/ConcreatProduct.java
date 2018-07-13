package factorymethod;

public class ConcreatProduct extends Factorymethod {
    @Override
    Product createProduct() {
        return new Client();
    }
}
