package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Search")
public class Search extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String search = request.getParameter("search");
		if (search.equals("�ż���")) {
			response.sendRedirect("pages/Angelica.html");
			System.out.println(search);
		}else if(search.equals("��Ÿ����")){
			response.sendRedirect("pages/full-width.html");
			System.out.println(search);
		}else if(search.equals("�θ�")){
			response.sendRedirect("pages/Araliaelata.html");
			System.out.println(search);
		}else if(search.equals("�ƽ��Ķ�Ž�")){
			response.sendRedirect("pages/Asparagus.html");
			System.out.println(search);
		}else if(search.equals("�ᳪ��")){
			response.sendRedirect("pages/sidebar-right.html");
			System.out.println(search);
		}else if(search.equals("����")){
			response.sendRedirect("pages/basic-grid.html");
			System.out.println(search);
		}else if(search.equals("����")){
			response.sendRedirect("pages/Chives.html");
			System.out.println(search);
		}else if(search.equals("������")){
			response.sendRedirect("pages/corn.html");
			System.out.println(search);
		}else if(search.equals("��ȭ��")){
			response.sendRedirect("pages/Fig.html");
			System.out.println(search);
		}else if(search.equals("��")){
			response.sendRedirect("pages/Greenonion.html");
			System.out.println(search);
		}else if(search.equals("����")){
			response.sendRedirect("pages/Lettuce.html");
			System.out.println(search);
		}else if(search.equals("����")){
			response.sendRedirect("pages/lotusroot.html");
			System.out.println(search);
		}else if(search.equals("����")){
			response.sendRedirect("pages/Gomchwi.html");
			System.out.println(search);
		}else if(search.equals("û��ä")){
			response.sendRedirect("pages/PakChoi.html");
			System.out.println(search);
		}else if(search.equals("�ϵ���")){
			response.sendRedirect("pages/Pea.html");
			System.out.println(search);
		}else if(search.equals("����")){
			response.sendRedirect("pages/Sweetpotato.html");
			System.out.println(search);
		}else if(search.equals("�丶��")){
			response.sendRedirect("pages/width.html");
			System.out.println(search);
		}else if(search.equals("����")){
			response.sendRedirect("pages/sidebar-left.html");
			System.out.println(search);
		}else if(search.equals("ȣ��")){
			response.sendRedirect("pages/pumpkin.html");
			System.out.println(search);
		}else if(search.equals("����")){
			response.sendRedirect("pages/grape.html");
			System.out.println(search);
		}else {
			response.sendRedirect("F.html");
		}
	}
}
