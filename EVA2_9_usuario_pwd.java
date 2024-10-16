/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_9_usuario_pwd;

import java.util.Scanner;

/**
 *
 * @author elfor
 */
public class EVA2_9_usuario_pwd {

    public static void main(String[] args) {
        
        Scanner captu = new Scanner(System.in);
        final String USER = "Admin";
        final String CONTRA = "Admin";
        String usu, cont;
        
        do{
           System.out.println("Usuario:");
        usu = captu.nextLine();
        
        System.out.println("Contrasenia:");
        cont = captu.nextLine();
            
        }while(!usu.equals(USER)&&!cont.equals(CONTRA));
        
        System.out.println("Acceso consedido");
        
        
        
    }
}
