package presentacion;
import dominio.*; //Esta clase está en un paquete distinto. Para que haya acceso, es necesario importar las clases de forma directa, como aquí.

import java.util.Scanner;
import java.io.*;

public class InterfazUsuario implements Serializable //Este interfaz tiene que conocer a OficinaPadron. "equalsIgnoreCase" compara dos cadenas, no importando las mayúsculas
{

    private OficinaPadron padron;
    private Scanner sc=new Scanner (System.in);

    public boolean ejecutar(String[] instruccion) {
        if (instruccion.length == 1) {
            if (instruccion[0].equalsIgnoreCase("mostrar")) {
                System.out.println(padron);
            } else if (instruccion[0].equalsIgnoreCase("ayuda")) {
                System.out.println("opciones: \n mostrar \n ayuda \n añadir \n <nombre> <apellido1> <apellido2> \n");
            } else if (instruccion[0].equalsIgnoreCase("salir")) {
                escribirPadron();
                System.out.println("Finalizado con éxito");
            } else {
                System.out.println("Error en la instrucción. Escriba ayuda para más info.");
            }
        } else if (instruccion[0].equalsIgnoreCase("añadir") && instruccion.length == 4) {
            padron.annadir(new Habitante(instruccion[1], instruccion[2], instruccion[3]));
            System.out.println("Habitante añadido correctamente");
        } else {
            System.out.println("Error en la instrucción. Escriba ayuda para más info.");
        }
     return false;

    }

    public String[] leerInstruccion(){
        System.out.print ("?>");
        String linea =sc.nextLine(); //sc es mi objeto Scanner, que sirve para leer teclado y comienza a leer en la siguiente linea.
        return linea.split(" ");

    }

    private void leerPadron() throws IOException {
        ObjectInputStream oi = null; //Estos son los tipos que permiten leer el teclado.
        ObjectOutputStream oo = null;
        try {
            oi=new ObjectInputStream(new FileInputStream("padron.dat"));  //Se escribe el objeto como método de persistencia
            padron=(OficinaPadron)oi.readObject(); //Queremos que el objeto que se cree funcione como un objeto OficinaPadron. Es un cambio de tipos

        }catch (Exception e){
            padron=new OficinaPadron();
        }

    }
    private void escribirPadron(){
        ObjectOutputStream oo; //Estos son los tipos que permiten leer el teclado.
        try {
            oo=new ObjectOutputStream(new FileOutputStream("padron.dat"));
            oo.writeObject(padron);

        }catch (Exception e){
            System.out.println("Error al escribir fichero.");
        }
    }

    public InterfazUsuario() throws IOException {
        leerPadron();

    }


}