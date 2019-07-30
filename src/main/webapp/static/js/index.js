  $(document).ready(function(){
        $("#exit").hover(function() {
                $("#exit").css("background-color","red");
            }
            ,function() {
                $("#exit").css("background-color","white");
            });
    });

$(document).ready(function(){
    $("#design").click(function (){
        if("active"==document.getElementById("leading").getAttribute("class")){
            document.getElementById("leading").setAttribute("class","");
        }
        if("active"==document.getElementById("travel").getAttribute("class")){
            document.getElementById("travel").setAttribute("class","");
        }
        document.getElementById("design").setAttribute("class","active");
        document.getElementById("text").innerHTML="";
        $.ajax({
            url:"../text/context.action",
            contentType:"application/json;charset=utf-8",
            data:{type:"design"},
            dataType:"json",
            type:"post",
            success:function (data) {
                $(data).each(function (i,n) {
                    $("#text").append('<div class="item">\n' +
                        '          <div class="layui-fluid">\n' +
                        '            <div class="layui-row">\n' +
                        '              <div class="layui-col-xs12 layui-col-sm4 layui-col-md5">\n' +
                        '              </div>\n' +
                        '              <div class="layui-col-xs12 layui-col-sm8 layui-col-md7">\n' +
                        '                <div class="item-cont">\n' +
                        '                  <h3 id="title">'+n.textline+'<button class="layui-btn layui-btn-danger new-icon">new</button></h3>\n' +
                        '                  <h5 >'+n.textType+'</h5>\n' +
                        '                  <p id="context">'+n.text+ '</p>\n' +
                        '                  <a href="${pageContext.request.contextPath}/text/details.action" class="go-icon"></a>\n' +
                        '                </div>\n' +
                        '            </div>\n' +
                        '            </div>\n' +
                        '           </div>\n' +
                        '        </div>');


                });
            }
        });

    });
})

$(document).ready(function(){

    $.ajax({
        url:"../text/context.action",
        contentType:"application/json;charset=utf-8",
        data:{type:"design"},
        dataType:"json",
        type:"post",
        success:function (data) {
            $(data).each(function (i,n) {
                $("#text").append('<div class="item">\n' +
                    '          <div class="layui-fluid">\n' +
                    '            <div class="layui-row">\n' +
                    '              <div class="layui-col-xs12 layui-col-sm4 layui-col-md5">\n' +
                    '              </div>\n' +
                    '              <div class="layui-col-xs12 layui-col-sm8 layui-col-md7">\n' +
                    '                <div class="item-cont">\n' +
                    '                  <h3 id="title">'+n.textline+'<button class="layui-btn layui-btn-danger new-icon">new</button></h3>\n' +
                    '                  <h5 >'+n.textType+'</h5>\n' +
                    '                  <p id="context">'+n.text+ '</p>\n' +
                    '                  <a href="${pageContext.request.contextPath}/text/details.action" class="go-icon"></a>\n' +
                    '                </div>\n' +
                    '            </div>\n' +
                    '            </div>\n' +
                    '           </div>\n' +
                    '        </div>');


            });
        }
    });
})

  $(document).ready(function(){
      $("#leading").click(function (){
          if("active"==document.getElementById("design").getAttribute("class")){
              document.getElementById("design").setAttribute("class","");
          }
          if("active"==document.getElementById("travel").getAttribute("class")){
              document.getElementById("travel").setAttribute("class","");
          }
          document.getElementById("leading").setAttribute("class","active");
          document.getElementById("text").innerHTML="";
          $.ajax({
              url:"../text/context.action",
              contentType:"application/json;charset=utf-8",
              data:{type:"leading"},
              dataType:"json",
              type:"post",
              success:function (data) {
                  $(data).each(function (i,n) {
                      $("#text").append('<div class="item">\n' +
                          '          <div class="layui-fluid">\n' +
                          '            <div class="layui-row">\n' +
                          '              <div class="layui-col-xs12 layui-col-sm4 layui-col-md5">\n' +
                          '              </div>\n' +
                          '              <div class="layui-col-xs12 layui-col-sm8 layui-col-md7">\n' +
                          '                <div class="item-cont">\n' +
                          '                  <h3 id="title">'+n.textline+'<button class="layui-btn layui-btn-danger new-icon">new</button></h3>\n' +
                          '                  <h5 >'+n.textType+'</h5>\n' +
                          '                  <p id="context">'+n.text+ '</p>\n' +
                          '                  <a href="${pageContext.request.contextPath}/text/details.action" class="go-icon"></a>\n' +
                          '                </div>\n' +
                          '            </div>\n' +
                          '            </div>\n' +
                          '           </div>\n' +
                          '        </div>');


                  });
              }
          });

      });
  })

  $(document).ready(function(){
      $("#travel").click(function (){
          if("active"==document.getElementById("design").getAttribute("class")){
              document.getElementById("design").setAttribute("class","");
          }
          if("active"==document.getElementById("leading").getAttribute("class")){
              document.getElementById("leading").setAttribute("class","");
          }
          document.getElementById("travel").setAttribute("class","active");
          document.getElementById("text").innerHTML="";
          $.ajax({
              url:"../text/context.action",
              contentType:"application/json;charset=utf-8",
              data:{type:"travel"},
              dataType:"json",
              type:"post",
              success:function (data) {
                  $(data).each(function (i,n) {
                      $("#text").append('<div class="item">\n' +
                          '          <div class="layui-fluid">\n' +
                          '            <div class="layui-row">\n' +
                          '              <div class="layui-col-xs12 layui-col-sm4 layui-col-md5">\n' +
                          '              </div>\n' +
                          '              <div class="layui-col-xs12 layui-col-sm8 layui-col-md7">\n' +
                          '                <div class="item-cont">\n' +
                          '                  <h3 id="title">'+n.textline+'<button class="layui-btn layui-btn-danger new-icon">new</button></h3>\n' +
                          '                  <h5 >'+n.textType+'</h5>\n' +
                          '                  <p id="context">'+n.text+ '</p>\n' +
                          '                  <a href="${pageContext.request.contextPath}/text/details.action" class="go-icon"></a>\n' +
                          '                </div>\n' +
                          '            </div>\n' +
                          '            </div>\n' +
                          '           </div>\n' +
                          '        </div>');


                  });
              }
          });

      });
  })

      layui.config({
          base: '${pageContext.request.contextPath}/static/js/util/'
      }).use(['element','laypage','jquery','menu'],function(){
          element = layui.element,laypage = layui.laypage,$ = layui.$,menu = layui.menu;
          laypage.render({
              elem: 'demo'
              ,count:50
          });
          menu.init();
      })