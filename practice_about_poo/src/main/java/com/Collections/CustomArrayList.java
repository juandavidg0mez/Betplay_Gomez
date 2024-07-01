package com.Collections;

import java.util.ArrayList;
import java.util.List;

import com.practices.persona;

public class CustomArrayList {
    public static void main(String[] args) {
        // persona perso = new persona(0, null, null, null, null, null);
        List<persona> lista = new ArrayList<>();
        // Ensure that the persona constructor is called with the correct number of arguments
        lista.add(new persona(1, "12333", "John Doe", "Gomez", "bogota", "3115818090"));
        lista.add(new persona(2, "12333", "Monda", "Gomez", "bogota", "3115818090"));
        lista.add(new persona(3, "12333", "Hamoyo", "Gomez", "bogota", "3115818090"));
        lista.add(new persona(4, "12333", "Popotter", "Gomez", "bogota", "3115818090"));

        // dos formas de recorrer la lista, recorrer por intice

        for(int i = 0; i< lista.size(); i++){
            System.out.println(lista.get(i).getNombre());
        }
        System.out.println("Impresiones por ForEache");
        
        for (persona perso: lista) {
            System.out.println(perso.getNombre());
        }
    
    }
}
