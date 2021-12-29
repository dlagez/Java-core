package design_patterns.Demo3_AbastractFactoryPattern;

public class test {
    public static void main(String[] args) {
        JavaCourseFactory factory = new JavaCourseFactory();
        factory.createVideo().record();
    }
}
