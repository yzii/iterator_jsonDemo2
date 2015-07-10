<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>iterator_jsonDemo2</title>
    <link rel="stylesheet" type="text/css" href="EXT-JS/resources/css/ext-all.css" />
	<script type="text/javascript" src="EXT-JS/adapter/ext/ext-base.js"></script>
	<script type="text/javascript" src="EXT-JS/ext-all.js"></script>
	<script type="text/javascript" src="EXT-JS/ext-lang-zh_CN.js"></script>
	<script type="text/javascript" src="js/index.js"></script>
  </head>
  
  <body>
	<div id="grid"></div>
  </body>
</html>
