package vista;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletRecibe", urlPatterns = {"/ServletRecibe"})
public class ServletRecibe extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try(PrintWriter out=response.getWriter()){
         out.println("WELCOME TO THE SERVLET");
          conectar cc= new conectar();
    Connection cn = cc.conexion();
    if(cn==null)
    {   
        try(PrintWriter outa=response.getWriter()){
         outa.println("IT DIDN'T CONNECT TO THE DB");}
    }
    else
    {
        try(PrintWriter outb=response.getWriter()){
         outb.println("IT CONNECTED TO THE DB, ENJOY IT");}
    }
        }
    }
}