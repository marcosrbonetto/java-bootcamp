
<%@page import="Clases.ItemColection"%>
<%@page import="Clases.Item"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%!
    private String tabla (HttpServletRequest request)
    {
        //tomo la variable varColeccion de la sesion y la casteo a ArrayList
        ItemColection coleccion= (ItemColection) request.getSession().getAttribute("varColeccion");
       
        
        String auxiliar="No hay observaciones cargadas";
        if(coleccion!=null)
        {
            float monto = coleccion.getMonto();
            auxiliar="<table border='1'><tr><td>Codigo</td><td>Producto</td><td>Description</td><td>Type</td><td>Price</td><td>Monto Acomulado</td></tr>";
            float ac=0.0f;
            //recorro el carrito
            for(int i=0; i< coleccion.tamañoColeccion(); i++)
            { 
                
                Item item = (Item)coleccion.coleccion().get(i);
                ac+=item.getPrice();
                auxiliar+="<tr><td>"+ item.getCodigo() +"</td><td>"+ item.getName() +"</td><td>"+ item.getDescription() +"</td><td>"+ item.getCategory()+"</td><td>"+ item.getPrice()+"</td><td>"+ac+"</td></tr>";
            }
            auxiliar+="<tr><td>TOTAL</td><td></td><td></td><td></td><td></td><td>"+monto+"</td></tr></table><a href='comprar.jsp' </a><b>End purchase and pay</b>";
            coleccion=null;
        }
        return auxiliar;
    }

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping Cart</title>
    </head>
    <body>
        <h1>Cart Items</h1>
        
        <%=tabla(request)%>
        
    </body>
</html>
