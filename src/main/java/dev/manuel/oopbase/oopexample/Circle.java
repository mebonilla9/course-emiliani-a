package dev.manuel.oopbase.oopexample;

public class Circle extends Shape{

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * Math.pow(radius, 2);
    // return radius * radius * Math.PI;
  }
}
