package design_patterns.Demo2_FactoryMethodPattern;

public class PythonCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
