package me;

public class Rectangle {
    int height;
    int width;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public void setSides(int height, int width){
        this.height = height;
        this.width = width;
    }

    public void setAllSidesTo(int value){
        this.height = value;
        this.width = value;
    }

    public int getArea(){
        return height * width;
    }

    public String getRectangleString(){
        return "" + height + ", " + width + ": " + getArea();
    }

    public boolean isBiggerThan(Rectangle rect){
        return this.getArea() > rect.getArea();
    }

    public boolean equals(Rectangle rect){
        return this.width == rect.width && this.height == rect.height;
    }
}
