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
        url:"../text/lls.action",
        contentType:"application/json;charset=utf-8",
        data:{type:"design"},
        dataType:"json",
        type:"post",
        success:function (data) {
            $(data).each(function (i,n) {

                var datetime = new Date();
                datetime.setTime(n.leacotsDate);
                var year = datetime.getFullYear();
                var month = datetime.getMonth() + 1 < 10 ? "0" + (datetime.getMonth() + 1) : datetime.getMonth() + 1;
                var date = datetime.getDate() < 10 ? "0" + datetime.getDate() : datetime.getDate();
                var hour = datetime.getHours()< 10 ? "0" + datetime.getHours() : datetime.getHours();
                var minute = datetime.getMinutes()< 10 ? "0" + datetime.getMinutes() : datetime.getMinutes();
                var second = datetime.getSeconds()< 10 ? "0" + datetime.getSeconds() : datetime.getSeconds();
                var day =year + "-" + month + "-" + date;
                var daytime = hour+":"+minute+":"+second;

                $("#leac").append('<div class="cont">\n' +
                    '                  <div class="img">\n' +
                    '                    <img src="../static/img/header.png" alt="">\n' +
                    '                  </div>\n' +
                    '                  <div class="text">\n' +
                    '                    <p class="tit"><span class="name">'+n.usernick+'</span><span class="data">'+day+'</span></p>\n' +
                    '                    <p class="ct">'+n.leacotsDetail+'</p>\n' +
                    '                  </div>\n' +
                    '                </div>');

            });
        }
    });
});