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
public class Gown extends Garments 
{
    private int size;

    public Gown(String material, String color, int amount, boolean isClientPleased,int size)
    {
        super (material, color,amount,isClientPleased);
        this.size = size;
    }
    
    public String toString()
    {
      //  String str= super.toString();
         return String.format("Size:   %s", size);
        
    }
}
