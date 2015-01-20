/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter;

import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class Filter 
{
    
    Filter() 
    {
        
    }
    
    public ArrayList<String> doFilter(int fil, String word)
    {ArrayList<String> array=new ArrayList<String>();
        System.out.println("fil: "+fil);
        System.out.println("word: "+word);
    StringBuilder x=new StringBuilder();
    int c=0;
        for (int i = 1; i <= word.length(); i++) 
        {   System.out.println("i: "+i);
            c++;
            System.out.println("c: "+c);
            
             x.append(word.charAt(i-1));
            if(c == fil) 
            {   
               System.out.println("res:"+x.toString());
               array.add(""+x.toString());
               x=new StringBuilder();
               c=0;
               
            }
            if(i==word.length() && c!=fil)
            {
                System.out.println("res:"+x.toString());
               array.add(""+x.toString());
            }
            
            
        }
        return array;
    }
    
}
