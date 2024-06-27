package com.practices;


public class Alumno {
    // creacion de atributos
    // este es el molde la plantilla donde vamos apasar por este mismo diferentes objetos
    // que caracteristicas tiene esta clase 

    int id;
    String nombre;
    String apellido;
    
    // constructuroes y metodos para una clase 
    // los metodos que acciones va tener este objeto o clase
    // infinive verbs to metho


    public Alumno() {
    }
    
     // permiten la creacion de objetos nos permiter atravez de ellos tener la plantilla para poder crearlos
    // no retorna 

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
   
    


    // CREACION DE CONSTRUC
    // modificador de acceso
    // tipo de dato en caso que devuelva un valor 
    // void reaciliza un procesimiento mas no me retorna algo es un PROCEDIMIENTO
    public void mostrarNombre(){
        System.out.println("hola soy un alumno y se decir mi nombre");
    }
    // podemos crear un alumno y pueda decir esto
    public void saberAprobado(double calificacion){
        // tiene como parametro dado que lo necesita para saber que si esta o no
        if (calificacion >= 6) {
            System.out.println("estoy aprobado");
        }else{
            System.out.println("no estoy abrobado");
        }

    }
    // Tenemos metodos espeaciales que nos permite crear objetos de tipo alumno atra vez de estos metodos llamados contructores
    // Como creo los objetos 
   


    //cREACION DE CONTRUCTORES VACIOS



}
