/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_6_pares;

import java.util.Scanner;

/**
 *
 * @author elfor
 */
public class EVA2_6_pares {

    public static void main(String[] args) {
        
        int num1, num2;
        Scanner captu = new Scanner(System.in);
        System.out.println("Inicio");
        num1 = captu.nextInt();
        captu.nextLine();
        System.out.println("Final");
        num2 = captu.nextInt();
        captu.nextLine();
        
        
        for(int i = num1;i<= num2;i++){
           int modulo = i % 2;
           if(modulo != 0)
               continue;
            System.out.println(i+"-");
        }
        System.out.println("");
        
        for(int i = num1;i<= num2;i++){
           int modulo = i % 2;
           if(modulo == 0)
               continue;
            System.out.println(i+"-");
        }

        
        
        
        
        
    }
}
