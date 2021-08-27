/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput;

/**
 *
 * @author Hilary
 */
public class Garments 
{
    private String material;
    private String color;
    private int amount;
    private boolean isClientPleased;
    
    //parametise the arguments
    public Garments(String material, String color, int amount, boolean isClientPleased)
    {
        this.material= material;
        this.color= color;
        this.amount= amount;
        this.isClientPleased= isClientPleased;
        
        
    }

    @Override
    public String toString() {
        return String.format("Material:   %s\nColor:  %s\nAmount:  %s\t%b\n", material,color,amount,isClientPleased);
        
    }
    
    
}