package dev.manuel.oopbase.oopexample;

public class Square extends Shape{

  private double side;

  public Square(double side) {
    this.side = side;
  }

  @Override
  public double getArea() {
    return Math.pow(side, 2);
  }
}
