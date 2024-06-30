package com.clasesabtractas;

public abstract class Figura {
    protected double x;
    protected double y;

    protected Figura(){
    }

    // metodo abtracto porque el metodo calcular area se hace diferente en cada una de sus hijas
    // solo se declara este metodo existe pero no se pose la implementacion es to que significa que sus hijas lo implementaran como quieran
   
    // sus hijas van a ser instanciadas

    protected  Figura(double x, double  y){
        this.x = x;
        this.y = y;
    }
    public abstract double calcularArea();
}
