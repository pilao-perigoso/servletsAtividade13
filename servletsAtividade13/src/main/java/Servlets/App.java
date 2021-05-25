package main.java.Servlets;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.Classes.Livro;

@WebServlet("listalivros")
public class App extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		List<Livro> livros = new LinkedList<Livro>();
		
		Livro l1 = new Livro("No Game No Life", "Yuu Kamiya", 2012);
		Livro l2 = new Livro("O Homem de Giz", "C.J. Tudor", 2018);
		Livro l3 = new Livro("Ladrão de Casaca", "Maurice Lebranc", 1907);
		
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
		
		request.setAttribute("livros", livros);
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp"); 
		dispatcher.forward(request, response);	
	}
}