/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author elfor
 */
public class EVA2_2_promedio {

    public static void main(String[] args) {
        int califa, sumas;
        Scanner captu = new Scanner(System.in);
        //iniciar el acumulador
        sumas = 0;
        
        
        for(int i = 1;i <=10;i++){
            System.out.println("Estudiante #"+ i);
        System.out.println("Cual es tu calificacion");
        califa = captu.nextInt();
        captu.nextLine();
        //Acumular las calificaciones
        sumas = sumas + califa;
        }
        double promedio=sumas / 10;
        System.out.println("Sumas =" + sumas);
        System.out.println("Promedio = "+ promedio);
        
       
        
        
        
        
        
    }
}
