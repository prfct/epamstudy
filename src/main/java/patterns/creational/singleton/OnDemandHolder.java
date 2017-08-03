package patterns.creational.singleton;

/**
 * @author Oleksii Petrokhalko.
 */
public class OnDemandHolder {

    private OnDemandHolder() {
    }

    public static class SingletonHolder {
        public static final OnDemandHolder HOLDER_INSTANCE = new OnDemandHolder();
    }

    public static OnDemandHolder getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }

}
