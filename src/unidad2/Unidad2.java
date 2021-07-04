/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

import java.util.Scanner;

/**
 *
 * @author Pavli
 */
public class Unidad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String apellido;
        int edad;
        String hobbie;
        String editor;
        String so;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor ingrese los datos solicitados \nNombre: ");
        nombre=scanner.next();
        System.out.println("Apellido: ");
        apellido=scanner.next();
        System.out.println("Edad: ");
        edad=scanner.nextInt();
        System.out.println("Hobbie: ");
        hobbie=scanner.next();
        System.out.println("Editor de codigo preferido: ");
        editor=scanner.next();
        System.out.println("Sistema operativo ultilizado: ");
        so=scanner.next();
        
        System.out.println("------------------------");
        System.out.println("Los datos ingresados son los siguientes\nNombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad+"\nHobbie: "+hobbie+"\nEditor preferido: "+editor+"\nSistema operativo: "+so);
        System.out.println("------------------------");
        

        
    }
    
}
