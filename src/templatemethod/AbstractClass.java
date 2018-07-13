package templatemethod;

/**
 * 定义算法框架，并将一些步骤的实现延迟到子类;
 * 重复使用的方法可以在抽象类中实现;
 */
public abstract class AbstractClass {
    //冲咖啡过程和冲茶的过程
    void prepareRecipe(){
        //烧水--复用
        boilWater();
        //放咖啡//放茶叶----延迟到子类
        put();
        //倒水--复用
        pourInCup();
        //加糖//加柠檬----延迟到子类
        addOther();
    }

    void boilWater(){
        System.out.println("烧水(复用)");
    }
    abstract void put();
    void pourInCup(){
        System.out.println("搅拌(复用)");
    }
    abstract void addOther();
}
