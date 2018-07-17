package simplefactory;

/**
 * 它把实例化的操作单独放到一个类中，这个类就成为简单工厂类，
 * 让简单工厂类来决定应该用哪个具体子类来实例化。
 */
public class SimpleFactory {
    Product createProduct(int type){
        if(type == 1){
            return new Client();
        }
        return  new Client1();
    }
}
