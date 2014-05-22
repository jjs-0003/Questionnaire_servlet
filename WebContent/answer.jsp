<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>アンケート回答結果</title>
    </head>
    <body>
        <h2>アンケート回答結果</h2>
        <hr>
        <%
            request.setCharacterEncoding("UTF-8");
        %>
        性別 : <%=request.getParameter("sex") %> <br>
        <br>
        年齢 : <%=request.getParameter("year") %> <br>
        <br>
        職業 : <%=request.getParameter("occupation") %> <br>
        <br>
        今日の一言: <%=request.getParameter("feel") %>
        <br>
        <hr>
        ご協力ありがとうございました。
    </body>
</html>