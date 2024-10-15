/**
* Padrón serializado.
*Al ser el título obligatorio, si es nulo o vacío se lanzará
* una excepción.
* * @param titulo Padrón.
* @throws IllegalArgumentException Si titulo es null, está vacío o contiene sólo espacios.
*/package aplicacion;

import presentacion.InterfazUsuario;

import java.io.IOException;

public class Principal{
    public static void main(String[] args) throws IOException {
        String[] instr;
        //boolean continuar; --> Otra forma
        InterfazUsuario iu=new InterfazUsuario();
        do{
            instr=iu.leerInstruccion();
        }while(iu.ejecutar(instr));
        //}while(continuar) --> La otra forma

    }
}