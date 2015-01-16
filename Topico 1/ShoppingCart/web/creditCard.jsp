<%-- 
    Document   : creditCard
    Created on : 16/01/2015, 02:57:57
    Author     : Tomas
--%>

<%@page import="Clases.ItemColection"%>
<%@page import="Clases.Item"%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%!
    private String tabla (HttpServletRequest request)
    {
        //tomo la variable varColeccion de la sesion y la casteo a ArrayList
        ItemColection coleccion= (ItemColection) request.getSession().getAttribute("varColeccion");
        float monto = coleccion.getMonto();
    
        
        String auxiliar="No hay observaciones cargadas";
        
        if(coleccion!=null)
        {
           
            monto = monto-(monto * 10 / 100);
            
            auxiliar="<td>New mount</td></tr>";
            auxiliar+="<tr><td>"+ monto +"</td></tr>";
           coleccion=null;
        }
        return auxiliar;
    }

%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Credit Card Payment</title>
    </head>
    <body>
           <table>
                <thead>
                    <tr>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Name: </td>
                        <td><input type="text" name="name" value="" /></td>
                    </tr>
                    <tr>
                        <td>Credit Card Number: </td>
                        <td><input type="text" name="name" value="" /></td>
                    </tr>
                        <a href="transaccionRealizada.jsp" </a><b>MAKE TRANSACTION</b>

                </tbody>
            </table>
            <%
                ArrayList errores= (ArrayList) request.getAttribute("varErrores");
                if(errores!=null)
                {
                    for (int i = 0; i < errores.size(); i++)
                    {
                      out.print("<li>"+errores.get(i)+"<li>");
                    }
                }
            %>
    </body>
</html>
