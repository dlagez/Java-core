package Demo1_simpleFactoryPattern;

/**
 * 测试类
 */
public class Demo_test {
    public static void main(String[] args) {
        // 普通方法创建课程
        // 首先是这个创建课程的方法是通过new关键字来创建的。
        // 应用层代码需要依赖JavaCourse。
        ICourse course = new JavaCourse();
        course.record();


        // 工厂类创建课程，通过类反射获取对象。降低了耦合度。
        CourseFactory courseFactory = new CourseFactory();
        ICourse pythonCourse = courseFactory.create(PythonCourse.class);
        pythonCourse.record();
    }
}
