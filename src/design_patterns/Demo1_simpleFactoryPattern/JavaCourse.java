package design_patterns.Demo1_simpleFactoryPattern;

/**
 * 基础课程的实现类
 */
public class JavaCourse implements ICourse{
    @Override
    public void record() {
        System.out.println("录制java课程");
    }
}
