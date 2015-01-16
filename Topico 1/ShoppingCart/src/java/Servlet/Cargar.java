/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlet;

import Clases.ItemColection;
import Clases.Item;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 *
 * @author Joze
 */
@WebServlet(name="Cargar", urlPatterns={"/Cargar"})
public class Cargar extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    //Instancia del carrito - Singleton
    ItemColection coleccion = new ItemColection();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            HttpSession session= request.getSession();
            ArrayList errores= new ArrayList();

            String name= request.getParameter("name");
            String category= request.getParameter("category");
            String description = request.getParameter("description");
            String price = request.getParameter("price");

            if(description!=null)
            {
                if(description.equals("")==true ||description.endsWith(" "))
                {
                errores.add("Se necesita una descripcion");
                }
            }
            else
            {
                errores.add("Se necesita una descripcion");
            }

            if(category!=null)
            {
                if(category.equals("")==true)
                {
                errores.add("Se necesita indicar una categoria");
                }
            }
            else
            {
                errores.add("Se necesita indicar una categoria");
            }

            if(name!=null)
            {
                if(name.equals("")==true)
                {
                errores.add("Se necesita indicar un nombre");
                }
            }
            else
            {
                errores.add("Se necesita indicar un nombre");
            }
            
            if(errores.isEmpty()!=true)
            {
                request.setAttribute("varErrores", errores);
                getServletContext().getRequestDispatcher("/cargar.jsp").forward(request, response);
            }
            else
            {
                float pr=Float.parseFloat(price);
                Item nueva= new Item(name,category,description,pr);
                coleccion.addItem(nueva);
                
                //la sesion adquirira una variable llamada varColeccion de tipo coleccionProducts(ArrayList)
                session.setAttribute("varColeccion", coleccion);
                
                out.println("<html>");
                out.println("<head><title>Producto Añadido al Carrito </title></head>");
                out.println("<body>");
                out.println("<h1>Se cargo el producto exitosamente! </h1>"
                        + ""
                        + "");
                out.println("<a href=\"cargar.jsp\" </a><b>Insert again</b>\n" +
                            "        </h1>\n" +
                            "        <h1>\n" +
                            "        <a href=\"menu.jsp\" </a><b>Back</b></body></html>");
                
                JOptionPane.showMessageDialog(null, "Succesfully inserted product");
                
                getServletContext().getRequestDispatcher("/menu.jsp").forward(request, response);//Esta linea nose que hace

            }


        } 
        finally
        {
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
     } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
