package headfirst.singleton;

/**
 * @Description: 懒加载
 * @Author: qmingze
 * @updator:
 * @date: 2020/6/8$ 15:41$
 */
public class LazySingleton {
    private static volatile LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
