package dominio;
import java.io.Serializable;
import java.util.*;
public class OficinaPadron implements Serializable{
    private ArrayList<Habitante> habitantesPadron = new ArrayList<>();

    public void annadir(Habitante habitante){
        habitantesPadron.add(habitante);
    }

    public ArrayList getHabitantesPadron(){
        return habitantesPadron;
    }
    public int calcularNumeroHabitantes(){
        int suma = 0;
        for(Habitante habitante : habitantesPadron){
            suma++;
        }
        return suma;
    }

    public String toString(){
        String cad="";
        for (Habitante h : habitantesPadron){
            cad+=h+"\n";}
        //Aquí concatenamos un int con un string. Java, de forma automática, hace las conversiones oportunas
        cad+="Total de habitantes: "+calcularNumeroHabitantes()+"\n";
        return cad;
    }
}
