<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
  <title>Document</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/main.css">
  <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>

<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>

</head>
<body>
  <div class="header">
    <div class="menu-btn">
      <div class="menu"></div>
    </div>
    <h1 class="logo">
      <a href="${pageContext.request.contextPath}/user/index.action">
        <span>MYBLOG</span>
        <img src="${pageContext.request.contextPath}/static/img/logo.png">
      </a>
    </h1>
    <div class="nav">
      <a href="${pageContext.request.contextPath}/user/index.action" class="active">文章</a>
      <a href="${pageContext.request.contextPath}/user/whisper.action">微语</a>
      <a href="${pageContext.request.contextPath}/user/leacots.action">留言</a>
      <a href="${pageContext.request.contextPath}/user/album.action">相册</a>
      <a href="${pageContext.request.contextPath}/user/about.action">关于</a>

    </div>

    <ul class="layui-nav header-down-nav">
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/index.action" class="active">文章</a></li>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/whisper.action">微语</a></li>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/leacots.action">留言</a></li>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/album.action">相册</a></li>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/about.action">关于</a></li>
    </ul>
    <p class="welcome-text">
      欢迎来到<span class="name">${sessionScope.username}</span>的博客~
      <button id="exit" >退出</button>
    </p>
  </div>

  <div class="banner">
    <div class="cont w1000">
      <div class="title">
        <h3>MY<br />BLOG</h3>
        <h4>well-balanced heart</h4>
      </div>
      <div class="amount">
        <p><span class="text">访问量</span><span class="access">1000</span></p>
        <p><span class="text">日志</span><span class="daily-record">${requestScope.get("num")}</span></p>
      </div>
    </div>
  </div>
  <div class="content">
    <div class="cont w1000">
      <div class="title">
        <span  lay-separator="|">
          <a id="design" class="active">设计文章</a>
          <a id="leading">前端文章</a>
          <a id="travel">旅游杂记</a>
        </span>
      </div>
        <label id=""></label>
      <div  id ="text" class="list-item">

      </div>

      </div>
      <div id="demo" style="text-align: center;"></div>
    </div>
  </div>


  <script src="${pageContext.request.contextPath}/static/js/index.js" ></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/static/layui/layui.js"></script>

</body>
</html>
