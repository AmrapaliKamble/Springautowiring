package com.bv.serv;

import java.io.IOException;
import java.io.PrintWriter;
/*import java.sql.Date;*/
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bv.handler.ProductDBHandler;
import com.bv.model.Products;


@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String productname = request.getParameter("productname");
		String manufacturername = request.getParameter("manufacturername");
		String price = request.getParameter("price");
		/*Products products = new Products();*/
		/*products.setProductname(productname);
		products.setManufacturername(manufacturername);
		products.setPrice(Double.parseDouble(price));*/
/*		products.setManufactureDate(new java.sql.Date(date.getTime()));
		  SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
          try {
			Date date = (Date) formatter.parse(request.getParameter("origionalAirDate"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*String startDateStr = request.getParameter("manufactureDate");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date startDate = (Date) sdf.parse(startDateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */// you will get date here
		

		String ManufactureDate = request.getParameter("manufactureDate");
		/* Date date; */
		int status = 0;
		DateFormat df = new SimpleDateFormat("dd-MM-yy");

		try {
			/* date = new SimpleDateFormat("dd/MM/yyyy").parse(ManufactureDate); */
			Date manuDate =  df.parse(ManufactureDate);
			java.sql.Date sqdob = new java.sql.Date(manuDate.getTime());
			Products products = new Products();
			products.setProductname(productname);
			products.setManufacturername(manufacturername);
			products.setPrice(Double.parseDouble(price));
			products.setManufactureDate(sqdob);
			status = ProductDBHandler.addProducts(products);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		/*int status = ProductDBHandler.addProducts(products);*/
		if(status>0) {
			out.print("<h2> Records inserted successfully !!</h2>");
			out.print("<a href='viewProducts.jsp'>Back</a>");
		}else {
			out.print("ERROR ! in inserting records");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
