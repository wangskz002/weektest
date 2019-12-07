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
<form>
	<table>
  <tr>
    <th colspan="10">修改页面</th>
  </tr>
   <tr>
    <td>商品编号:</td>
    <td><input type="text" name="id" value="${g.id }" readonly="readonly"></td>
  </tr>
  <tr>
    <td>商品名:</td>
    <td><input type="text" name="name" value="${g.name }" readonly="readonly"></td>
  </tr>
  <tr>
    <td>品牌:</td>
    <td><select id="b" name="bid"></select></td>
  </tr>
   <tr>
    <td>分类:</td>
    <td><select id="t" name="tid"></select></td>
  </tr>
  <tr>
    <td>价格:</td>
    <td><input type="text" name="price" value="${g.price }"></td>
  </tr>
   <tr>
    <td><input type="button" value="修改" onclick="save()"></td>
    <td><input type="button" value="返回" onclick="back()"></td>
  </tr>
</table>
</form>
</body>
<script type="text/javascript">
	
 	 
$.post("<%=path%>/getType.do", "",
		function(obj) {
		for ( var i in obj) {
			$("#t").append("<option value='"+obj[i].tid+"'>"+obj[i].tname+"</option>")
		}
		 tid = '${g.tid}'
		$("#t option[value="+tid+"]").attr("selected", true)
}, "json")
$.post("<%=path%>/getBrand.do", "",
		function(obj) {
		for ( var i in obj) {
			$("#b").append("<option value='"+obj[i].bid+"'>"+obj[i].bname+"</option>")
		}
		bid = '${g.bid}'
		$("#b option[value="+bid+"]").attr("selected", true)
}, "json")

function back() {
	location='<%=path%>/list.do'
}

function save() {
	$.post("<%=path%>/update.do",
			$("form").serialize(), 
			function(obj) {
			if(obj > 0){
				alert("修改成功")
				location='<%=path%>/list.do'
			}else{
				alert("修改失败")
			}
	}, "json")
}
</script>
</html>