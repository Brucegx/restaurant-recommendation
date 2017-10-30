package rpc;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import algorithm.Recommendation;
import db.DBConnection;
import db.DBConnectionFactory;
import entity.Item;

/**
 * Servlet implementation class RecommendItem
 */
@WebServlet("/recommendation")
public class RecommendItem extends HttpServlet {
  private static final long serialVersionUID = 1L;
  private DBConnection conn = DBConnectionFactory.getDBConnection();
  /**
   * @see HttpServlet#HttpServlet()
   */
  public RecommendItem() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String userId = request.getParameter("user_id");
    double lat = Double.parseDouble(request.getParameter("lat"));
    double lon = Double.parseDouble(request.getParameter("lon"));
    Recommendation recommendation = new Recommendation();
    List<Item> items = recommendation.recommendItems(userId, lat, lon);
    JSONArray array = new JSONArray();
    for (Item item : items) {
      JSONObject obj = item.toJSONObject();
      array.put(obj);
    }
    RpcHelper.writeJsonArray(response, array);
    
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // TODO Auto-generated method stub
    doGet(request, response);
  }
}