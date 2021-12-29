package design_patterns.Demo3_AbastractFactoryPattern;

public class JavaVideo implements IVideo{

    @Override
    public void record() {
        System.out.println("录制java视频");
    }
}
