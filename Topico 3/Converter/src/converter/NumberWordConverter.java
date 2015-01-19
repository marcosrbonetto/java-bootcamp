/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
class NumberWordConverter implements IStrategyConverter
{

    @Override
    public String convertToWord(String num) 
    { String word="";
        int tam=num.length();
        
        ArrayList<Character> v=new ArrayList<Character>();
        for(int i=0;i<num.length();i++)
        {
            v.add(i, num.charAt(i));
        }
        switch(tam)
        {
            case 1:word=getUnidad(v.get(0));
                    break;
            case 2:word=getDecena(v);
                    break;
            case 3:word=getCentena(v);
                    break;
            case 4:word=getMiles(v);
                    break;
                
        }
        return word;
    }

    @Override
    public int convertToNum(String word) 
    {
        return 0;
    }
    
    public String getUnidad(char n)
    {String word="";
    
    if(n=='1'){word= "one";}
    else if(n=='2'){word= "two";}
    else if(n=='3'){word= "three";}
    else if(n=='4'){word= "four";}
    else if(n=='5'){word= "five";}
    else if(n=='6'){word= "six";}
    else if(n=='7'){word= "seven";}
    else if(n=='8'){word= "eight";}
    else if(n=='9'){word= "nine";}
    else if(n=='0'){word= "zero";}
    return word;
    }
    
    public String getDecena(ArrayList<Character> x)
    {
        String word="";
       
        if(x.get(0)=='1')
        {
            
            System.out.println("xx: "+x.get(1));
            if(x.get(1)=='1'){word="eleven";}
            else if(x.get(1)=='2'){word= "twelve";}
            else if(x.get(1)=='3'){word= "thirteen";}
            else if(x.get(1)=='4'){word= "fourteen";}
            else if(x.get(1)=='5'){word= "fifteen";}
            else if(x.get(1)=='6'){word= "sixteen";}
            else if(x.get(1)=='7'){word= "seventeen";}
            else if(x.get(1)=='8'){word= "eighteen";}
            else if(x.get(1)=='9'){word= "nineteen";}
            else if(x.get(1)=='0'){word= "ten";}
        }
        else if(x.get(0)=='2'){
            String z=getUnidad(x.get(1));
            if(z.equals("zero")){z="";}
            word= "twenty "+z;
        }
        else if(x.get(0)=='3'){
            String z=getUnidad(x.get(1));
            if(z.equals("zero")){z="";}
            word= "thirty "+z;
        }
        else if(x.get(0)=='4'){
            String z=getUnidad(x.get(1));
            if(z.equals("zero")){z="";}
            word= "forty "+z;
        }
        else if(x.get(0)=='5'){
           String z=getUnidad(x.get(1));
            if(z.equals("zero")){z="";}
            word= "fifty "+z;
        }
        else if(x.get(0)=='6'){
            String z=getUnidad(x.get(1));
            if(z.equals("zero")){z="";}
            word= "sixty "+z;
        }
        else if(x.get(0)=='7'){
            String z=getUnidad(x.get(1));
            if(z.equals("zero")){z="";}
            word= "seventy "+z;
        }
        else if(x.get(0)=='8'){
           String z=getUnidad(x.get(1));
            if(z.equals("zero")){z="";}
            word= "eighty "+z;
        }
        else if(x.get(0)=='9'){
           String z=getUnidad(x.get(1));
            if(z.equals("zero")){z="";}
            word= "ninety "+z;
        }
    
        
        return word;
    }
    
    public String getCentena(ArrayList<Character> x)
    {String word="";
    
            String a=getUnidad(x.get(0));
            String c=getDecena(x);
            if(c.equals("zero")){c="";}
            word= a+" hundred "+c;  
        
    return word;}
    
     public String getMiles(ArrayList<Character> x)
    {String word="";
    
        System.out.println("x: "+x.get(0));
        System.out.println("xx: "+x.get(1));
        System.out.println("xxx: "+x.get(2));
       
            String a=getUnidad(x.get(0));
            String c=getDecena(x);
            if(c.equals("zero")){c="";}
            word= a+" hundred "+c;  
        
    return word;}
    
}
