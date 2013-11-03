package com.board.web;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.model.ProcessorPerformance;

public class AddDataRequest extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		String date;

		if (request.getParameter("inp_date").isEmpty()) {
			date = dateFormat.format(new Date()).toString().trim();
		} else {
			date = request.getParameter("inp_date").trim();
		}

		String s = date;
		s += (";" + request.getParameter("inp_hw")).trim(); // get from FORM
															// HotWawter
		s += (";" + request.getParameter("inp_cw")).trim(); // get from FORM
															// ColdWawter
		s += (";" + request.getParameter("inp_elec")).trim(); // get from FORM
																// Electricity
		ProcessorPerformance.writeData(s);

		request.setAttribute("resultofInsert", "inserted");
		RequestDispatcher rq = request.getRequestDispatcher("insertdata.jsp");
		rq.forward(request, response);

	}

}
