package design_patterns.Demo4_LazySimpleSingleton;

/**
 * 注册式单例模式
 */
public enum EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData()  {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
