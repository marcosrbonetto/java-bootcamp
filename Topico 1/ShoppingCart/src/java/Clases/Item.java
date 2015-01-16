/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import java.util.Locale;

/**
 *
 * @author Tomas
 */
public class Item
{
    private static int codigo=0;
    private String description;
    private String name;
    private float price;
    private String category;

    public Item(String name, String category, String description, float price)
    {
        codigo++;
        this.description = description;
        this.name = name;
        this.price = price;
        this.category = category;
    }
/*nombre*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

/*Codigo*/
    public static int getCodigo() {
        return codigo;
    }

    public static void setCodigo(int codigo) {
        Item.codigo = codigo;
    }
    
/*Descripcion*/
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }
/*categoria*/
    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "\nName: "+name+"\nCategory: "+category+"\nDescription: "+description+"\nPrice: "+price;
    }

}
