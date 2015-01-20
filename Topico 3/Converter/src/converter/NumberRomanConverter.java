/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;
/**
 *
 * @author Marcos
 */
public class NumberRomanConverter implements IStrategyConverter
{

    @Override
    public String convertToWord(String num) 
    {
        String word="";
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
            
          
            default: word="The number is too big..";
                
        }
        return word;
    }
    
    
    public String getUnidad(char n)
    {String word="";
    System.out.println("Entra a Unidad:" +n);
    if(n=='1'){word= "I";}
    else if(n=='2'){word= "II";}
    else if(n=='3'){word= "III";}
    else if(n=='4'){word= "IV";}
    else if(n=='5'){word= "V";}
    else if(n=='6'){word= "VI";}
    else if(n=='7'){word= "VII";}
    else if(n=='8'){word= "VIII";}
    else if(n=='9'){word= "I";}
    else if(n=='0'){word= "";}
    return word;
    }
    
    public String getDecena(String x)
    {
        String word="";
        System.out.println("Entra a Decena:" +x);
        if(x.charAt(0)=='1')
        {
            if(x.charAt(1)=='1'){word="XI";}
            else if(x.charAt(1)=='2'){word= "XII";}
            else if(x.charAt(1)=='3'){word= "XIII";}
            else if(x.charAt(1)=='4'){word= "XIV";}
            else if(x.charAt(1)=='5'){word= "XV";}
            else if(x.charAt(1)=='6'){word= "XVI";}
            else if(x.charAt(1)=='7'){word= "XVII";}
            else if(x.charAt(1)=='8'){word= "XVIII";}
            else if(x.charAt(1)=='9'){word= "XIX";}
            else if(x.charAt(1)=='0'){word= "X";}
        }
        else if(x.charAt(0)=='2'){
            String z=getUnidad(x.charAt(1));
            word= "XX"+z;
        }
        else if(x.charAt(0)=='3'){
            String z=getUnidad(x.charAt(1));
            word= "XXX"+z;
        }
        else if(x.charAt(0)=='4'){
            String z=getUnidad(x.charAt(1));
            word= "XL"+z;
        }
        else if(x.charAt(0)=='5'){
           String z=getUnidad(x.charAt(1));
            word= "L"+z;
        }
        else if(x.charAt(0)=='6'){
            String z=getUnidad(x.charAt(1));
            word= "LX"+z;
        }
        else if(x.charAt(0)=='7'){
            String z=getUnidad(x.charAt(1));
            word= "LXX"+z;
        }
        else if(x.charAt(0)=='8'){
           String z=getUnidad(x.charAt(1));  
            word= "LXXX"+z;
        }
        else if(x.charAt(0)=='9'){
           String z=getUnidad(x.charAt(1));
            word= "XC"+z;
        }
    
        
        return word;
    }
    
    public String getCentena(String x)
    {String word="";
        StringBuilder sb=new StringBuilder();
        sb.append(x.charAt(1));
        sb.append(x.charAt(2));
        System.out.println("Entra a Centena:" +x);
            String a="";
            if(x.charAt(0)=='1'){a="C";}
            else if(x.charAt(0)=='2'){a= "CC";}
            else if(x.charAt(0)=='3'){a= "CCC";}
            else if(x.charAt(0)=='4'){a= "CD";}
            else if(x.charAt(0)=='5'){a= "D";}
            else if(x.charAt(0)=='6'){a= "DC";}
            else if(x.charAt(0)=='7'){a= "DCC";}
            else if(x.charAt(0)=='8'){a= "DCCC";}
            else if(x.charAt(0)=='9'){a= "CM";}
            
            String c=getDecena(sb.toString());
            word=a+c;
            
             
        
    return word;}
    
     public String getMiles(String x)
    {String word="";
    System.out.println("Entra a Miles:" +x);
    
            StringBuilder sb=new StringBuilder();
            sb.append(x.charAt(2));
            sb.append(x.charAt(3));
            sb.append(x.charAt(4));

            String a="";
            if(x.charAt(0)=='1'){a="M";}
            else if(x.charAt(0)=='2'){a= "MM";}
            else if(x.charAt(0)=='3'){a= "MMM";}
            else if(x.charAt(0)=='4'){a= "|IV";}
            else if(x.charAt(0)=='5'){a= "|V";}
            else if(x.charAt(0)=='6'){a= "|VI";}
            else if(x.charAt(0)=='7'){a= "|VII";}
            else if(x.charAt(0)=='8'){a= "|VIII";}
            else if(x.charAt(0)=='9'){a= "|IX";}
            String c=getCentena(sb.toString());
            word=a+c; 
        
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
            
            word= "|"+a+c;  
        
    return word;}
     
     
     
     
      
     
    

    @Override
    public int convertToNum(String word) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
