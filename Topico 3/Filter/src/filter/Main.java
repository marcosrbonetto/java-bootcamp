/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class Main {

    
    public static void main(String[] args) 
    {int filtro=0;
    String word="";
        try{
        filtro=Integer.parseInt(JOptionPane.showInputDialog("Insert Filter: "));
        word=JOptionPane.showInputDialog("Insert Word: ");
        }catch(Exception e){}
        
        Filter fil=new Filter();
        String result = "";
        ArrayList a=fil.doFilter(filtro,word);
        
        for (int i = 0; i < a.size(); i++) 
        {
            result+=", "+a.get(i);
        }
       JOptionPane.showMessageDialog(null, "Resultado "+result+".");
    }
    
}
