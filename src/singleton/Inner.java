package singleton;

/**
 * 使用内部类来实现单例模式
 */
public class Inner {

    private Inner inner;

    private static class SingleHelper{
        private static final Inner INSTANCE = new Inner();
    }

    public static Inner getInstance(){
        return SingleHelper.INSTANCE;
    }
}
