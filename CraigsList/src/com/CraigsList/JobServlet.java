package com.CraigsList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;

import com.Conn.ConnectionManager;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

/**
 * Servlet implementation class JobServlet
 */
@WebServlet("/jobservlet")
public class JobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JobServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MongoClient connection = ConnectionManager.getMongo();
		MongoDatabase db = ConnectionManager.getDb("Advertisements");
		MongoCollection<Document> collection = db.getCollection("jobAds");
		Document document = new Document("Job Title",request.getParameter("title"))
				.append("Description",request.getParameter("desc"))
				.append("Experience",request.getParameter("exp"))
				.append("Location",request.getParameter("loc"))
				.append("Contact",request.getParameter("ph"));
		collection.insertOne(document);
		response.sendRedirect("jobAdSuccess.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MongoClient connection = ConnectionManager.getMongo();
		MongoDatabase db = ConnectionManager.getDb("Advertisements");
		MongoCollection<Document> collection = db.getCollection("jobAds");
		MongoCursor<Document> cursor = collection.find().iterator();
		
		List<jobAd> jobAds = new ArrayList<jobAd>();
		
		while (cursor.hasNext()) {
			Document d = (Document) cursor.next();

			jobAd j = new jobAd(d.getString("Job Title"), d.getString("Description"), d.getString("Experience"),d.getString("Location"), d.getString("Contact"));
			jobAds.add(j);
		}

		request.setAttribute("jobAds", jobAds);
		request.getRequestDispatcher("viewjobAds.jsp").forward(request, response);
		response.sendRedirect("viewjobAds.jsp");
	}

}
