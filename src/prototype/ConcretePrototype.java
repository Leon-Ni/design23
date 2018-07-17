package prototype;

/**
 * 使用原型实例指定要创建对象的 类型
 * 通过复制这个原型来创建新对象
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
