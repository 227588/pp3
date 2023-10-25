public class SurfaceArea2{
    static float rectangle(float a, float b){
        return a*b;
    }

    static double circle(float r){
        return r*r*Math.PI;
    }

    static double triangle(float a, float h){
        return a*h/2;
    }

    static double cuboid(float a, float b, float c){
        return a*b*2+2*(a+b)*c;
    }

    static double sphere(float r){
        return 4*r*r*Math.PI;
    }

    static double cone(float r, float s){
        return r*r*Math.PI+Math.PI*r*s;
    }
}