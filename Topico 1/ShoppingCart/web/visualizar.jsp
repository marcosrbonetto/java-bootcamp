
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
        float monto = coleccion.getMonto();
        
        String auxiliar="No hay observaciones cargadas";
        if(coleccion!=null)

        {
            auxiliar="<tr><td>Codigo</td><td>Description</td><td>Product</td><td>Price</td><td>Category</td><td>Monto</td></tr>";
            
            //recorro el carrito
            for(int i=0; i< coleccion.tamañoColeccion(); i++)

            {
                Item item = (Item)coleccion.coleccion().get(i);
                auxiliar+="<tr><td>"+ item.getCodigo() +"</td><td>"+ item.getDescription() +"</td><td>"+ item.getName() +"</td><td>"+ item.getPrice()+"</td><td>"+ item.getCategory()+"</td><td>"+ monto+"</td></tr>";
            }
        }
        return auxiliar;
    }

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Loaded Products</h1>
        <table border="1">
        <%=tabla(request)%>
        </table>

        <a href="comprar.jsp" </a><b>Buy</b>

    </body>
</html>
