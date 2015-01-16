<%-- 
    Document   : cargar
    Created on : 11-jun-2011, 15:56:29
    Author     : Marcos
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert product</title>
    </head>
    <body>
        <h1>Product Insertion</h1>
        <form name="cargar" action="Cargar" metho ="POST">
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
                        <td><input type="text" name="name" value="a" /></td>
                    </tr>
                    <tr>
                        <td>Category:</td>
                        <td><select name="category" size="4">
                                <option>Music</option>
                                <option>Sport</option>
                                <option>Computer</option>
                                <option>Cars</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>Description: </td>
                        <td><input type="text" name="description" value="a" /></td>
                    </tr>
                    <tr>
                        <td>Price:</td>
                        <td><input type="text" name="price" value="100" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Guardar" name="guardar" /></td>
                    </tr>
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
        </form>

    </body>
</html>
