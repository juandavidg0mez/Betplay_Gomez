package com.practices;

public class empleado extends persona {

    // principios de la programcion Orientada a Objetos
    /*
     * HERENCIA :
     * Hay clases que comparten gran parte de sus carcteristicas en este caso los
     * atributos, tambien estas herencias son como hijos y padres.
     * 
     * 
     */
    int num_legajo;
    String cargo;
    double sueldo;

    public empleado() {
    }

    public empleado(int num_legajo, String cargo, Double sueldo, int id, String dni, String nombre, String  apellido, String domicilio, String telefono){
        super(id , dni, nombre, apellido, domicilio, telefono);
        this.num_legajo = num_legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    // creacion de GET AND SET para los atributos de la clase empleado.
    public int getNum_legajo(){
        return num_legajo;
    }

    public void setNum_legajo(int num_legajo){
        this.num_legajo = num_legajo;
    }

    public String getCargo(){
        return  cargo;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public Double getSueldo(){
        return sueldo;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

}
