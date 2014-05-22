package jp.co.jjs.java_seminar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Questionnaire
 */
@WebServlet("/Questionnaire")
public class Questionnaire extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Questionnaire() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html;charset=UTF-8");
	    PrintWriter writer = response.getWriter();

	    writer.println("<html><head>"
                +"<meta charset=\"UTF-8\">"
                +"<title>アンケート</title>"
                +"</head><body>"
                +"<h2>アンケート</h2>"
	            + "<hr>"
	            + "<form method=\"get\" action=\"answer.jsp\">"
	            + "・性別を選択してください<br>"
	            + "<input type=\"radio\" name=\"sex\" value=\"男\"/>男<br>"
	            + "<input type=\"radio\" name=\"sex\" value=\"女\"/>女<br>"
	            + "・年齢を選択してください。<br>"
	            + "<input type=\"number\" name=\"year\" /><br>"
	            + "<br>"
	            + "・職業を選択してください。<br>"
	            + "<select name=\"occupation\">"
	            + "<option  value=\"null\">選択してください</option>"
	            + "<option  value=\"会社員\">会社員</option>"
	            + "<option  value=\"パート・アルバイト\">パート・アルバイト</option>"
	            + "<option  value=\"学生\">学生</option>"
	            + "<option  value=\"無職\">無職</option>"
	            + "<option  value=\"その他\">その他</option>"
	            + "</select><br><br>"
	            + "・今日の気分を入力してください。<br>"
	            + "<textarea name=\"feel\" rows=\"5\" cols=\"30\">この中に記入してください。</textarea><br>"
	            + "<input type=\"submit\" value=\"送信\"></form>");
        writer.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
