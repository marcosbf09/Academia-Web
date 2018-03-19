/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import CRUDs.CrudFornecedor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marcos
 */



@WebServlet(name = "ServletFornecedor", urlPatterns = {"/ServletFornecedor"})
public class ServletFornecedor extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html");
        //PrintWriter out = response.getWriter();
        String nome;
        String cnpj, endereco, telefone, nomefantasia, cidade, estado, numero, bairro, email;
        
        nome = request.getParameter("nome");
        cnpj = request.getParameter("cnpj");
        endereco = request.getParameter("endereco");
        telefone = request.getParameter("telefone");
        nomefantasia = request.getParameter("nomefantasia");
        cidade = request.getParameter("cidade");
        estado = request.getParameter("estado");
        numero = request.getParameter("numero");
        bairro = request.getParameter("bairro");
        email = request.getParameter("email");
        
        //cnpj = Integer.parseInt(cnpjaux);
        
        CrudFornecedor crudfornecedor = new CrudFornecedor();
        crudfornecedor.CadastrarFornecedor(nome, cnpj, endereco, telefone, nomefantasia, cidade, estado, numero, bairro, email);
        
        response.sendRedirect("home.html");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
