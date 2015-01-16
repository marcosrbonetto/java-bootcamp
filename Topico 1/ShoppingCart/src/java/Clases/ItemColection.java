/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import java.util.ArrayList;

/**
 *
 * @author Tomas
 */
public class ItemColection
{
    private int idTransaccion;
    private ArrayList<Item> coleccion;
    
    
    public ItemColection()
    {
        coleccion = new ArrayList<Item>();
        this.idTransaccion=TransactionSingleton.getNextTransactionId();
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }
    
    

    public void addItem(Item a)
    {
        coleccion.add(a);
    }

    public String allItems()
    {
        String cadena="Empty Products List";
        if(coleccion.isEmpty()!=true)
        {cadena="";
            for(int i=0; i<coleccion.size(); i++)
            {
                cadena+=(coleccion.get(i)).toString();
            }
        }
        return cadena;
    }

    public float getMonto()
    {   float x=0.0f;
        float amount=0.0f;
        for(int i=0; i<coleccion.size(); i++)
            {
                x=coleccion.get(i).getPrice();
                amount+=x;
            }
        return amount;
    }
    
    public int tamañoColeccion()
    {
        return coleccion.size();
    }

    public float getMinor()
    {
    //Encontrar el menor segun el precio  
      float min=0.0f;
      for (int i = 0; i < coleccion.size(); i++) 
      {
          if(i==0){min=coleccion.get(i).getPrice();}
          
          if (coleccion.get(i).getPrice() < min) 
          {
              min = coleccion.get(i).getPrice();
          }
      }

      return min;
      
    }
    
    public float getMayor()
    {
      //Encontrar el mayor segun el precio 
      float max=0.0f;
      for (int i = 0; i < coleccion.size(); i++) 
      {
          if(i==0){max=coleccion.get(i).getPrice();}
          
          if (coleccion.get(i).getPrice() < max) 
          {
              max = coleccion.get(i).getPrice();
          }
      }
      return max;
   
    }
    
    public ArrayList coleccion()
    {
        return this.coleccion;
    }

}
