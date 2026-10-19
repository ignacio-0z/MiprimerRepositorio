package com.Ercilla;

public record PersonaRegistro(String nombre, String apellido) {
    public String toString() {
        System.out.println("Esta instruccion es inservible");
        return  "%s %s".formatted(nombre, apellido);


    }
}

