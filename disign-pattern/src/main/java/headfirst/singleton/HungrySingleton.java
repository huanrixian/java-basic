package headfirst.singleton;

/**
 * @Description:
 * @Author: qmingze
 * @updator:
 * @date: 2020/6/8$ 15:44$
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    private static HungrySingleton getInstance() {
        return instance;
    }
}
