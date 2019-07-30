<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">


    <title>菜鸟教程(runoob.com)</title>
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js">
    </script>
    <script>
        $(document).ready(function(){
            $("p").hover(function(){
                $("p").css("background-color","yellow");
            },function(){
                $("p").css("background-color","pink");
            });
        });

        $(document).ready(function(){
            $("#exit").hover(function() {
                    $("#exit").css("font-color","red");
                }
                ,function() {
                    $("#exit").css("font-color","black");
                });
        });
    </script>

    <div class="content">
        <div class="button-wrapper">
            <a href="#" class="a-btn">
                <span></span>
                <span>Sign up</span>
                <span>It's free!</span>
            </a>
        </div>
    </div>
</head>
<body>


<p>鼠标移动到该段落。</p>
<a id="exit" href="#" >退出</a>
</body>
</html>
