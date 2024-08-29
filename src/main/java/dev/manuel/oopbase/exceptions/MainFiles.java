package dev.manuel.oopbase.exceptions;

import java.io.*;

public class MainFiles {

  private final String filePath;

  public MainFiles() {
    this.filePath = System.getProperty("user.home") + File.separator + "textico.txt";
  }

  public static void main(String[] args) {

    MainFiles main = new MainFiles();
    try {
      //main.escribirArchivo();
      main.leerArchivo();
    } catch (IOException e) {
      e.printStackTrace(System.err);
    }
  }

  private void escribirArchivo() throws FileNotFoundException {
    // Guardar datos en mi carpeta de usuario
    // C:\Users\mebon\nombre_archivo.txt
    // /Users/devmanuel/nombre_archivo.txt

    String lorem = """
      Lorem ipsum dolor sit amet, consectetur adipiscing elit.
      Phasellus malesuada velit ex, sit amet fringilla massa egestas quis.
      Integer tempor vel sem eu pulvinar.
      Etiam placerat, nulla ut feugiat tincidunt, libero tellus aliquet nisl, sed porta dui velit at nibh.\s
      Sed vitae dui vestibulum, mollis elit vel, euismod risus.
      Ut a massa volutpat quam hendrerit hendrerit et sed lacus.
      Integer convallis at tellus aliquam sodales.
      Curabitur vitae orci vitae ex aliquam iaculis.
      Vivamus efficitur imperdiet luctus.
      Mauris egestas turpis dolor, feugiat vehicula lectus ultrices id.
      Morbi vehicula est lorem, et pretium metus fringilla a.
      Curabitur et justo vel nisl porta ullamcorper eu et enim.
      Aliquam euismod tortor at nibh placerat, tristique eleifend purus tincidunt.
      """;

    // Objeto que escribe datos en un archivo
    PrintStream ps = new PrintStream(filePath);
    ps.print(lorem);
    ps.flush();
    ps.close();
    System.out.println("El archivo fue creado en la ruta: (" + filePath + ")");
  }

  // Lectura de esos archivos planos
  private void leerArchivo() throws IOException {

    // 3 Objetos que componen el canal de entrada
    // Noob --> Tres objetos almacenados en la memoria
    /*FileInputStream conectorArchivo = new FileInputStream(this.filePath);
    InputStreamReader interprete = new InputStreamReader(conectorArchivo);
    BufferedReader impresor = new BufferedReader(interprete);*/

    // Pro -> 1 Objeto en la memoria compuesto por otros dos (anonimos --> No tienen posicion de memoria)

    BufferedReader impresorDos = new BufferedReader(
      new InputStreamReader(
        new FileInputStream(
          this.filePath
        )
      )
    );

    // Almacene cada linea del archivo
    StringBuilder armador = new StringBuilder();
    String linea = "";

    // Ciclo (while)
    while ((linea = impresorDos.readLine()) != null) {
      armador.append(linea).append("\n");
    }

    System.out.println(armador);

  }


}
