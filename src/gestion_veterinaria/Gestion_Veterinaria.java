/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestion_veterinaria;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author USUARIO
 */
public class Gestion_Veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Veterinaria miVeterinaria = new Veterinaria();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            try { 
                System.out.println("\n--- SISTEMA VETERINARIA ---");
                System.out.println("1. Registrar Mascota (Nombre y Edad)");
                System.out.println("2. Registrar Mascota (Solo Nombre)");
                System.out.println("3. Listar Mascotas");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opcion: ");
                
                opcion = sc.nextInt();
                sc.nextLine(); 

                switch (opcion) {
                    case 1:
                        System.out.print("Nombre: ");
                        String n = sc.nextLine();
                        System.out.print("Edad: ");
                        int e = sc.nextInt();
                        miVeterinaria.registrarMascota(n, e); 
                        break;
                    case 2:
                        System.out.print("Nombre: ");
                        String nom = sc.nextLine();
                        miVeterinaria.registrarMascota(nom); 
                        break;
                    case 3:
                        miVeterinaria.mostrarMascotas();
                        break;
                }
            } catch (InputMismatchException e) {
                System.err.println("ERROR: DEBE INGRESAR UN NUMERO ENTERO");
                sc.nextLine(); 
            } catch (Exception e) {
                System.err.println("Ocurrio un error inesperado: " + e.getMessage());
            }
        } while (opcion != 4);
    }
}
