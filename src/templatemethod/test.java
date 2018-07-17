package templatemethod;

/**
 * 模板方法,定义算法结构,子类可以重新定义算法,而不改变算法结构
 */
public class test {
    public static void main(String[] args) {
        AbstractClass coffee = new Coffee();
        coffee.prepareRecipe();
        System.out.println("----------------");
        AbstractClass tea = new Tea();
        tea.prepareRecipe();
    }
}
