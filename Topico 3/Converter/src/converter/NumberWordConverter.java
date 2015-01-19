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
        System.out.println("Numero: "+num);
        switch(tam)
        {
            case 1:word=getUnidad(num.charAt(0));
                    break;
            case 2:word=getDecena(num);
                    break;
            case 3:word=getCentena(num);
                    break;
            case 5:word=getMiles(num);
                    break;
            case 6:word=getDecenaMiles(num);
                    break;
            case 7:word=getCentenaMiles(num);
                    break;
            case 9:word=getMillon(num);
                    break;
            case 10:word=getDecenaMillon(num);
                    break;
            case 11:word=getCentenaMillon(num);
                    break;
            default: System.out.println("Error");
                
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
    System.out.println("Entra a Unidad:" +n);
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
    
    public String getDecena(String x)
    {
        String word="";
        System.out.println("Entra a Decena:" +x);
        if(x.charAt(0)=='1')
        {
            if(x.charAt(1)=='1'){word="eleven";}
            else if(x.charAt(1)=='2'){word= "twelve";}
            else if(x.charAt(1)=='3'){word= "thirteen";}
            else if(x.charAt(1)=='4'){word= "fourteen";}
            else if(x.charAt(1)=='5'){word= "fifteen";}
            else if(x.charAt(1)=='6'){word= "sixteen";}
            else if(x.charAt(1)=='7'){word= "seventeen";}
            else if(x.charAt(1)=='8'){word= "eighteen";}
            else if(x.charAt(1)=='9'){word= "nineteen";}
            else if(x.charAt(1)=='0'){word= "ten";}
        }
        else if(x.charAt(0)=='2'){
            String z=getUnidad(x.charAt(1));
            if(z.equals("zero")){word= "twenty";}
            word= "twenty-"+z;
        }
        else if(x.charAt(0)=='3'){
            String z=getUnidad(x.charAt(1));
            if(z.equals("zero"))
            {word= "thirty";}
            else
            {word= "thirty-"+z;}
        }
        else if(x.charAt(0)=='4'){
            String z=getUnidad(x.charAt(1));
            if(z.equals("zero")){word= "forty";}
            else
            {word= "forty-"+z;}
        }
        else if(x.charAt(0)=='5'){
           String z=getUnidad(x.charAt(1));
            if(z.equals("zero")){word= "fifty";}
            else
            {word= "fifty-"+z;}
        }
        else if(x.charAt(0)=='6'){
            String z=getUnidad(x.charAt(1));
            if(z.equals("zero")){word= "sixty";}
            else
            {word= "sixty-"+z;}
        }
        else if(x.charAt(0)=='7'){
            String z=getUnidad(x.charAt(1));
            if(z.equals("zero")){word= "seventy";}
            else
            {word= "seventy-"+z;}
        }
        else if(x.charAt(0)=='8'){
           String z=getUnidad(x.charAt(1));
            if(z.equals("zero")){word= "eighty";}
            else
            {word= "eighty-"+z;}
        }
        else if(x.charAt(0)=='9'){
           String z=getUnidad(x.charAt(1));
            if(z.equals("zero")){word= "ninety";}
            else
            { word= "ninety-"+z;}
        }
    
        
        return word;
    }
    
    public String getCentena(String x)
    {String word="";
        StringBuilder sb=new StringBuilder();
        sb.append(x.charAt(1));
        sb.append(x.charAt(2));
        System.out.println("Entra a Centena:" +x);
            String a=getUnidad(x.charAt(0));
            String c=getDecena(sb.toString());
            if(c.equals("zero"))
            {
                word= a+" hundred "; 
            }
            else if(a.equals("zero"))
            {
                word= c;
            }
            else 
            {
                word=a+" hundred "+c;
            }
             
        
    return word;}
    
     public String getMiles(String x)
    {String word="";
    System.out.println("Entra a Miles:" +x);
    
            StringBuilder sb=new StringBuilder();
            sb.append(x.charAt(2));
            sb.append(x.charAt(3));
            sb.append(x.charAt(4));

            String a=getUnidad(x.charAt(0));
            String c=getCentena(sb.toString());
            if(c.equals("zero")){c="";}
            word= a+" thousand "+c;  
        
    return word;}
     
     public String getDecenaMiles(String x)
    {String word="";
    System.out.println("Entra a DecenaMiles:" +x);
    
            StringBuilder sb=new StringBuilder();
            sb.append(x.charAt(0));
            sb.append(x.charAt(1));
            StringBuilder sb2=new StringBuilder();
            sb2.append(x.charAt(3));
            sb2.append(x.charAt(4));
            sb2.append(x.charAt(5));
            
            String a=getDecena(sb.toString());
            String c=getCentena(sb2.toString());
            if(c.equals("zero")){c="";}
            word= a+" thousand "+c;  
        
    return word;}
     
     public String getCentenaMiles(String x)
    {String word="";
    System.out.println("Entra a CentenaMiles:" +x);
    
            StringBuilder sb=new StringBuilder();
            sb.append(x.charAt(0));
            sb.append(x.charAt(1));
            sb.append(x.charAt(2));
            StringBuilder sb2=new StringBuilder();
            sb2.append(x.charAt(4));
            sb2.append(x.charAt(5));
            sb2.append(x.charAt(6));
            
            String a=getCentena(sb.toString());
            String c=getCentena(sb2.toString());
            if(c.equals("zero")){c="";}
            word= a+" thousand "+c;  
        
    return word;}
     
      public String getMillon(String x)
    {String word="";
    System.out.println("Entra a Millon:" +x);
    
            StringBuilder sb=new StringBuilder();
            sb.append(x.charAt(2));
            sb.append(x.charAt(3));
            sb.append(x.charAt(4));
            sb.append('.');
            sb.append(x.charAt(6));
            sb.append(x.charAt(7));
            sb.append(x.charAt(8));
            
            String a=getUnidad(x.charAt(0));
            String c=getCentenaMiles(sb.toString());
            if(c.equals("zero")){c="";}
            word= a+" Million "+c;  
        
    return word;}
      
      public String getDecenaMillon(String x)
    {String word="";
    System.out.println("Entra a DecenaMillon:" +x);
    
            StringBuilder sb=new StringBuilder();
            sb.append(x.charAt(0));
            sb.append(x.charAt(1));
            StringBuilder sb2=new StringBuilder();
            sb2.append(x.charAt(3));
            sb2.append(x.charAt(4));
            sb2.append(x.charAt(5));
            sb2.append('.');
            sb2.append(x.charAt(7));
            sb2.append(x.charAt(8));
            sb2.append(x.charAt(9));
            
            String a=getDecena(sb.toString());
            String c=getCentenaMiles(sb2.toString());
            if(c.equals("zero")){c="";}
            word= a+" Million "+c;  
        
    return word;}
      
      public String getCentenaMillon(String x)
    {String word="";
    System.out.println("Entra a DecenaMillon:" +x);
    
            StringBuilder sb=new StringBuilder();
            sb.append(x.charAt(0));
            sb.append(x.charAt(1));
            sb.append(x.charAt(2));
            StringBuilder sb2=new StringBuilder();
            sb2.append(x.charAt(4));
            sb2.append(x.charAt(5));
            sb2.append(x.charAt(6));
            sb2.append('.');
            sb2.append(x.charAt(8));
            sb2.append(x.charAt(9));
            sb2.append(x.charAt(10));
            
            String a=getCentena(sb.toString());
            String c=getCentenaMiles(sb2.toString());
            if(c.equals("zero")){c="";}
            word= a+" Million "+c;  
        
    return word;}
    
}
