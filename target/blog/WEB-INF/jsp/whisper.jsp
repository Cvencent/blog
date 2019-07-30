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
      <a href="index.jsp">
        <span>MYBLOG</span>
        <img src="${pageContext.request.contextPath}/static/img/logo.png">
      </a>
    </h1>
    <div class="nav">
      <a href="${pageContext.request.contextPath}/user/index.action">文章</a>
      <a href="${pageContext.request.contextPath}/user/whisper.action"  class="active">微语</a>
      <a href="${pageContext.request.contextPath}/user/leacots.action">留言</a>
      <a href="${pageContext.request.contextPath}/user/album.action">相册</a>
      <a href="${pageContext.request.contextPath}/user/about.action">关于</a>
    </div>
    <ul class="layui-nav header-down-nav">
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/text.action">文章</a></li>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/whisper.action"  class="active">微语</a></li>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/leacots.action">留言</a></li>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/album.action">相册</a></li>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/about.action" >关于</a></li>
    </ul>
    <p class="welcome-text">
      欢迎来到<span class="name">${sessionScope.username}</span>的博客~
      <button id="exit" >退出</button>
    </p>
  </div>


  <div class="content whisper-content">
    <div class="cont">
      <div id="whisper" class="whisper-list">

      </div>
    </div>
  </div>
      <div id="demo" style="text-align: center;"></div>
    </div>
  </div>
  <script type="text/html" id="laytplCont">
    <div class="cont">
      <div class="img">
        <img src="{{d.avatar}}" alt="">
      </div>
      <div class="text">
        <p class="tit"><span class="name">{{d.name}}</span><span class="data">2018/06/06</span></p>
        <p class="ct">{{d.cont}}</p>
      </div>
    </div>
  </script>
  <div class="footer-wrap">
    <div class="footer w1000">

    </div>
  </div>
  <script src="${pageContext.request.contextPath}/static/js/whisper.js" ></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/static/layui/layui.js"></script>
  <script type="text/javascript">
    layui.config({
      base: '../res/js/util/'
    }).use(['element','laypage','form','menu'],function(){
      element = layui.element,laypage = layui.laypage,form = layui.form,menu = layui.menu;
      laypage.render({
        elem: 'demo'
        ,count: 70 //数据总数，从服务端得到
      });
      menu.init();
      menu.off();
      menu.submit()
    })
  </script>
</body>
</html>
