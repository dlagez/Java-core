package design_patterns.Demo3_AbastractFactoryPattern;

public interface CourseFactory {
    INote createNote();

    IVideo createVideo();
}
