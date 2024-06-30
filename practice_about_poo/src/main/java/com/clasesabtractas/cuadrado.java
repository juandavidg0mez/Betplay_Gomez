package com.clasesabtractas;

public class cuadrado extends Figura {

    private  double lado;

    public cuadrado(){
    }

    public cuadrado(double lado, double x , double y){
        super(x, y);
        this.lado = lado;
    }

    // el metodo hace el metodo a su manera
    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

}
