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