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
      <a href="${pageContext.request.contextPath}/user/leacots.action" class="active">留言</a>
      <a href="${pageContext.request.contextPath}/user/album.action">相册</a>
      <a href="${pageContext.request.contextPath}/user/about.action">关于</a>
    </div>
    <ul class="layui-nav header-down-nav">
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/text.action" >文章</a></li>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/whisper.action">微语</a></li>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/leacots.action" class="active">留言</a></li>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/album.action">相册</a></li>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/user/about.action">关于</a></li>
    </ul>
    <p class="welcome-text">
      欢迎来到<span class="name">${sessionScope.username}</span>的博客~
      <button id="exit" >退出</button>
    </p>
  </div>


  <div class="content whisper-content leacots-content">
    <div class="cont w1000">
      <div class="whisper-list">
        <div class="item-box">
          <div class="review-version">
              <div class="form-box">
                <img class="banner-img" src="${pageContext.request.contextPath}/static/img/liuyan.jpg">
                <div class="form">
                  <form class="layui-form" action="${pageContext.request.contextPath}/text/reply.action">
                    <div class="layui-form-item layui-form-text">
                      <div class="layui-input-block">
                        <textarea name="desc" placeholder="既然来了，就说几句" class="layui-textarea"></textarea>
                      </div>
                    </div>
                    <div class="layui-form-item">
                      <div class="layui-input-block" style="text-align: right;">
                        <button class="layui-btn definite">確定</button>
                      </div>
                    </div>
                  </form>
                </div>
              </div>
              <div class="volume">
                全部留言 <span>10</span>
              </div>
              <div id="leac" class="list-cont">


              </div>
          </div>
        </div>
      </div>
      <div id="demo" style="text-align: center;"></div>
    </div>
  </div>
  <script type="text/html" id="laytplCont">
    <div class="cont">
      <div class="img">
        {{#  if(d.avatar){ }}
        <img src="{{d.avatar}}" alt="">
        {{#  } else { }}
        <img src="${pageContext.request.contextPath}/static/img/header.png" alt="">
        {{# } }}
      </div>
      <div class="text">
        <p class="tit"><span class="name">{{d.name}}</span><span class="data">2018/06/06</span></p>
        <p class="ct">{{d.cont}}</p>
      </div>
    </div>
  </script>
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
  <script src="${pageContext.request.contextPath}/static/js/leacots.js" ></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/static/layui/layui.js"></script>

</body>
</html>
