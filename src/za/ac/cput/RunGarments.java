/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput;

/**
 *
 * @author GRP
 */
public class RunGarments {
    public static void main(String[] args) 
    {
        System.out.println("--------GARMENTS----------");
        System.out.println("==========================");
        Garments gar= new Garments("Lace", "Rose Gold", 5, true);
        System.out.println(gar.toString());
        System.out.println("==========================");
        
        Gown gow= new Gown("Lace", "Rose Gold", 5, true,10);
        System.out.println(gow.toString());
        System.out.println("==========================");
        
    }
    
}
