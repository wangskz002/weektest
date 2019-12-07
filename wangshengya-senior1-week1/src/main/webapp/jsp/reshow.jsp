<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
  <link rel="stylesheet" type="text/css" href="<%=path%>/css/index_work.css"/>  
 <%--<link rel="stylesheet" href="bootstrap-4.1.3-dist/css/bootstrap.css">--%>
<script type="text/javascript" src="<%=path%>/js/jquery-1.8.3.js"></script>
</head>
<body>
	<table>
  <tr>
    <th colspan="10">详情</th>
  </tr>
  <tr>
    <td>商品名</td>
    <td>${g.name }</td>
  </tr>
  <tr>
    <td>发布日期</td>
    <td>${g.datea }</td>
  </tr>
  <tr>
    <td>品牌</td>
    <td>${g.bname }</td>
  </tr>
  <tr>
    <td>类型</td>
    <td>${g.tname }</td>
  </tr>
   <tr>
    <td>价格</td>
    <td>${g.price }</td>
  </tr>
   <tr>
    
    <td colspan="10"><input type="button" value="返回" onclick="location='<%=path%>/list.do'"></td>
  </tr>
</table>

</body>
<script type="text/javascript">
	
</script>
</html>