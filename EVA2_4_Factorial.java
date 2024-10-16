/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author elfor
 */
public class EVA2_4_Factorial {

    public static void main(String[] args) {
        int num;
        Scanner captu = new Scanner(System.in);
        System.out.println("Dime el numero");
        num = captu.nextInt();
        captu.nextLine();
        
        int resu = 1;
        
        for(int i =1;i <= num;i++){
            resu = resu * i;
        }
        System.out.println("El factorial de es = "+resu);
        
        
    }
}
