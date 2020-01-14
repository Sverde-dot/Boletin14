/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14ex;

/**
 *
 * @author sverdecadilla
 */
public class Boletin14ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConversorTemperaturas obx = new ConversorTemperaturas();
        try{  
        obx.DarCent();
        obx.centigradosAFharenheit();
        obx.centígradosAReamur();
        }catch(TemperaturaErrada e){
            System.out.println(e.getMessage());
        }  
    }  
}
