package paint;

public class Client {
    public static void main (String[] args){
        Color color = new Black();
        Pen pen = new MiddlePen();

        pen.setColor(color);
        pen.draw("鲜花");
    }
}
