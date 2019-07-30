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
      <a href="${pageContext.request.contextPath}/user/whisper.action">微语</a>
      <a href="${pageContext.request.contextPath}/user/leacots.action">留言</a>
      <a href="${pageContext.request.contextPath}/user/album.action" class="active">相册</a>
      <a href="${pageContext.request.contextPath}/user/about.action" >关于</a>
    </div>
    <ul class="layui-nav header-down-nav">
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/text.action">文章</a></li>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/whisper.action">微语</a></li>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/leacots.action">留言</a></li>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/album.action"  class="active">相册</a></li>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/about.action" >关于</a></li>
    </ul>
    <p class="welcome-text">
      欢迎来到<span class="name">${sessionScope.username}</span>的博客~
      <button id="exit" >退出</button>
    </p>
  </div>

  <div class="album-content w1000"  id="layer-photos-demo" class="layer-photos-demo">
    <%--<div class="img-info">
      <img src="${pageContext.request.contextPath}/static/img/xc_img1.jpg" alt="">
      <div class="title">
        <p class="data">最新上传<span>2018/10/10</span></p>
        <p class="text">观赏最美的土耳其的日</p>
      </div>
    </div>--%>
    <div class="img-list">
      <div class="layui-fluid" style="padding:0">
        <div  id="albums" class="layui-row layui-col-space30 space">


        </div>
      </div>
      <div id="demo"></div>
    </div>
  </div>


  <div class="footer-wrap">
    <div class="footer w1000">
      <div class="qrcode">
        <img src="${pageContext.request.contextPath}/static/img/erweima.jpg">
      </div>
      <div class="practice-mode">
        <img src="${pageContext.request.contextPath}/static/img/down_img.jpg">
        <div class="text">
          <h4 class="title">我的联系方式</h4>
          <p>微信<span class="wechat">${sessionScope.user.wechat}</span></p>
          <p>手机<span class="iphone">${sessionScope.user.tel}</span></p>
          <p>邮箱<span class="email">${sessionScope.user.email}</span></p>
        </div>
      </div>
    </div>
  </div>
  <script src="${pageContext.request.contextPath}/static/js/album.js" ></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/static/layui/layui.js"></script>
  <script type="text/javascript">




  </script>
</body>
</html>
