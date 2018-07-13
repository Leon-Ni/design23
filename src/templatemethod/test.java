package templatemethod;

public class test {
    public static void main(String[] args) {
        AbstractClass coffee = new Coffee();
        coffee.prepareRecipe();
        System.out.println("----------------");
        AbstractClass tea = new Tea();
        tea.prepareRecipe();
    }
}
