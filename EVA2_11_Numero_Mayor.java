/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author elfor
 */
public class EVA2_11_Numero_Mayor {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int num, num2 = 0;
        
        
        while(true){
            System.out.println("Dime un numero");
            num = captu.nextInt();
            captu.nextLine();
            
            if(num2 < num)
                num2 = num;
            
            
            if(num <0)
                break;
            
        }
            System.out.println("El numero mayor es: "+num2);
                
                
                
            
        
        
        
        
    }
}
