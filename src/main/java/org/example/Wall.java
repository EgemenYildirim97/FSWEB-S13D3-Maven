package org.example;

public class Wall {
    double width;
    double height;
    public Wall(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double x){
        if(x<0) this.width=0;
        else this.width=x;
    }
    public void setHeight(double y){
        if(y<0) this.height=0;
        else this.height=y;
    }
    public double getArea(){
        return width*height;
    }

}
