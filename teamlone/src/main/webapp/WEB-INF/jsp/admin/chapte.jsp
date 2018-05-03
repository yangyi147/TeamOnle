<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
		<link rel="stylesheet" href="/static/common/ztree/css/zTreeStyle.css"type="text/css">
        <link rel="stylesheet" href="/css/bootstrap.css" />
        <script type="text/javascript" src="/js/jquery-3.0.0.min.js"></script>
        <script type="text/javascript" src="/js/bootstrap.js"></script>
        <script type="text/javascript"src="/inc/js/ztree/js/jquery.ztree.core.min.js"></script>
        <script type="text/javascript"src="/inc/js/ztree/js/jquery.ztree.excheck.js"></script>
</head>
<style>
.top{
margin-top: 100px;
margin-left: 50px;
}
</style>
<SCRIPT type="text/javascript">
	var id=0;
	var name;
		var setting = {
			view: {
				showLine: false
			},
			data: {
				simpleData: {
					enable: true
				}
			},
			callback : {
				beforeClick : zTreeBeforeClick
			}
		};

		var zNodes =${allEdu_course_KpointByCourseID};

		$(document).ready(function(){
			$.fn.zTree.init($("#treeDemo"), setting, zNodes);
		});
		function zTreeBeforeClick(treeId, treeNode, clickFlag) {
			id = treeNode.id;
			name = treeNode.name;
		};
		function qx() {
			id=0;
		}
		function add() {
			
		}
	
	</SCRIPT>
<body>
<div class="zTreeDemoBackground left" id="ztree">
		<ul id="treeDemo" class="ztree"></ul>
	</div>
	<input type="button" onclick="add()" class="top" value="创建视频节点" /><input type="button" class="top" onclick="qx()" value="取消选中" />

</body>
</html>