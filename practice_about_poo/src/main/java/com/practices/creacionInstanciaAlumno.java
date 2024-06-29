package com.practices;

public class creacionInstanciaAlumno {
    public static void main(String[] args) {
        Alumno alul = new Alumno(1, "juan", "gomez");
        Alumno Alul2 = new Alumno();
        // desde la instancia u objeto puedo acceder a los metodos que sean publicos de este objeto 
        // podemos utilizarlo en una variable

        // int id = alul.getId();
        System.out.println("el ID del alumno 2 es: " +  alul.getId());
        System.out.println("nombre es : " + alul.getNombre());
        System.out.println("el apellido del alumno es : " + alul.getApellido());

        // ahora que hacemos con nuestro alumno vacio queremos asignater setearlos
        // con esto puedo hacer un scanner para poder recibir los datos del Usuario e implimirlos entocnes aja.

        // pero el Setters tambien sirven para modificar.
        Alul2.setId(8);
        Alul2.setNombre("Pedro");
        Alul2.setApellido("Gomez");
        
        System.out.println("-----------------------------------------");

        System.out.println("el ID del alumno 2 es: " +  Alul2.getId());
        System.out.println("nombre es : " + Alul2.getNombre());
        System.out.println("el apellido del alumno es : " + Alul2.getApellido());

        System.out.println("-----------------------------------------");
        // Modificacion por medio del metodo Set

        alul.setId(4);
        System.out.println("Modifificacion del ID por medio del metodo SET ");
        System.out.println("el ID del alumno 2 es: " +  alul.getId());
        System.out.println("nombre es : " + alul.getNombre());
        System.out.println("el apellido del alumno es : " + alul.getApellido());

        
        
    }



    
}
