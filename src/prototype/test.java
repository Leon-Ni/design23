package prototype;

/**
 * 原型模式
 */
public class test {
    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        //克隆后的类型相同;
       // System.out.println("2:"+concretePrototype.getClass());
        Prototype prototype = concretePrototype.myClone();
      //  System.out.println("3:"+prototype.getClass());
        //克隆后的对象不相同
        //System.out.println(concretePrototype==prototype);

    }
}
