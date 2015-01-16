/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Marcos
 */
public class ItemSingleton 
{
    private static int nextId=0;
    private static ItemSingleton idItem;
    
    private ItemSingleton()
    {nextId++;}

    public static int getNextItemId() {
        idItem=new ItemSingleton();
        return nextId;
    }
    
}
