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
<form action="<%=path%>/list.do" method="post">
	<input type="hidden" name="pageNum" >
	<p style="float: left;"><input type="text" name="name" value="${name }">
		<input type="submit" value="搜索">
	</p>
	<p style="float: right;"><input type="button" value="新增" onclick="location='<%=path%>/jsp/add.jsp'"><input type="button" value="批量删除" onclick="del()"></p>
</form>

	<table>
  <tr>
    <th colspan="10">列表展示</th>
   
  </tr>
  <tr>
    <td><input type="checkbox" name="c" onclick="hovel()" >全选</td>
    <td>编号</td>
    <td>商品名</td>
    <td>品牌</td>
    <td>分类</td>
    <td>发布时间</td>
    <td>操作</td>
   
  </tr>
  <c:forEach items="${page.list }" var="e">
  	<tr>
  		<td><input type="checkbox" name="choose1" value="${e.id }"></td>
	    <td>${e.id }</td>
	    <td>${e.name }</td>
	    <td>${e.bname }</td>
	    <td>${e.tname }</td>
	    <td>${e.datea }</td>
	    <td><a href="<%=path%>/reshow.do?id=${e.id }">详情</a><a href="<%=path%>/toupdate.do?id=${e.id }">编辑</a></td>
  	</tr>
  </c:forEach>
  <tr>
  	<td colspan="10">
  		<input type="button" value="首页" onclick="page(1)">
  		<input type="button" value="上一页" onclick="page(${page.pageNum - 1 < 1 ? 1 : page.pageNum - 1})">
  		<input type="button" value="下一页" onclick="page(${page.pageNum + 1 > page.pages ? page.pages : page.pageNum + 1})">
  		<input type="button" value="尾页" onclick="page(${page.pages})">
  	</td>
  </tr>
</table>

</body>
<script type="text/javascript">
	$("[name=c]").click(function() {
		$("[name=choose1]").attr("checked",this.checked)
	})
	function page(pageNum) {
		$("[name='pageNum']").val(pageNum)
		$("form").submit()
	}
	function del() {
		var ids = $("[name=choose1]:checked").map(function() {
			return $(this).val()
		}).get().join(",")
		alert(ids)
		
		if(confirm("确定要删除吗")){
			$.post("<%=path%>/del.do",
					{ids:ids}, 
					function(obj) {
					if(obj > 0){
						alert("删除成功")
						location='<%=path%>/list.do'
					}else{
						alert("删除失败")
					}
			}, "json")
		}
	}
</script>
</html>