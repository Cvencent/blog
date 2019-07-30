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
<!--加载meta IE兼容文件-->
<!--[if lt IE 9]>
<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
<![endif]-->
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
      <a href="${pageContext.request.contextPath}/user/album.action">相册</a>
      <a href="${pageContext.request.contextPath}/user/about.action"  class="active">关于</a>
    </div>
    <ul class="layui-nav header-down-nav">
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/text.action">文章</a></li>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/whisper.action">微语</a></li>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/leacots.action">留言</a></li>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/album.action">相册</a></li>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/about.action"  class="active">关于</a></li>
    </ul>
    <p class="welcome-text">
      欢迎来到<span class="name">${sessionScope.username}</span>的博客~
    </p>
  </div>

  <div class="about-content">
    <div class="w1000">
      <div class="item info">
        <div class="title">
          <h3>我的介绍</h3>
        </div>
        <div class="cont">
          <img src="${pageContext.request.contextPath}/static/img/xc_img1.jpg">
          <div class="per-info">
            <p>
              <span class="name">${sessionScope.user.username}</span><br />
              <span class="">24岁</span><br />
              <span class="sign">${sessionScope.user.sign}</span><br />
              <span class="interest">爱好旅游,打游戏</span>
            </p>
          </div>
        </div>
      </div>
      <div class="item tool">
        <div class="title">
          <h3>我的技能</h3>
        </div>
        <div class="layui-fluid">
          <div class="layui-row">
            <div class="layui-col-xs6 layui-col-sm3 layui-col-md3">
              <div class="cont-box">
                <img src="${pageContext.request.contextPath}/static/img/gr_img2.jpg">
                <p>80%</p>
              </div>
            </div>
            <div class="layui-col-xs6 layui-col-sm3 layui-col-md3">
              <div class="cont-box">
                <img src="${pageContext.request.contextPath}/static/img/gr_img3.jpg">
                <p>80%</p>
              </div>
            </div>
            <div class="layui-col-xs6 layui-col-sm3 layui-col-md3">
              <div class="cont-box">
                <img src="${pageContext.request.contextPath}/static/img/gr_img4.jpg">
                <p>80%</p>
              </div>
            </div>
            <div class="layui-col-xs6 layui-col-sm3 layui-col-md3">
              <div class="cont-box">
                <img src="${pageContext.request.contextPath}/static/img/gr_img5.jpg">
                <p>80%</p>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="item contact">
        <div class="title">
          <h3>联系方式</h3>
        </div>
        <div class="cont">
          <img src="${pageContext.request.contextPath}/static/img/erweima.jpg">
          <div class="text">
            <p class="WeChat">微信：<span>${sessionScope.user.wechat}</span></p>
            <p class="qq">qq：<span>${sessionScope.user.qq}</span></p>
            <p class="tel">电话：<span>${sessionScope.user.tel}</span></p>
          </div>
        </div>
      </div>
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
  <script type="text/javascript" src="${pageContext.request.contextPath}/static/layui/layui.js"></script>
  <script type="text/javascript">
    layui.config({
      base: '${pageContext.request.contextPath}/static/js/util/'
    }).use(['element','laypage','form','layer','menu'],function(){
      element = layui.element,laypage = layui.laypage,form = layui.form,layer = layui.layer,menu = layui.menu;
      menu.init();
    })
  </script>
</body>
</html>
