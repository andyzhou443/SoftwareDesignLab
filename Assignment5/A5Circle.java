package edu.cuny.ccny.csc221.a5;

public class A5Circle {
    String color;
    double x,y,radius;

    public A5Circle(){
        color= "HeyaProf";
        x = 0;
        y = 0;
        radius = 0;
    }

    public A5Circle(String colorInput,double radiusInput, double xInput,  double yInput){
        color = colorInput;
        x = xInput;
        y = yInput;
        radius = radiusInput;
    }

    public double getX(){
        return x;
    }

    public void setX(double inputX){
        this.x = inputX;
    }

    public double getY(){
        return y;
    }

    public void setY(double inputY){
        this.y = inputY;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double inputRadius){
        this.radius = inputRadius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String inputColor){
        this.color = inputColor;
    }

}
