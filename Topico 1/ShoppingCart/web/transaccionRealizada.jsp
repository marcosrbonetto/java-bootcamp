<%-- 
    Document   : transaccionRealizada
    Created on : 16/01/2015, 03:01:09
    Author     : Tomas
--%>

<%@page import="Clases.Mail"%>

<%@page import="javax.mail.MessagingException"%>
<%@page import="javax.mail.Transport"%>
<%@page import="javax.mail.internet.MimeMessage"%>
<%@page import="javax.mail.internet.InternetAddress"%>
<%@page import="javax.mail.Message"%>
<%@page import="javax.mail.Session"%>
<%@page import="java.util.Properties"%>
<%@page import="Clases.ItemColection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
    private String tabla (HttpServletRequest request)
    {
        //tomo la variable varColeccion de la sesion y la casteo a ArrayList
        ItemColection coleccion= (ItemColection) request.getSession().getAttribute("varColeccion");
        
        String auxiliar="No hay observaciones cargadas";
        
        if(coleccion!=null)
        {
            int id = coleccion.getIdTransaccion(); 
            auxiliar="Transaction ID: "+id; 
            
            //SEND A E-Mail
            Mail mail=new Mail();
            mail.sendEmail(id, "New Transaction", "Transaction n:"+id+" complete !");
        
        }
        coleccion=null;
        HttpSession session = request.getSession();
        session.setAttribute("varColeccion", "");
        
        return auxiliar;
    }

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Transaction was Succesfully</title>
    </head>
    <body>
        <h1>The transaction was seccesfully a mail to de Administrator was sent</h1>
         <%=tabla(request)%>
         <h1>
        <a href="menu.jsp" </a><b>Back to Menu</b>
        </h1>
    </body>
</html>
