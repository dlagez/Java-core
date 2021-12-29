package design_patterns.Demo3_AbastractFactoryPattern;

public class JavaNote implements INote{
    @Override
    public void edit() {
        System.out.println("编写java笔记");
    }
}
