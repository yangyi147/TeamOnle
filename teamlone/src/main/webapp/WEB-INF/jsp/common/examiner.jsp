<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>查看邮件</title>
	<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<link href="/js/utf8-jsp/themes/default/css/umeditor.css"
	type="text/css" rel="stylesheet">

<link rel="stylesheet" type="text/css" href="/comm/layui/css/layui.css"
	media="all">
<link rel="stylesheet" type="text/css"
	href="/comm/bootstrap/css/bootstrap.css" media="all">
<link rel="stylesheet" type="text/css" href="/css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="/comm/global.css"
	media="all">
<link rel="stylesheet" type="text/css" href="/css/personal.css"
	media="all">
<script src="/js/jquery-3.0.0.min.js" type="text/javascript"
	charset="utf-8"></script>
<script src="/js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
<script src="/js/bootstrap-table.min.js" type="text/javascript"
	charset="utf-8"></script>
<script src="/js/bootstrap-table-zh-CN.min.js" type="text/javascript"
	charset="utf-8"></script>
<script type="text/javascript"
	src="/js/utf8-jsp/third-party/jquery.min.js"></script>
<script type="text/javascript" charset="utf-8"
	src="/js/utf8-jsp/umeditor.config.js"></script>
<script type="text/javascript" charset="utf-8"
	src="/js/utf8-jsp/umeditor.min.js"></script>
<script type="text/javascript" src="/js/utf8-jsp/lang/zh-cn/zh-cn.js"></script>
<script type="text/javascript">
<!-- 发送邮件 -->

</script>
<style>
   #d1{
   margin: 30px 100px;   
   }
  
    </style>
</head>
<body>

<form action="" method="post">
	<div id="d1">
			<table  style="font-family: '微软雅黑';line-height: 50px; font-size:16px; color:black; id="tab2">
				<tr height="50px">
					<td id="t1">邮件标题:&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td id="t2">
			       <input type="text" value="${emailsend.title}"  class="form-control"style="width:160px; "/>
					</td>
				</tr>
				<tr height="50px">
					<td id="t1">邮件类型:&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td id="t2">
					<c:if test="${emailsend.type==1}" >、
					   <p>普通</p>
			       </c:if>
			       	<c:if test="${emailsend.type==2}">
			       	  <p>定时</p>
			       </c:if>
					</td>
				</tr>
				<tr height="50px">
					<td id="t1">是否发送:&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td id="t2">
					<c:if test="${emailsend.status==1}">
			    <p> 已发送</p>
			       </c:if>
			      <c:if test="${emailsend.status==2}">
			      <p>未发送</p>
			       </c:if>
					</td>
				</tr>
			</table>

			<table style="font-family: '微软雅黑';line-height: 50px; font-size:16px;color:black;" >
				<tr height="30px">
					<td>邮件内容:&nbsp;&nbsp;&nbsp;&nbsp;</td>
                   <td>  
                     	<script type="text/plain" value="" id="content" style="width:900px;height:300px;">${emailsend.content}</script>
                  </td>
				</tr>
			
			</table>
			
			<table style="font-family: '微软雅黑';line-height: 50px; font-size:16px; color:black;">
				<tr>
					<td>创建时间：&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td>  <input type="text"  value="${emailsend.create_time}" style="width:160px"class="form-control"style="width:200px; "/></td>
				</tr>
				<tr>
					<td>发送人：&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><input type="text" class="form-control"style="width:160px; "  value="admin" /></td>
				</tr>
				<tr>
					<td>接收人：&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td>
					<script type="text/plain" value="" id="contents" style="width:900px;height:300px;">${emailsend.user_id.user_name}</script>

				
					</td>
				</tr>
				<tr>
					<td colspan="2" style=" padding: 0px 800px;height: 80px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="/admin/email/list"  class="layui-btn layui-btn-primary" >返回</a></td>
				</tr>
			</table>
			</div>
</form>
</body>
<script type="text/javascript">
	var um = UM.getEditor('content');
	var um = UM.getEditor('contents')
</script>
</html>