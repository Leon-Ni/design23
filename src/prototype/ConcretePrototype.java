package prototype;

/**
 * 原型模式
 */
public class ConcretePrototype implements Prototype,Cloneable {

    @Override
    public Prototype myClone() {
        ConcretePrototype concretePrototype = null;
        try {
            concretePrototype = (ConcretePrototype) super.clone();
          //  System.out.println("1:"+concretePrototype.getClass());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return concretePrototype;
    }
}
