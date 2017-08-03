package patterns.creational.singleton;

/**
 * @author Oleksii Petrokhalko.
 *         Операции чтения/записи volatile переменной являются атомарными.
 *         Результат операции записи значения в volatile переменную одним потоком,
 *         становится виден всем другим потокам, которые используют эту переменную для чтения из нее значения.
 */

public class DoubleCheckedLockingVolatile {
    private static volatile DoubleCheckedLockingVolatile instance;

    private DoubleCheckedLockingVolatile() {
    }

    public static DoubleCheckedLockingVolatile getInstance() {
        DoubleCheckedLockingVolatile localInstance = instance;
        if (localInstance == null) {
            synchronized (DoubleCheckedLockingVolatile.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new DoubleCheckedLockingVolatile();
                }
            }
        }
        return localInstance;
    }
}


