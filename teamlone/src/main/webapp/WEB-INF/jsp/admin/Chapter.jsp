<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/comm/layui/css/layui.css" media="all">
		<link rel="stylesheet" type="text/css" href="/comm/bootstrap/css/bootstrap.css" media="all">
		<link rel="stylesheet" type="text/css" href="/css/bootstrap.css" />
		<link rel="stylesheet" type="text/css" href="/comm/global.css" media="all">
		<link rel="stylesheet" type="text/css" href="/css/personal.css" media="all">
		<script src="/js/jquery-3.0.0.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript" src="/js/bootstrap.js"></script>
<!-- 		<script type="text/javascript" charset="utf-8" src="/static/utf8-jsp/ueditor.config.js"></script> -->
<!--         <script type="text/javascript" charset="utf-8" src="/static/utf8-jsp/ueditor.all.min.js"></script> -->
        <script type="text/JavaScript" src="/static/My97DatePicker/WdatePicker.js"></script> 
		<style>
           .oh{
             width: 100px
           }
           .th{
             width: 200px
           }
           .form-horizontal>.form-group>.col-sm-10>select{
           		display:inline-block;
           }
        </style>
        <script type="text/javascript">
        function test() {
        	var parentNode= $("#pNode").val();
        	alert(parentNode)
		}
        $(function () {
        	alert(${id});
			$("#pNode").val(${id});
		})
        </script>
</head>
<body>
<form class="form-horizontal">
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">专业管理</label>
    <div class="col-sm-10">
    <select class="form-control oh " id="pNode" >
     <c:forEach items="${allSubjict }" var="subject">
  <option value="${subject.id }" >${subject.name }</option>
     </c:forEach>
</select>
     <select class="form-control oh " >
     <c:forEach items="${allSubjictByparent_Id }" var="allSubjictByparent_Id">
  <option value="${allSubjictByparent_Id.id }">${allSubjictByparent_Id.name }</option>
     </c:forEach>
</select>
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">状态</label>
    <div class="col-sm-10">

             <option value="1" selected="selected">上架</option> 

    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">总课时</label>
    <div class="col-sm-10">
      <input type="number" class="form-control th" id="inputPassword" >
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">课程原价格</label>
    <div class="col-sm-10">
      <input type="number" class="form-control th" id="inputPassword" >
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">课程销售价格</label>
    <div class="col-sm-10">
      <input type="number" class="form-control th" id="inputPassword" >
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">有效期类型</label>
    <div class="col-sm-10">
                <select class="form-control th" style="width: 80px">
  <option>1</option>
  <option>2</option>
  <option>3</option>
</select>
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">按天数</label>
    <div class="col-sm-10">
      <input type="number" class="form-control th" id="inputPassword" >
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">截至时间</label>
    <div class="col-sm-10">
      <input type="date" class="form-control th" id="inputPassword" >
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">添加教师</label>
    <div class="col-sm-10">
                      <select class="form-control oh" style="width: 80px">
  <option>1</option>
  <option>2</option>
  <option>3</option>
</select>
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">课程简介</label>
    <div class="col-sm-10">
      <input type="text" class="form-control th" id="inputPassword" >
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">课程图片</label>
    <div class="col-sm-10">
      <!--<input type="image" src=""  >-->
      <input type="file" class="btn" style="height: 33px;" >
    </div>
  </div>
    <div class="form-group">
    <label for="inputPassword" class="col-sm-2 control-label">课程图片</label>
    <div class="col-sm-10">
      <!--<input type="image" src=""  >-->
      <script type="text/plain" name="ceshi" id="editor"></script>
    </div>
  </div>
</form>

</body>
   <script type="text/javascript">
    var ue = UE.getEditor("editor");
   </script>

</html>