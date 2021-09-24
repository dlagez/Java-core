package Demo2_FactoryMethodPattern;

/**
 * 基础课程的实现类
 */
public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制java课程");
    }
}
