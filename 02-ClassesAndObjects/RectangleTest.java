public class RectangleTest {
    public static void main(String arg[]){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.width=3;
        r1.height=4;

        r2.width=2;
        r2.height=7;

        r1.showDimensions();
        r1.showPerimeters();
        r1.showSurfaceArea();

        r2.showDimensions();
        r2.showPerimeters();
        r2.showSurfaceArea();
    }
}
