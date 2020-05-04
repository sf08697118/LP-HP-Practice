import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter writer;
			writer = response.getWriter();
			writer.println("<html><body>");
			writer.println("<table style = border:solid width = 30% rules = all>");
			writer.println("<tr bgcolor = #cccccc ><th>TODO名称</th>");
			writer.println("<th width = 10%>編集</th>>");
			writer.println("<th width = 10%>削除</th></tr>");
			writer.println("<tr><td> TODO_1 </td><td> <button> 編集 </button> </td> <td> <button> 削除 </button> </td></tr>");
			writer.println("<tr><td> TODO_2 </td><td> <button> 編集 </button> </td> <td> <button> 削除 </button></td></tr>");
			writer.println("<tr><td> TODO_3 </td><td> <button> 編集 </button> </td> <td> <button> 削除 </button></td></tr>");
			writer.println("<tr><td> TODO_4 </td><td> <button> 編集 </button> </td> <td> <button> 削除 </button></td></tr>");
			writer.println("<tr><td> TODO_5 </td><td> <button> 編集 </button> </td> <td> <button> 削除 </button></td></tr>");
			//writer.println("<pre>" + getDbData() + "</pre>");
			//writer.println("</table>");
			//writer.println("<br><a href=\"/list\">更新</a>");
			writer.println("</body></html>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}