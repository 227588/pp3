public class Rectangle {
    int width;
    int height;

    public void showDimensions(){
        System.out.printf("Dimension: %sx%s\n", width, height);
    };
    public void showPerimeters(){
        System.out.printf("Perimeter: %s\n", 2*(width+height));
    };
    public void showSurfaceArea(){
        System.out.printf("Surface area: %s\n", width*height);
    };
}
