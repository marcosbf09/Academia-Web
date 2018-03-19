/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import CRUDs.CrudAdministrador;
import CRUDs.CrudFornecedor;
import CRUDs.CrudProfessor;
import CRUDs.CrudSecretaria;
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


@WebServlet(name = "ServletFuncionario", urlPatterns = {"/ServletFuncionario"})
public class ServletFuncionario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletFuncionario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletFuncionario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
        //processRequest(request, response);
        String nome, rg, cpf;
        String cnpj, endereco, telefone, nomefantasia, cidade, estado, numero, bairro, email, funcao;
        
        nome = request.getParameter("nome");
        endereco = request.getParameter("endereco");
        telefone = request.getParameter("telefone");
        cidade = request.getParameter("cidade");
        estado = request.getParameter("estado");
        numero = request.getParameter("numero");
        bairro = request.getParameter("bairro");
        email = request.getParameter("email");
        funcao = request.getParameter("funcao");
        rg = request.getParameter("rg");
        cpf = request.getParameter("cpf");
        
        
        if(funcao=="professor"){
        
        CrudProfessor crudp= new CrudProfessor();
        crudp.CadastrarProfessor(nome, endereco, telefone, cidade, estado, numero, bairro, email, rg, cpf);
        }else if(funcao=="secretaria"){
            CrudSecretaria cruds= new CrudSecretaria();
            cruds.CadastrarSecretaria(nome, endereco, telefone, cidade, estado, numero, bairro, email, rg, cpf);
        }else if(funcao=="administrador"){
            CrudAdministrador cruda= new CrudAdministrador();
            cruda.CadastrarAdministrador(nome, endereco, telefone, cidade, estado, numero, bairro, email, rg, cpf);
        }
        
        response.sendRedirect("telacadastro.html");
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
        processRequest(request, response);
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
