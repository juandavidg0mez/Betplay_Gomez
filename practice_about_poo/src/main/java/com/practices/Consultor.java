package com.practices;

public class Consultor extends persona {
    // Ya se establecio una relacion entre la calse persona y la clase consultor dato que es una Extencion algo que ereda los parametros del mismo pero como todo hijo puede salir con unos nuevos.
    String nombre_consultora;
    int num_consultor;


    public  Consultor(){
    }

    public Consultor(String nombre_consultora, int  num_consultor,int id, String dni, String nombre, String  apellido, String domicilio, String telefono ){
        super(id , dni, nombre, apellido, domicilio, telefono);
        this.nombre_consultora = nombre_consultora;
        this.num_consultor = num_consultor;
    }

    public String getNombre_consultora(){
        return  nombre_consultora;
    }
    public void setNombre_consultor(String nombre_consultora){
        this.nombre_consultora = nombre_consultora;
    }

    public int getNum_consultor(){
        return num_consultor;
    }

    public void setNum_consultor(int  num_consultor){
        this.num_consultor = num_consultor;
    }
}
