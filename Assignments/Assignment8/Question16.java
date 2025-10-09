abstract class BaseShape {
    abstract double getArea();
    abstract double getPerimeter();
}
class Question16 {
    static class Rectangle extends BaseShape { double w,h; Rectangle(double w,double h){this.w=w;this.h=h;} double getArea(){return w*h;} double getPerimeter(){return 2*(w+h);} }
    static class Circle extends BaseShape { double r; Circle(double r){this.r=r;} double getArea(){return Math.PI*r*r;} double getPerimeter(){return 2*Math.PI*r;} }
    static class Triangle extends BaseShape { double a,b,c; Triangle(double a,double b,double c){this.a=a;this.b=b;this.c=c;} double getArea(){ double s=(a+b+c)/2; return Math.sqrt(s*(s-a)*(s-b)*(s-c)); } double getPerimeter(){ return a+b+c; } }
    public static void main(String[] args){ BaseShape r=new Rectangle(3,4); BaseShape c=new Circle(2); BaseShape t=new Triangle(3,4,5); System.out.println(r.getArea()+" "+r.getPerimeter()); System.out.println(c.getArea()+" "+c.getPerimeter()); System.out.println(t.getArea()+" "+t.getPerimeter()); }
}
