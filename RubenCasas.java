/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author casmarru
 */
import java.util.Scanner;

public class Ordenar {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String ordenada = "";// la cadena en la que se va a escribir el String ya ordenado
        
        System.out.println("Introduce las palabras para ordenar");
            String ordenar = tc.nextLine();// El string que hay que ordenar
            
        ordenar = ordenar.trim(); // Elimina los espacios del principio y el final
        ordenar = ordenar.replaceAll("\\s+", " ");// Elimina todos los espacios sobrantes
        
        String[] comprobar = ordenar.split(" ");//Crea el array tomando como valores loe elementos separados por espacios
        
        for (int i = 0; i < (comprobar.length - 1); i++) {
            for (int j = i + 1; j > 0; j--) {
                if (comprobar[j].toLowerCase().charAt(0) < comprobar[j - 1].toLowerCase().charAt(0)) { //Esto es para que compare en igualdad
                    //Si el caracter inicial es menor que el segundo cambia el orden dentro del array
                    String Temp = comprobar[j - 1];
                    comprobar[j - 1] = comprobar[j];
                    comprobar[j] = Temp;
                }
            }
        }
        
        // Tras recolocar todo el array se escribe en una cadena para imprimirla
        for (String comprobar1 : comprobar) {
            ordenada += comprobar1 + " ";
        }
        // Imprimir la lista ya ordenada
        System.out.println("La lista ordenada es:");
        System.out.println(ordenada);

    }

}
