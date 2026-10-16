package com.Ercilla;
import java.util.Scanner;

public class Mensaje {
    public String solicitarDatos(String mensaje){
        System.out.println(mensaje);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }

    public void saludar(String nombre) {
        System.out.printf("Hola %s, binevenido a Java\n", nombre);
    }
}
