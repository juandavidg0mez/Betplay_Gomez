package com.poliformismo;
import com.practices.Consultor;
import com.practices.empleado;
import com.practices.persona;

public class herenciaPolimorfismo {
    public static void main(String[] args) {
        // Aca puedo guardar Formas diferentes de la clase persona porque son del mismo tipo, y esto permite que en un vector yo pueda guardas varias formas de esa clase madre.

        persona vector [] = new persona[5];
        vector[0] = new persona();
        vector [1] = new  empleado();
        vector[2]= new  Consultor();
        
        persona perso = new persona();
        //Consultor consul = new Consultor();
        perso.setNombre("monda");
        // perso = consul;
        // Puedo asiganar los hijos a los padre pero no los padre a los hijos.


    }
}
