package com.practices;

public class HerenciaMain {
    public static void main(String[] args) {
        // creacion de un nuevo empleado objeto empleado 
        empleado empl = new  empleado();
        empl.getApellido();
        empl.getCargo();

        Consultor consul = new Consultor();
        consul.getApellido();
        empl.setApellido("gomez");
        System.out.println("mi apelliodo es " + empl.getApellido());
        

    }
}
