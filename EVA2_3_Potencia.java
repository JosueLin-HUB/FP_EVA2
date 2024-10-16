/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author elfor
 */
public class EVA2_3_Potencia {

    public static void main(String[] args) {
        int base ,pote;
        Scanner captu = new Scanner(System.in);
        System.out.println("Dime la base");
        base = captu.nextInt();
        captu.nextLine();
        System.out.println("Dime la potencia");
        pote = captu.nextInt();
        captu.nextLine();
        
        int resu = 1;
        
        for(int i=1;i <= pote;i++){
          resu = resu *base;}  
        System.out.println("Resultado = "+resu);
        
        
    }
        
}
