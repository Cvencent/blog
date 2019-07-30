
$(document).ready(function(){
    $("#exit").hover(function() {
            $("#exit").css("background-color","red");
        }
        ,function() {
            $("#exit").css("background-color","white");
        });
});

$(document).ready(function(){

    $.ajax({
        url:"../text/albums.action",
        contentType:"application/json;charset=utf-8",
        data:{type:"design"},
        dataType:"json",
        type:"post",
        success:function (data) {
            $(data).each(function (i,n) {

                var src = n.src;

                $("#albums").append('<div class="layui-col-xs12 layui-col-sm4 layui-col-md4">\n' +
                    '    <div class="item">\n' +
                    '    <img src="../static/photo/'+src+'" alt="">\n' +
                    '    <div class="cont-text">\n' +
                    '    <div class="data">'+n.photoDate+'</div>\n' +
                    '<p class="address"><i class="layui-icon layui-icon-location"></i><span>'+n.place+'</span></p>\n' +
                    '<p class="briefly">'+n.photoDetail+'</p>\n' +
                    '</div>\n' +
                    '</div>\n' +
                    '</div>');



            });
        }
    });
});