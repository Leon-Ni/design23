package simplefactory;

public class SimpleFactory {
    Product createProduct(int type){
        if(type == 1){
            return new Client();
        }
        return  new Client1();
    }
}
