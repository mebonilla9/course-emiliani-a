package dev.manuel.oopbase.poli;

public class OtherOperations extends Operations{

  @Override
  public int add(int a, int b){
    // Aplicar condicion para la suma
    if (a < b){
      return 0;
    }
    return super.add(a,b);
  }


}
