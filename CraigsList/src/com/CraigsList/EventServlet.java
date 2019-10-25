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
 * Servlet implementation class EventServlet
 */
@WebServlet("/eventservlet")
public class EventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EventServlet() {
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
		MongoCollection<Document> collection = db.getCollection("eventAds");
		Document document = new Document("Event Title",request.getParameter("name"))
				.append("Description",request.getParameter("desc"))
				.append("Location",request.getParameter("loc"))
				.append("Contact",request.getParameter("ph"));
		collection.insertOne(document);
		response.sendRedirect("eventAdSuccess.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MongoClient connection = ConnectionManager.getMongo();
		MongoDatabase db = ConnectionManager.getDb("Advertisements");
		MongoCollection<Document> collection = db.getCollection("eventAds");
		MongoCursor<Document> cursor = collection.find().iterator();
		
		List<event> eventAds = new ArrayList<event>();
		
		while (cursor.hasNext()) {
			Document d = (Document) cursor.next();

			event e = new event(d.getString("Event Title"), d.getString("Description"), d.getString("Location"), d.getString("Contact"));
			eventAds.add(e);
		}

		request.setAttribute("eventAds", eventAds);
		request.getRequestDispatcher("vieweventAds.jsp").forward(request, response);
		response.sendRedirect("vieweventAds.jsp");
	}

}
