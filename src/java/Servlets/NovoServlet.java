/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import CRUDs.CrudAluno;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marcos
 */


@WebServlet(name = "NovoServlet", urlPatterns = {"/NovoServlet"})
public class NovoServlet extends HttpServlet {


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
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                String nome, datanasc, endereco;
                String rg, cpf, telefone, peso, altura, email, cidade, estado;
                
                nome = request.getParameter("nome");
                datanasc = request.getParameter("datanasc");
                endereco = request.getParameter("endereco");
                rg = request.getParameter("rg");
                cpf = request.getParameter("cpf");
                telefone = request.getParameter("telefone");
                peso = request.getParameter("peso");
                altura = request.getParameter("altura");
                email = request.getParameter("email");
                estado= request.getParameter("estado");
                cidade=request.getParameter("cidade");
                

                
                CrudAluno crudaluno = new CrudAluno();
                crudaluno.CadastrarAluno(nome, datanasc, endereco, rg, cpf, telefone, peso, altura, email, estado, cidade);

                response.sendRedirect("telacadastro.html");
        

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
