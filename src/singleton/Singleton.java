package singleton;

/**
 * 使用双重验证实现 单例模式
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance(){
        //没有实例时获取锁
        if (singleton == null){
            synchronized (Singleton.class){
                //获取锁后如果还没有实例才继续实例
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
