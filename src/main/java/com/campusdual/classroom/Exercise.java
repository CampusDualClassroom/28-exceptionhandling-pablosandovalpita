package com.campusdual.classroom;

public class Exercise {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Excepción lanzada y controlada en main");
        } catch (RuntimeException e) {
            System.out.println("Se ha capturado la excepción: " + e.getMessage());
        }
    }
}
