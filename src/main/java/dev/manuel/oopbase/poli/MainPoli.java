package dev.manuel.oopbase.poli;

public class MainPoli {

  public static void main(String[] args) {

    OtherOperations op = new OtherOperations();

    System.out.println(op.add(1,2)); // <-- null,

    System.out.println(op.add(2.5,4.7));

    System.out.println(op.add(9.2,3,2.5,7));

  }
}
