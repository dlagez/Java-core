package design_patterns.Demo2_FactoryMethodPattern;

public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制Python课程");
    }
}
